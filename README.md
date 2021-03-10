# Cities API

## Database configuration

<hr/>

### Postgres

- For up run container:
  
        docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
