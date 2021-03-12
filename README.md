# Cities API

## Database configuration

<hr/>

## Postgres

### At the root of the project, run:
     
         docker-compose up -d


### Populate the database
   
   Clone the project:
   
         git clone https://github.com/chinnonsantos/sql-paises-estados-cidades.git
      
   Enter in folder
   
         cd sql-paises-estados-cidades/PostgreSQL
   
   Map the volume to the container: 
   
      docker run -it --rm --net=host -v ${PWD}:/tmp postgres /bin/bash
       
   Copy the scripts into the container:    
        
      psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
      psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
      psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

      CREATE EXTENSION cube;
      CREATE EXTENSION earthdistance;

### To access the postgres, run:
         
         docker exec -it postgres /bin/bash

         psql -h localhost -U postgres_user_city cities