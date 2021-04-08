package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
//@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Simple hello!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surName = request.getParameter("surname");
        String msg = "";
        int hour = Integer.parseInt(request.getParameter("hour"));
        if (hour > 6 && hour < 11) {
            msg = "Good morning ";
        } else if (hour >= 11 && hour < 19)
        {
            msg = "Good afternoon ";
        }
        else {
            msg = "Good night ";
        }


//        response.setContentType("text/html");
//        // code HTML ecrit dans le corps de la reponse
//        response.getWriter().write("<h1>" +msg + " "
//                + name + " " + surName + "</h1>");

        msg += name + " " + surName;
        request.setAttribute("msg", msg);

        this.getServletContext().getRequestDispatcher("/custom-hello.jsp").forward(request, response);

    }
}
