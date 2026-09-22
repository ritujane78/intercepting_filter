package com.jane.servletdemo.interceptingFilter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/homeServlet")
public class UserAgentFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request,
                       ServletResponse response,
                       FilterChain chain)
    throws IOException, ServletException {

    HttpServletRequest httpRequest =
      (HttpServletRequest) request;

    String userAgentHeader =
      httpRequest.getHeader("User-Agent");

    System.out.println("User-Agent: " + userAgentHeader);

    if (userAgentHeader != null &&
      userAgentHeader.contains("Chrome")) {

      chain.doFilter(request, response);

    } else {

      RequestDispatcher dispatcher =
        request.getRequestDispatcher("/badBrowser.jsp");

      dispatcher.forward(request, response);
    }
  }
}
