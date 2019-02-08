package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class link_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <style>.map-container{\n");
      out.write("                overflow:hidden;\n");
      out.write("                padding-bottom:56.25%;\n");
      out.write("                position:relative;\n");
      out.write("                height:0;\n");
      out.write("            }\n");
      out.write("            .map-container iframe{\n");
      out.write("                left:0;\n");
      out.write("                top:0;\n");
      out.write("                height:100%;\n");
      out.write("                width:100%;\n");
      out.write("                position:absolute;\n");
      out.write("            } </style>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>link</title>\n");
      out.write("    </head>\n");
      out.write("    <body align=\"center\" style=\"background-color: #D8D8D8\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <h1>Link youtube</h1>\n");
      out.write("            <form action=\"Nuevo\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <div class=\"form-group row\" >\n");
      out.write("                    <label for=\"exampleInputPassword1\" class=\"col-sm-2\">Link</label> \n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"link\" placeholder=\"link de youtube\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" >Submit</button> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dropdown col-sm-4\" >\n");
      out.write("                        <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            repetir (veces)\n");
      out.write("                        </button>\n");
      out.write("                        \n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">2</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">5</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">10</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Infinito</a>\n");
      out.write("                             \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <div id=\"fb-root\"></div>\n");
      out.write("                <!--\n");
      out.write("                <script>(function (d, s, id) {\n");
      out.write("                        var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                        if (d.getElementById(id))\n");
      out.write("                            return;\n");
      out.write("                        js = d.createElement(s);\n");
      out.write("                        js.id = id;\n");
      out.write("                        js.src = 'https://connect.facebook.net/es_ES/sdk.js#xfbml=1&version=v3.2';\n");
      out.write("                        fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("                    }(document, 'script', 'facebook-jssdk'));</script>-->\n");
      out.write("\n");
      out.write("                <div class=\"fb-save\" data-uri=\"https://www.instagram.com/facebook/\" data-size=\"large\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    var loadInfo = function (videoId) {\n");
      out.write("                        var gdata = document.createElement(\"script\");\n");
      out.write("                        gdata.src = \"http://gdata.youtube.com/feeds/api/videos/jqOvvpA8VMI?v=2&alt=jsonc&callback=storeInfo\";\n");
      out.write("                        var body = document.getElementsByTagName(\"body\")[0];\n");
      out.write("                        body.appendChild(gdata);\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    var storeInfo = function (info) {\n");
      out.write("                        console.log(info);\n");
      out.write("                    };\n");
      out.write("                     loadInfo()\n");
      out.write("                </script>\n");
      out.write("                <label><script> loadInfo(videoId)</script></label>\n");
      out.write("                <!--\n");
      out.write("             <div id=\"map-container-google-1\" class=\"z-depth-1-half map-container\" style=\"height: 500px\">\n");
      out.write("                 <iframe src=\"https://maps.google.com/maps?q=manhatan&t=&z=13&ie=UTF8&iwloc=&output=embed\" frameborder=\"0\"\n");
      out.write("                         style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("             </div>\n");
      out.write("                -->\n");
      out.write("\n");
      out.write("                <div id=\"fb-root\"></div>\n");
      out.write("                <script>(function (d, s, id) {\n");
      out.write("                        var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                        if (d.getElementById(id))\n");
      out.write("                            return;\n");
      out.write("                        js = d.createElement(s);\n");
      out.write("                        js.id = id;\n");
      out.write("                        js.src = 'https://connect.facebook.net/es_ES/sdk.js#xfbml=1&version=v3.2';\n");
      out.write("                        fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("                    }(document, 'script', 'facebook-jssdk'));</script>\n");
      out.write("                <div class=\"fb-comments\" data-href=\"https://developers.facebook.com/docs/plugins/comments#configurator\" data-width=\"2\" data-numposts=\"5\" width=\"800\"></div>\n");
      out.write("                <h1>");

                    
                    String asd=(String)request.getAttribute("urlrepetir");
                    out.println(asd); 
      out.write("</h1>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("            \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${urlrepetir}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("urlrepetir");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        \n");
          out.write("                        <h4>Youtube</h4>\n");
          out.write("                        <tr>               \n");
          out.write("                        <iframe src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${urlrepetir}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" allowfullscreen=\"\" frameborder=\"1\" height=\"480\" width=\"854\" autoplay=\"1\"></iframe>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
