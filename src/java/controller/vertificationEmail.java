package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DAO.MD5;
import DAO.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/vertificationEmail"})
public class vertificationEmail extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet vertificationEmail</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet vertificationEmail at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String vertification = request.getParameter("vertification");

        HttpSession session = request.getSession();
        String otp = (String) session.getAttribute("otp");
        String name = (String) session.getAttribute("name");
        String pass = (String) session.getAttribute("pass");
        String identification = (String) session.getAttribute("identification");
        boolean gender = (boolean) session.getAttribute("gender").equals("true") ? true : false;
        String phone = (String) session.getAttribute("phone");
        String email = (String) session.getAttribute("email");
        String healthInsurance = (String) session.getAttribute("healthInsurance");
        Date dob = (Date) session.getAttribute("dob");
        UserDao db = new UserDao();
        if (vertification.equals(otp)) {
           db.register(name, pass, identification, dob, gender, phone, email, healthInsurance, 1);
            request.getSession().setAttribute("id",(db.findUserByEmail(email)).getIdUser() );
            request.getSession().setAttribute("role", 1);
            request.getSession().removeAttribute("otp");
            request.getSession().removeAttribute("name");
            request.getSession().removeAttribute("pass");
            request.getSession().removeAttribute("identification");
            request.getSession().removeAttribute("gender");
            request.getSession().removeAttribute("phone");
            request.getSession().removeAttribute("email");
            request.getSession().removeAttribute("healthInsurance");
//System.out.println(name+ pass+ identification+ dob+ gender+ phone+ email+ healthInsurance);
            response.sendRedirect("home.jsp");
            return;

        } else {
            request.getSession().setAttribute("wrongVerification", "Wrong Verification");
            request.getRequestDispatcher("verification.jsp").forward(request, response);

        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//       request.getRequestDispatcher("vertification.jsp").forward(request, response);
        response.sendRedirect("verification.jsp");

        //              }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
