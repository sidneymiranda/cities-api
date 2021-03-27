# Cities API

<hr>

## Descripition

This project is about a REST API developed during the Java Developer bootcamp of Digital Innovation One. 
In it, I provide some endpoints like:

- List of countries
- List of Brazilian states
- List of Brazilian cities
- Calculation of the distance between two Brazilian cities given in:
  - In meters (/ per cube)
  - In miles (/ per points)

The results of the listing are prepared for pagination, just passing the parameters correctly.

Endpoints:

- GET /api/v1/states
- GET /api/v1/states/{id}
- GET /api/v1/cities
- GET /api/v1/cities/{id}
- GET /api/v1/countries
- GET /api/v1/countries/{id}
- GET /api/v1/distances/by-points?from={id}&to={id}
- GET /api/v1/distances/per-cube?from={id}&to={id}
    


## Tools and technologies used
- IntellijIDEA
- Postman
- Java 8
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Heroku
- Project Lombok
- Hibernate Types Library


## Learning

I matured a little more about the use of Spring Boot.
I was able to work with pagination very easily using the Spring Framework
Handling the Java 8 Stream API
Layered design architecture
- Entity
- Resource
- Repository
- Service

## Challenge

- I intend to implement new features for the API, such as calculating the distance between neighborhoods in a city, for example (just an idea).
- A new project as an application that consumes this API.
