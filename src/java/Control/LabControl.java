
package Control;


import Modelo.Lab;
import Modelo.LabPaciente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LabControl", urlPatterns = {"/LabControl"})
public class LabControl extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        LabPaciente labPaciente = new LabPaciente();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
        
        if(accion == null || accion.isEmpty()){
                dispatcher = request.getRequestDispatcher("Lab/index.jps");
                List<Lab> listaLab = labPaciente.listaLab();
                request.setAttribute("lista" , listaLab);
                
            }
        dispatcher.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet ( request, response);
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
   

   

