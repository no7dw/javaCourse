// Util.java
package com.wade.service.DAO;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.lang.System;

public class DBUtil 
{
  private static MongoDatabase db;
  private static MongoClient mongoClient ;
  public static void queryCount(MongoCollection<Document> collection){
    //re count to see the change
    Long number = collection.count(new Document("type",2).append("user_id", "54ce55b06f48531b4bd275fc"));
    System.out.printf("query has docs count %d\n", number);
  };
  public static void init()
  {
    // MongoClient mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017),
  //                                     new ServerAddress("localhost", 27018),
  //                                     new ServerAddress("localhost", 27019)));
  // MongoCredential credential = MongoCredential.createCredential(userName, database, password);
  // MongoClient mongoClient = new MongoClient(new ServerAddress(), Arrays.asList(credential));

    mongoClient =  new MongoClient( "localhost" , 27017 );
    db = mongoClient.getDatabase("TestDB");
    System.out.println("Connect to database successfully");
  }
  public static void findUser(String user_id){
    MongoCollection<Document> collection = db.getCollection("user_account_cashflow");
    System.out.println("集合 user_account_cashflow 选择成功");

    //count with two condiction
    queryCount(collection);

    //query inter with two condiction which AND
    FindIterable<Document> findIterable = 
    collection
    .find(new Document("type", 2).append("user_id", "54ce55b06f48531b4bd275fc"))
    .sort(new Document("user_id", 1))
    .limit(3);

    MongoCursor<Document> mongoCursor = findIterable.iterator();  
    while(mongoCursor.hasNext()){  
      System.out.println(mongoCursor.next());  
    } 

    
    //OR
    //FindIterable<Document> iterable = db.getCollection("restaurants").find(
        // new Document("$or", asList(new Document("cuisine", "Italian"),
                // new Document("address.zipcode", "10075"))));

    //cursor output each
          
    //      collection.updateMany(Filters.eq("user_id", "54ce55b06f48531b4bd275fc"),
    //       new Document("$set",new Document("user_id","54cef05579337f164b365051")));

    // Document insertDoc = new Document("type", 2)
    //     .append("user_id", "54ce55b06f48531b4bd275fc")
    //     .append("amount", 100)
    //     .append("remark", "Fri Apr 29 2016 00:00:00 GMT+0800 (CST)本金收益是100元");

    // collection.insertOne(insertDoc);//should return id
    // queryCount(collection);
    // collection.deleteOne(insertDoc);
    // queryCount(collection);


  }
}

