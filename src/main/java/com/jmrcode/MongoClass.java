// TODO: 
// create a person class
// import it into this class
// find a way to insert it into the database without hard coding
// 

package com.jmrcode;

import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCursor;

import java.net.UnknownHostException;

public class MongoClass {
	public static void main(String[] args) {

			try {
				
				// *****************Connect to server*****************
				
				// Connects to specified server address
				MongoClient mongoClient = new MongoClient();
				// Displays message that connection is established successfully
				System.out.println("Connected Successfully");
				System.out.println("**********************************************************************************");
				// Connect to the specified database
				DB db = mongoClient.getDB("tempTestDb");
				// Connect to a specific collection (if it doesn't exist, it will create it)
				DBCollection coll = db.getCollection("people");

				
				
				
				// ***************** Inserting documents into the collection *****************
				
				// Define documents
				BasicDBObject doc1 = new BasicDBObject("First Name", "Jon")
						.append("Last Name", "Riggs")
						.append("Age", 31)
						.append("Job", "Software Engineer")
						.append("Marital Status", "Married");
				BasicDBObject doc2 = new BasicDBObject("First Name", "Kayla")
						.append("Last Name", "Riggs")
						.append("Age", 31)
						.append("Job", "Teacher")
						.append("Marital Status", "Married");
				BasicDBObject doc3 = new BasicDBObject("First Name", "Tristan")
						.append("Last Name", "Crowder")
						.append("Age", 12)
						.append("Job", "Student")
						.append("Marital Status", "Single");
				BasicDBObject doc4 = new BasicDBObject("First Name", "Harper")
						.append("Last Name", "Riggs")
						.append("Age", 3)
						.append("Job", "Unemployed")
						.append("Marital Status", "Single");
				// Inserts the documents into the collection
				coll.insert(doc1);
				coll.insert(doc2);
				coll.insert(doc3);
				coll.insert(doc4);
				// Displays message that the document was inserted successfully
				System.out.println("Inserted document successfully");
				System.out.println("**********************************************************************************");
				
				
				// ***************** Updating an existing document in the collection *****************
				
//				// Defining a new document to house the updated info
//				BasicDBObject newDoc = new BasicDBObject();
//				// Update new document with the new desired values
//				newDoc.append("$set", new BasicDBObject().append("First Name", "Jonathan"));
//				// Identify the document that need updating
//				BasicDBObject currentDoc = new BasicDBObject().append("First Name", "Jon");
//				// Perform the update
//				coll.update(currentDoc, newDoc, false, false);
//				// Display message that the update was successful
//				System.out.println("Update Successful");
//				System.out.println("**********************************************************************************");
				
				
				// ***************** Deleting a document *****************
				
//				// Identify which document to delete
//				BasicDBObject doc = new BasicDBObject("First Name", "Jonathan");
//				// Delete the document
//				coll.findAndRemove(doc);
//				// Display message that the document was deleted successfully
//				System.out.println("Deleted Successfully");
//				System.out.println("**********************************************************************************");
				
				// Displays collection
				DBCursor cursor = coll.find();
				while(cursor.hasNext()) {
					System.out.println(cursor.next());
				}
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			

		
	}
}
