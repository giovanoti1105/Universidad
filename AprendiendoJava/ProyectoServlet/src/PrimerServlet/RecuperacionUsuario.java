package PrimerServlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecuperacionUsuario
 */
@WebServlet("/RecuperacionUsuario")
public class RecuperacionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RecuperacionUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>Respuesta de Usuario</head>");
		out.println("<body>");
		out.println("Usuario:");
		String usu=request.getParameter("usuario");
		out.println(usu);
		out.println("<br>");
		out.println("Clave:");
		String cla=request.getParameter("clave");
		out.println(cla);
		out.println("</body>");
		out.println("</html>");
		
	}

}
