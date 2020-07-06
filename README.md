Create DataBase, Collection and index in mongoDB
1. Create DataBase:
    create db : use db_name;
    current db : db
2. Create Collection
    db.createCollection("product);
3. Create Text Index for full text search
    db.collection_name.createIndex({"fieldName1":"text","fieldName2":"text"});
 

