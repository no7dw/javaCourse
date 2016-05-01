import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

public class MongoClientTest 
{
	public static void main(String[] args)
	{
		MongoClient mongoClient = new MongoClient();// new MongoClient( "localhost" , 27017 );
		MongoDatabase db = mongoClient.getDatabase("TestDB");
		System.out.println("Connect to database successfully");

		MongoCollection<Document> collection = db.getCollection("user_account_cashflow");
		System.out.println("集合 user_account_cashflow 选择成功");

		FindIterable<Document> findIterable = collection.find(new Document("type", 2));  
         MongoCursor<Document> mongoCursor = findIterable.iterator();  
         while(mongoCursor.hasNext()){  
            System.out.println(mongoCursor.next());  
         }  

	}
}

