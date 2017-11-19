package p;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Adunare")
public class Adunare extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    prossesRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    prossesRequest(request,response);
    }
    private void prossesRequest(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        int a=0;
        int b=0;
        try {
            a = Integer.parseInt(request.getParameter("unu"));
            b = Integer.parseInt(request.getParameter("doi"));
        }
        catch (Exception e)
        {
            a = 0;
            b = 0;
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Suma</title></head><body>");
        out.println("<form method=\"GET\" action=\"Adunare\">");
        out.println("Nr1:<input type=\"text\" name=\"unu\" value=\"" + a
                + "\">");
        out.println("Nr2:<input type=\"text\" name=\"doi\" value=\"" + b
                + "\">");
        out.println("Suma:<input type=\"text\" disabled=\"disabled\" value=\""
                + (a + b) + "\">");
        out.println("<input type=\"submit\" value=\"Aduna\">");
        out.println("</form></body></html>");
        out.close();

    }
}
