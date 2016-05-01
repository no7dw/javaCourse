import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.lang.System;

public class MongoClientTest 
{
	public static void main(String[] args)
	{
		MongoClient mongoClient = new MongoClient();// new MongoClient( "localhost" , 27017 );
		MongoDatabase db = mongoClient.getDatabase("TestDB");
		System.out.println("Connect to database successfully");

		MongoCollection<Document> collection = db.getCollection("user_account_cashflow");
		System.out.println("集合 user_account_cashflow 选择成功");

		//count with two condiction
		Long number = collection.count(new Document("type",2).append("user_id", "54ce55b06f48531b4bd275fc"));
		System.out.printf("query has docs count %d\n", number);
		//query inter with two condiction
		FindIterable<Document> findIterable = 
		collection
		.find(new Document("type", 2).append("user_id", "54ce55b06f48531b4bd275fc"))
		.sort(new Document("user_id", 1))
		.limit(3);

		//cursor output each
         MongoCursor<Document> mongoCursor = findIterable.iterator();  
         while(mongoCursor.hasNext()){  
            System.out.println(mongoCursor.next());  
         }  
         collection.updateMany(Filters.eq("user_id", "54ce55b06f48531b4bd275fc"),
         	new Document("$set",new Document("user_id","54cef05579337f164b365051")));

		//re count to see the change
		number = collection.count(new Document("type",2).append("user_id", "54ce55b06f48531b4bd275fc"));
		System.out.printf("query has docs count %d\n", number);


	}
}

