package com.jane.servletdemo.frontcontroller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewStudentCommand implements Command {
  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) {
    StudentVO vo = new StudentVO(1, "Bob");
    request.setAttribute("studentDetails", vo);
    return "showStudentDetails";
  }
}
