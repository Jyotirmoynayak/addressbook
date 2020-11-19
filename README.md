# Address Book

This service is used to add an Address Book and get the stored contact information in the response.

# Dependencies
The service require the following:

1. To run the application we will need intelliJ or Spring Tool Suite.
2. We can directly open the application in the IDE and run the application as Spring Boot App or run as Java Application.
3. After the application is up and running url to access Swagger UI after application starts is : http://localhost:8081/swagger-ui.html#/
4. I have used port number 8081 in the properties file, we can change the port number and run the application if 8081 is busy on host machine. 
5. A sample request to add an address book : 
	{
	  "bookName": "book1",
	  "contacts": [
	    {
	      "name": "ravi",
	      "phoneNumber": "8080565655"
	    },{
	      "name": "shyam",
	      "phoneNumber": "7898564544"
	    }
	  ]
	}