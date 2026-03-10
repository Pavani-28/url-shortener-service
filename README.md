
- # URL Shortener Service

A simple backend application that converts long URLs into short, shareable links.
Built using **Java, Spring Boot, and REST APIs** with a layered backend architecture.

---

## 🚀 Features

* Generate short URLs from long URLs
* Redirect users from short URL to the original destination
* Track click count for each shortened link
* Clean layered architecture (Controller → Service → Repository → Model)
* REST API based backend implementation

---

## 🛠 Tech Stack

* **Language:** Java
* **Framework:** Spring Boot
* **Database:** H2 (can be replaced with PostgreSQL/MySQL)
* **Architecture:** Layered Architecture
* **Tools:** Maven, Postman

---

## 📂 Project Structure

```
src/main/java/com/example/urlshortener
│
├── controller
│   └── UrlController.java
│
├── service
│   └── UrlService.java
│
├── repository
│   └── UrlRepository.java
│
├── model
│   └── UrlMapping.java
│
└── UrlShortenerApplication.java
```

---

## 🔗 API Endpoints

### 1. Create Short URL

**POST** `/api/shorten`

Request Body

```
{
  "url": "https://example.com"
}
```

Response

```
{
  "id": 1,
  "originalUrl": "https://example.com",
  "shortCode": "a1b2c3",
  "clickCount": 0
}
```

---

### 2. Redirect to Original URL

**GET** `/{shortCode}`

Example

```
GET /a1b2c3
```

This redirects the user to the original URL.

---

## ▶️ How to Run the Project

1. Clone the repository

```
git clone https://github.com/Pavani-28/url-shortener-service.git
```

2. Open the project in **IntelliJ / VS Code**

3. Run the application

```
UrlShortenerApplication.java
```

4. Test APIs using **Postman**

---

## 📌 Future Improvements

* Add authentication for admin actions
* Store analytics like location and timestamp
* Add frontend interface for URL management

---

## 👩‍💻 Author

**Pavani Muthyam**
