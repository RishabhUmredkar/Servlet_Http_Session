

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/serv2")
public class servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		String name = (String)session.getAttribute("uname");


		out.print("<!DOCTYPE html>");
		out.print("<!--Code by Divinector (www.divinectorweb.com)-->");
		out.print("<html lang='en'>");
		out.print("<head>");
		    out.print("<meta charset='UTF-8'>");
		    out.print("'<title>')Serv1('</title>'");
		    out.print("<link href='https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700;900&display=swap' rel='stylesheet'>");
		    out.print("<link rel='stylesheet' href='css/style1.css'>");    
		out.print("</head>");
		out.print("<body>");
		    out.print("<header>");
		    out.print("<div class='wrapper'>");
		        out.print("<div class='logo'>");
		            out.print("<img src='https://i.postimg.cc/mg4rWBmv/logo.png' alt='''>");
		        out.print("</div>");
		out.print("<ul class='nav-area'>");
		out.print("<li><a href='index.html'>Login</a></li>");
		out.print("<li><a href='serv2'>Profile</a></li>");
		out.print("<li><a href='#'>Services</a></li>");
		out.print("<li><a href='#'>Portfolio</a></li>");
		out.print("</ul>");
		out.print("</div>");

		out.print("<div class='welcome-text'>");
		        out.print("<h1>");
				out.print("<span>"+name+"<span></h1>");
		out.print("<a href='#'>Contact US</a>");

		    out.print("</div>");
		out.print("</header>");

		out.print("</body>");
		out.print("</html>");
		}
		


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
