package edu.cit.campuscart.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private String name;
    private String pdtDescription;
    private float buyPrice;
    private String imagePath;  
    private String category;
    private String status; 
    private String conditionType;
    
    
    @Column(name = "feedback", length = 1000, columnDefinition = "TEXT")
    private String feedback;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_username", nullable = false)
    @JsonBackReference
    private UserEntity user;

    public ProductEntity() {
        super();
    }

    public ProductEntity(int code, String name, String pdtDescription, float buyPrice, String imagePath, String category, String status, String conditionType, String feedback, UserEntity user) {
        super();
        this.code = code;
        this.name = name;
        this.pdtDescription = pdtDescription;
        this.buyPrice = buyPrice;
        this.imagePath = imagePath;
        this.category = category;
        this.status = status;
        this.conditionType = conditionType;
        this.feedback = feedback;
        this.user = user;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPdtDescription() {
        return pdtDescription;
    }

    public void setPdtDescription(String pdtDescription) {
        this.pdtDescription = pdtDescription;
    }

    public float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(float buyPrice) {
        this.buyPrice = buyPrice;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public String getCategory() {
    	return category;
    }
    
    public void setCategory(String category) {
    	this.category = category;
    }
    
    public String getStatus() {
    	return status;
    }
    
    public void setStatus(String status) {
    	this.status = status;
    }
    
    public String getConditionType() {
    	return conditionType;
    }
    
    public void setConditionType(String conditionType) {
    	this.conditionType = conditionType;
    }
    
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
    
    public String getUserProfilePhoto() {
        return user != null ? user.getProfilePhoto() : null;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

}
