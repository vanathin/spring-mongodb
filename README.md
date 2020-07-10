Spring data MongoDB Full text search:

Create DataBase, Collection and index in mongoDB
1. Create DataBase:
    create db : use db_name; EX: use latest
    current db : db
2. Create Collection
    db.createCollection("collection_name"); EX: db.createCollection("product)
3. Create Text Index for full text search
    db.collection_name.createIndex({"fieldName1":"text","fieldName2":"text"}); EX: db.product.createIndex({"name":"text","description":"text"});
 4. Build the application and run it in port number 8080
 5. Swagger url : http://localhost:8080/v2/api-docs
 
 6. This project is reading property files from Git using spring cloug config server. Make sure that spring cloud server should run.
 
        How to consume properties using config server
	        1. Add spring-cloud-starter-config, Actutor dependency in pom.xml
	        2. Add config server URL in bootstrap.properties file as it loads before application.properties file. So on spring boot up time it loads all the property files from                   git using config server
	        3. Any property file committed in git. We have to call actutor's refresh api to get the latest value
                If we use @ConfigurationProperties() no need to use @RefreshScope annotation
  7. Discovery service - make sure eureka server should run
  	To register service in eureka, we need to add following eureka server url in applications.propertiesfile
            eureka.client.serviceUrl.defaultZone:http://localhost:8761/eureka
   	Add @EnableEurekaClient in main method
 

