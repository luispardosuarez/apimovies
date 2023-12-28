# Movies API Project

This project is part of an assignment undertaken at Factoría F5 during the bootcamp. The primary goal was to develop a RESTful API incorporating all the fundamental CRUD operations (GET, POST, PUT, and DELETE). Additionally, the task required establishing One-to-Many and Many-to-Many relationships between tables.

An extra objective involved creating a sixth endpoint, distinct from the standard getAll, getById, post, update, and delete functionalities. This additional endpoint facilitates retrieving a movie by its title.

The project is implemented using the Spring framework and managed with Maven.

## Run Local Server Command

mvn spring-boot:run

## Spring Dependencies
- Spring Data JPA
- Spring Boot DevTools
- H2 Database
- Spring Web

## Language
- Java

## Endpoints
1. **Get All Movies**
   - Endpoint: `/movies`
   - Method: GET
   
2. **Get Movie by Id**
   - Endpoint: `/movies/{id}`
   - Method: GET

3. **Add a Movie**
   - Endpoint: `/movies`
   - Method: POST

4. **Update Movie**
   - Endpoint: `/movies/{id}`
   - Method: PUT

5. **Delete Movie**
   - Endpoint: `/movies/{id}`
   - Method: DELETE

6. **Get Movie by Title or Genre**
   - Endpoint: `/movies/bytitle/{title}`
   - Method: GET
  
## Visual Representation of Classes and Tables

![Tabla_movies](https://github.com/luispardosuarez/apimovies/assets/144243096/1e8ee6fc-7b14-4731-abea-9479c26b0e00)


Feel free to run the local server command and explore the various endpoints to interact with the Movies API.
