package com.example.demo_6_a_18;

import java.io.*;

import jakarta.servlet.http.*;


public class MonServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Bienvenue sur mon servlet</h1>");
    }
}