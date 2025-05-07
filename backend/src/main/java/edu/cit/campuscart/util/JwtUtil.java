package edu.cit.campuscart.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.cit.campuscart.config.JwtConfig;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtUtil {
	private final JwtConfig jwtConfig;
    private final Key key;

    @Autowired
    public JwtUtil(JwtConfig jwtConfig) {
        this.jwtConfig = jwtConfig;
        this.key = Keys.hmacShaKeyFor(jwtConfig.getSecret().getBytes());
    }

    public String extractUsername(String token) {
        try {
            String username = extractClaim(token, Claims::getSubject);
            return username;
        } catch (Exception e) {
            throw e;
        }
    }

    public Date extractExpiration(String token) {
        try {
            Date expiration = extractClaim(token, Claims::getExpiration);
            return expiration;
        } catch (Exception e) {
            throw e;
        }
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return claims;
        } catch (Exception e) {
            throw e;
        }
    }

    private Boolean isTokenExpired(String token) {
        try {
            boolean isExpired = extractExpiration(token).before(new Date());
            return isExpired;
        } catch (Exception e) {
            throw e;
        }
    }

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        String token = createToken(claims, username);
        return token;
    }

    private String createToken(Map<String, Object> claims, String subject) {
        try {
            return Jwts.builder()
                    .setClaims(claims)
                    .setSubject(subject)
                    .setIssuedAt(new Date(System.currentTimeMillis()))
                    .setExpiration(new Date(System.currentTimeMillis() + jwtConfig.getExpiration()))
                    .signWith(key, SignatureAlgorithm.HS256)
                    .compact();
        } catch (Exception e) {
            throw e;
        }
    }

    public Boolean validateToken(String token, String username) {
        try {
            final String extractedUsername = extractUsername(token);
            boolean isValid = (extractedUsername.equals(username) && !isTokenExpired(token));
            return isValid;
        } catch (Exception e) {
            return false;
        }
    }
}
