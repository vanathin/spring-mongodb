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
 5. Swaggar url : http://localhost:8080/v2/api-docs
 

