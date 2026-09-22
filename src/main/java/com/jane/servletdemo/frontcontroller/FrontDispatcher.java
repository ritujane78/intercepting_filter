package com.jane.servletdemo.frontcontroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class FrontDispatcher {
  public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {
    if(view !=null){
      RequestDispatcher dispatcher = request.getRequestDispatcher(mapPageToView(view));
      try {
        dispatcher.forward(request,response);
      } catch (ServletException e) {
        throw new RuntimeException(e);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

    }
  }

  private String mapPageToView(String view) {
    if(view.equals("showStudentDetails.do")){
      return "viewStudentDetails.jsp";
    }
    return view;
  }
}
