# Movie API (Spring Boot)

This is a simple **Spring Boot REST API** built to manage movies. I created this project to understand how REST APIs work in real-world applications using Spring Boot, including request handling, validation, and testing with Postman.

The application allows you to:

* Add a movie
* Fetch a movie by its ID

For simplicity, the data is stored **in memory** (no database used).

---

## Tech Stack

* Java 21
* Spring Boot 4
* Maven
* Postman (for API testing)

---

## Project Structure

```
com.pratiksha.movieapi
│
├── controller
│   └── MovieController.java
│
├── service
│   └── MovieService.java
│
├── model
│   └── Movie.java
│
└── MovieApiApplication.java
```

---

## API Endpoints

### 1. Add a Movie

**Endpoint**
`POST /api/movies`

**Request Body (JSON)**

```json
{
  "name": "Inception",
  "description": "Sci-fi movie",
  "rating": 9
}
```

**Response**

* Status: `201 CREATED`
* Returns the saved movie with an auto-generated ID

---

### 2. Get Movie by ID

**Endpoint**
`GET /api/movies/{id}`

**Example**

```
GET /api/movies/1
```

**Response**

```json
{
  "id": 1,
  "name": "Inception",
  "description": "Sci-fi movie",
  "rating": 9.0
}
```

If the movie is not found, the API returns:

* Status: `404 NOT FOUND`

---

## Validation Rules

* Movie name cannot be empty
* Rating is required
* Rating must be between **0 and 10**

Validation is handled using **Jakarta Validation annotations**.

---

## How to Run the Project

1. Clone the repository
2. Open the project in Eclipse or IntelliJ
3. Make sure Java 21 is installed
4. Run `MovieApiApplication.java`
5. Application runs on:

```
http://localhost:8081
```

---

## Testing the API

The API was tested using **Postman**:

* POST request to add a movie
* GET request to fetch a movie by ID

No authentication or environment setup is required.

---

## Note

* This project uses in-memory storage, so data resets on application restart

---

## Author

**Pratiksha Kutal**
