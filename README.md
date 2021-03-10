# Cities API

## Database configuration

<hr/>

### Postgres

1. At the root of the project, execute:
  
        - docker-compose up -d


2. Populate the database 
   
        git clone https://github.com/chinnonsantos/sql-paises-estados-cidades.git
      
        cd sql-paises-estados-cidades/PostgreSQL

        Windows: docker run -it --rm --net=host -v ${PWD}:/tmp postgres /bin/bash
      
        psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
        psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
        psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql