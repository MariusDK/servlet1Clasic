package p;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConvertLitere")
public class ConvertLitere extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        prossesRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        prossesRequest(request,response);
    }
    private void prossesRequest(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String sir =request.getParameter("sir");
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        out.println("<HTML><HEAD><TITLE>Litere mari</TITLE></HEAD><BODY>");
        out.println("<form method=\"GET\" action=\"ConvertLitere\">");
        out.println("Sir<input type=\"text\" name=\"sir\" value=\"" + sir
                + "\">");
        out.println("<input type=\"submit\" value=\"Convert\">");
        out.println("<H3><input type=\"text\" disabled=\"disabled\" value=\"" + sir.toUpperCase() + "\"></h3></BODY></HTML>");
        out.close();
    }
}
