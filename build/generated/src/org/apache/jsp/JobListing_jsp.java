package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JobListing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/JobListing.css\">\n");
      out.write("        <title>Job Listing</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div class=\"job-post\">\n");
      out.write("    <h1>Frontend Developer</h1>\n");
      out.write("    <div class=\"company\">TechWorks Inc. · Remote</div>\n");
      out.write("\n");
      out.write("    <p><strong>Type:</strong> Full-Time</p>\n");
      out.write("    <p><strong>Salary:</strong> $70,000 – $90,000/year</p>\n");
      out.write("    \n");
      out.write("    <div class=\"section-title\">Job Description</div>\n");
      out.write("    <p>We are looking for a talented Frontend Developer to join our growing team. You will be responsible for building and maintaining web applications with a strong focus on user experience.</p>\n");
      out.write("\n");
      out.write("    <div class=\"section-title\">Responsibilities</div>\n");
      out.write("    <ul>\n");
      out.write("      <li>Develop responsive web interfaces using HTML, CSS, and JavaScript.</li>\n");
      out.write("      <li>Collaborate with UX/UI designers and backend developers.</li>\n");
      out.write("      <li>Optimize web applications for maximum speed and scalability.</li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <div class=\"section-title\">Requirements</div>\n");
      out.write("    <ul>\n");
      out.write("      <li>2+ years of frontend development experience.</li>\n");
      out.write("      <li>Strong knowledge of React, HTML5, and CSS3.</li>\n");
      out.write("      <li>Understanding of REST APIs and version control (Git).</li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <div class=\"section-title\">How to Apply</div>\n");
      out.write("    <p>Submit your resume and portfolio to <a href=\"mailto:jobs@techworks.com\">jobs@techworks.com</a>.</p>\n");
      out.write("\n");
      out.write("    <a href=\"mailto:jobs@techworks.com\" class=\"apply-button\">Apply Now</a>\n");
      out.write("  </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
