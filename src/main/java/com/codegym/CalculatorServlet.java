package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"/calculate"})
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        float firstOperand = Float.parseFloat(request.getParameter("first-operand"));
        float secondOperand = Float.parseFloat(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><title>Kết quả tính toán</title>");
            out.println("<style>body { font-family: Arial, sans-serif; display: flex; justify-content: center; margin-top: 80px; background-color: #f8fafc; }");
            out.println(".card { background: white; padding: 30px; border-radius: 8px; box-shadow: 0 4px 10px rgba(0,0,0,0.1); width: 380px; text-align: center; }");
            out.println("a { display: inline-block; margin-top: 20px; text-decoration: none; padding: 10px 20px; background-color: #1b2a7a; color: white; border-radius: 4px; }</style></head>");
            out.println("<body><div class='card'>");
            out.println("<h2 style='color: #1b2a7a;'>Kết Quả Phép Tính</h2>");

            try {
                float result = Calculator.calculate(firstOperand, secondOperand, operator);
                out.println("<p style='font-size: 20px; margin: 20px 0;'><b>" + firstOperand + " " + operator + " " + secondOperand + " = <span style='color: #27ae60;'>" + result + "</span></b></p>");
            } catch (Exception ex) {
                out.println("<p style='color: red; font-size: 18px; margin: 20px 0;'><b>Lỗi: " + ex.getMessage() + "</b></p>");
            }

            out.println("<a href='index.jsp'>Quay lại</a>");
            out.println("</div></body></html>");
        }
    }
}
