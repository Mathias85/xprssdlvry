# XprssDlvry

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

XprssDlvry is a delivery application based on Skip the Dishes.

### Tech stack
 - Microservices
 - Spark Framework
 - JOOQ
 - Spring Boot
 - Rest API
 - JPA
 - Spring
 - Docker
 - Mysql


### Microservices
 - Auth ( Spring Boot + REST + Spring data jpa + Mysql)
 - Restaurant ( Spark Framework + REST + Spring + JOOQ + Mysql )
 - Orders ( Spark Framework + REST + Spring  + JOOQ + Mysql ) 
 
### Workflow
 - First, the client calls the auth service providing a username and a password to get an Auth Token.
 - Second, the client calls the restaurant service to fetch the restaurant list, then once the restaurant is chosen, calls agains using a restaurant id to fetch it's menu.
 - Lastly, the client uses the Auth Token to call the orders service using the information retrieved on the restaurant service to place an order.

### Missing
 - Some validation
 - Messaging among the services for comunication
 - Creating restaurants, Food and Users
 - Testing using DbUnit

### Testing Instructions
 - Under the _infra folder, run the file ```startup.sh```. It will use docker compose to provision 2 mysql servers. One for the auth service and another for restaurant and orders services. Also, it will insert some information on the database that cab be used for testing purposes.
 - After that, the unit tests can be run.




Developed by: Anderson Mathias