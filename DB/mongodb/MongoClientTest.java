import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoClientTest 
{
	public static void main(String[] args)
	{
		MongoClient mongoClient = new MongoClient();
		MongoDatabase db = mongoClient.getDatabase("test");
	}
}

