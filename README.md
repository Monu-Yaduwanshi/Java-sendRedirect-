# sendRedirect-
This repository contains a Java Servlet project that demonstrates how to implement a simple search functionality using Java Servlets, with redirection to Google search results. The project is developed using Eclipse IDE, deployed on an Apache Tomcat server, and structured to easily integrate with MySQL for database interactions if needed.

Project Overview:
This project demonstrates how to create a servlet that processes user input from an HTML search form and redirects to Google's search engine with the provided query. It shows how to handle GET requests and manage HTTP responses through Java Servlets.

Features:
Google Search Integration: The servlet takes user input from a search bar and redirects the user to Google with the search query.
Dynamic Redirection: If the search query is empty, the servlet redirects the user back to the search page.
Servlet Mapping: The web.xml file maps the servlet URL pattern, making it accessible via the /SearchServlet endpoint.
Responsive HTML Form: The project includes a simple, responsive HTML search bar, styled using CSS, that sends a GET request to the servlet.
Technologies Used:
Java Servlets (Jakarta Servlet API): Servlets handle HTTP requests and responses, performing redirection based on user input.
MySQL Database (Future Integration): Though not fully implemented in this example, the project is structured for database operations using MySQL.
Apache Tomcat Server: The servlet is deployed on Apache Tomcat, which handles the web server functionality.
Eclipse IDE: The project is developed using the Eclipse IDE, making it easy to modify, extend, and manage.
How to Run:
Clone the repository and import the project into Eclipse IDE.
Deploy the project on Apache Tomcat.
Access the search form via the /SearchServlet endpoint, enter a query, and the servlet will redirect to Google with the search results.
