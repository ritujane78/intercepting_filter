package com.jane.servletdemo.frontcontroller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String uri = request.getRequestURI();
    CommandHelper commandHelper = new CommandHelper();
    Command command = commandHelper.getCommand(uri);
    String view = command.execute(request, response);
    FrontDispatcher dispatcher = new FrontDispatcher();
    dispatcher.dispatch(request,response, view);

  }
}
