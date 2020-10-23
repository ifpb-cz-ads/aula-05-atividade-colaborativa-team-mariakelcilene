package br.edu.ifpb;

import java.io.*;
import java.io.IOException;
import java.util.Enumeration;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = {"/NumeroText"})
public class NumeroText extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        
        String textoOuNumero = request.getParameter("texto");
        
        try{
           Double valor = (Double.parseDouble(textoOuNumero));
            request.setAttribute("textoNumero", "numero");
        
        } catch (Exception e) {
            request.setAttribute("textoNumero", "texto");
           
        }

        RequestDispatcher view = request.getRequestDispatcher("resultado03.jsp");
        view.forward(request, response);
    }
}