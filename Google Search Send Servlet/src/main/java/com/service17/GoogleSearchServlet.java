package com.service17;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/GoogleSearchServlet")
public class GoogleSearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        
        if (query != null && !query.trim().isEmpty()) {
            // Redirect to a search results page, e.g., Google search
            response.sendRedirect("https://www.google.com/search?q=" + query);
        } else {
            // Redirect back to the search page if the query is empty
            response.sendRedirect("SearchBar.html");
        }
    }
}
