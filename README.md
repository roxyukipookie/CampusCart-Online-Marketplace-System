# CampusCart-Online-Marketplace-System
An online marketplace designed to help students browse and manage campus-related products.

<br>

## ⚙️ Setup Instructions
### Clone the Repository
##### 1. Open command prompt and enter this command
```
git clone https://github.com/roxyukipookie/CampusCart-Online-Marketplace-System.git
```
> <i>Note: If cloning repository is already done, skip this step and proceed to next.</i> <br>

### Run the backend
##### 1. Navigate to backend folder
```
cd spring_backend
```

#### 2. Open the frontend_web folder in your desired IDE (e.g. VSCode, IntelliJ, Eclipse, etc.)
#### 3. Run the server. If using VSCode, run this command from the terminal
```
./mvnw spring-boot:run
```
<br>

### Run the frontend
##### 1. Navigate to frontend folder
```
cd campuscart_frontend_web
```
##### 3. Open the campuscart_frontend_web Folder in your desired IDE 
##### 4. Open Terminal to install the dependencies
```
npm install
```
##### 5. Run the server
```
npm start
```

## 📋 Dependencies
### Web Application
```
dependencies {
├── @babel/plugin-proposal-private-property-in-object@7.21.11
├── @emotion/react@11.13.5
├── @emotion/styled@11.13.5
├── @mui/icons-material@6.1.10
├── @mui/lab@6.0.0-beta.18
├── @mui/material@6.1.10
├── @mui/styled-engine-sc@6.1.9
├── @testing-library/jest-dom@6.6.3
├── @testing-library/react@16.0.1
├── @testing-library/user-event@14.5.2
├── axios@1.7.7
├── chart.js@4.4.7
├── react-chartjs-2@5.2.0
├── react-dom@18.3.1
├── react-hot-toast@2.4.1
├── react-router-dom@6.28.0
├── react-scripts@5.0.1
├── react@18.3.1
├── styled-components@6.1.13
├── web-vitals@4.2.4
└── xlsx@0.18.5
}
```

### Backend
```
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-config</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.google.firebase</groupId>
			<artifactId>firebase-admin</artifactId>
			<version>9.2.0</version>
		</dependency>
	</dependencies>
```

<br>

---
## 🚀 Usage Guide
### Web
#### Run the App
##### 1. Open Terminal:
```
npm start
```
##### 2. The app should launch and display the Login Page.
```
app/
├── src/
│   └── Pages/
│       └── LoginRegister/
│           └── AdminLogin.jsx
│           ├── StudentLogin.jsx          #Login Page
│           └── Register.jsx            

```

### Backend
#### Run the App
##### 1. Open Terminal and navigate to the backend project directory:
```
cd spring_backend
```
##### 2. Build and run the Spring Boot application by typing the following command in the terminal.
```
./mvnw spring-boot:run

```
##### 3. The backend should now be running at.
```
http://localhost:8080

backend/
├── src/
│   └── main/
│       ├── java/edu/cit/campuscart/
│       │   ├── controller/         # Handles API requests
│       │   ├── service/            # Business logic layer
│       │   ├── entity/              # Data models / entities
│       │   └── CampuscartApplication.java  # Main entry point
│       └── resources/
│           └── application.properties      # App configurations

```
---
### Developers:
#### NAME: Karen Lean Kay Cabarrubias (Backend Developer)
##### COURSE & YEAR: BSIT 3
I am Karen Lean Kay Cabarrubias  a `3rd year BSIT` student from `Cebu Institute of Technology - University`. I am currently residing in Talisay City, Cebu. In my free time, I enjoy going on walks with my dogs. I aspire to be a developer that can help the community. I am a work in progress and I continue to learn as I live. <br>
<a href="https://github.com/Karyang1004"><img src="https://img.shields.io/badge/GitHub-Profile-blueviolet?style=for-the-badge&logo=github&logoColor=white" alt="Karen's GitHub"></a>

<br>

#### NAME: Chrizza Arnie T. Gales (Mobile Developer)
##### COURSE & YEAR: BSIT 3
I am Chrizza Arnie T. Gales, a `3rd year BSIT` student from `Cebu Institute of Technology - University`.
I currently live in Talisay City, Cebu. My hobbies are listening to music, reading manhwas, manhuas, and mangas, and watching movies or tv series.
I hope to become a developer in the future so I could help my family. To God be the Glory!<br>
<a href="https://github.com/Chizzwiz"><img src="https://img.shields.io/badge/GitHub-Profile-blueviolet?style=for-the-badge&logo=github&logoColor=white" alt="Chrizza's GitHub"></a>

---
## Top Contributors
<a href="https://github.com/roxyukipookie/CampusCart-Online-Marketplace-System/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=eynabdllh/pet-adoption-system" alt="contrib.rocks image" />
</a>

<p align="right">(<a href="#readme-top">back to top</a>)</p>
