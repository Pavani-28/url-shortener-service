
# URL Shortener Service (Spring Boot)

Simple backend URL shortener built using Java, Spring Boot, and PostgreSQL (can run with H2 for testing).

## Features
- Generate short URL for long links
- Redirect short URL to original URL
- Track click count

## APIs

### Create Short URL
POST /api/shorten
{
  "url": "https://example.com"
}

### Redirect
GET /{shortCode}

### Get Stats
GET /api/stats/{shortCode}
