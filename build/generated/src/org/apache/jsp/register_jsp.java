package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("        <title>Registration Form in HTML CSS</title>\n");
      out.write("        <!---Custom CSS File--->\n");
      out.write("        <link href=\"css/style_RG.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <header>Registration Form</header>\n");
      out.write("            <form action=\"register\" method=\"post\" class=\"form\">\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <label>Full Name</label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter full name\" name=\"name\" required />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <label>Email Address</label>\n");
      out.write("                        <input type=\"email\" placeholder=\"Enter email address\" name=\"email\" required pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" title=\"Wrong format email\"/>\n");
      out.write("\n");
      out.write("                        ");

                            String emailExist = (String) request.getSession().getAttribute("emailExist");
                            if (emailExist != null) {
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-warning\" style=\"color: red\">");
      out.print( emailExist);
      out.write("</div>\n");
      out.write("                        ");

                                // Xóa thuộc tính session để tránh hiển thị lại cảnh báo
                                request.getSession().removeAttribute("emailExist");
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <label>Health Insurance</label>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Health Insurances\" name=\"healthInsurance\" required pattern=\"([0-9]{15})\\b\" title=\"Wrong health insurance\"/>\n");
      out.write("                        ");

                            String healthInsuranceExist = (String) request.getSession().getAttribute("healthInsuranceExist");
                            if (healthInsuranceExist != null) {
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-warning\" style=\"color: red\">");
      out.print( healthInsuranceExist);
      out.write("</div>\n");
      out.write("                        ");

                                // Xóa thuộc tính session để tránh hiển thị lại cảnh báo
                                request.getSession().removeAttribute("healthInsuranceExist");
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <label>Password</label>\n");
      out.write("                        <input type=\"password\" placeholder=\"Enter password\" name=\"password\" required pattern=\".{8,}\" title=\"Must contain at least 8 or more characters\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <label>Phone number</label>\n");
      out.write("                        <input pattern=\"(84|0[3|5|7|8|9])+([0-9]{8})\\b\" type=\"text\" name=\"phone\" placeholder=\"Enter phone number\" required title=\"Wrong phone number\" />\n");
      out.write("                        ");

                            String phonelExist = (String) request.getSession().getAttribute("phonelExist");
                            if (phonelExist != null) {
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-warning\" style=\"color: red\">");
      out.print( phonelExist);
      out.write("</div>\n");
      out.write("                        ");

                                // Xóa thuộc tính session để tránh hiển thị lại cảnh báo
                                request.getSession().removeAttribute("phonelExist");
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <label>Identification</label>\n");
      out.write("                        <input type=\"text\" pattern=\"([0-9]{12})\\b\" title=\"Must contain 12 digits\" placeholder=\"Enter Identification number\" name=\"identification\" required />\n");
      out.write("                        ");

                            String identificationExist = (String) request.getSession().getAttribute("identificationExist");
                            if (identificationExist != null) {
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-warning\" style=\"color: red\">");
      out.print( identificationExist);
      out.write("</div>\n");
      out.write("                        ");

                                // Xóa thuộc tính session để tránh hiển thị lại cảnh báo
                                request.getSession().removeAttribute("identificationExist");
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <label>Birth Date</label>\n");
      out.write("                        <input type=\"date\" placeholder=\"Enter birth date\" required name =\"dob\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"gender-box\">\n");
      out.write("                    <h3>Gender</h3>\n");
      out.write("                    <div class=\"gender-option\">\n");
      out.write("                        <div class=\"gender\">\n");
      out.write("                            <input  value=\"false\" type=\"radio\" id=\"check-male\" name = \"gender\" checked />\n");
      out.write("                            <label for=\"check-male\">Female</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"gender\">\n");
      out.write("                            <input  value=\"true\" type=\"radio\" id=\"check-female\" name = \"gender\" />\n");
      out.write("                            <label for=\"check-female\">Male</label>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"login.jsp\" style=\"margin-left: 40%\"> Login now</a>\n");
      out.write("                    </div>\n");
      out.write("                                           \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" value=\"submit\"  />\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
