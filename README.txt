
Steps to run the web service:

1) Install application server like JBOSS (Wildfly 9).

2) If you install Wildfly you will have yet the "rest_easy" API so I've set this dependency as provided.

3) Create the war using Maven: mvn clean package (or install if you want to install It in the Maven repository).

4) Deploy the war and write the following URL in the browser: 
	
	http://localhost:8080/JAX-RS-rest-service/rest/contact/1234

5) The result has to be something like that (GET operation over the "contact" resource):

	Contact with id 1234: { "age" : 99, "lastName" : "Perez", "name" : "Paco" }
