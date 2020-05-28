package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TiendaDao;
import entities.Tienda;

/**
 * Servlet implementation class ResgistroController
 */
@WebServlet("/ResgistroController")
public class ResgistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResgistroController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
        String lema = request.getParameter("lema");
        String descripcion = request.getParameter("descripcion");
        String email = request.getParameter("email");
        String clave = request.getParameter("clave");
        String web = request.getParameter("web");
        String imagen = request.getParameter("imagen");
        String propietario = request.getParameter("propietario");
        String facebook = request.getParameter("facebook");

        TiendaDao tDao = new TiendaDao ();
        Tienda t = new Tienda();

        t.setClave(clave);
        t.setDescripcion(descripcion);
        t.setEmail(email);
        t.setFacebook(facebook);
        t.setImagen(email);
        t.setLema(lema);
        t.setNombre(nombre);
        t.setPropietario(propietario);
        t.setWeb(propietario);
        tDao.insert(t);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
