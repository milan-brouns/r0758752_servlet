package view;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DynamischePagina")

public class EersteServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");

        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Dynamische pagina</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a href=\"index.html\" id=\"home\">ga naar Home</a>");
        out.println("<p>Hier is een random getal: " + Math.random()*15 +"</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
