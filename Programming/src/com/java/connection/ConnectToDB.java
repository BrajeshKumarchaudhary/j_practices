package com.java.connection;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoCredential;  
public class ConnectToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a Mongo client 
	      MongoClient mongo = new MongoClient(); 
	   
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", "myDb", 
	         "password".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("myDb"); 
	      System.out.println("Credentials ::"+ credential);  

	}

}
