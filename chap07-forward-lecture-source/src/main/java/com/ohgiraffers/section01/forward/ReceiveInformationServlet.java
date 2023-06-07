package com.ohgiraffers.section01.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String password= req.getParameter("password");

        System.out.println("userId = "+userId);
        System.out.println("password = "+password);

        //데이터베이스 조회
        //추가적인 로직...
        //새로고침 요청해도 모든 로직을 다 거치게 됨

        //1. 직접전송 (사용안함)
//        new PrintLoginSuccessServlet(userId).doPost(req,resp);

        //attribute를 이용한 값 전달
        req.setAttribute("userId", userId);

        //어디로 보낼지 지정후 전송
        RequestDispatcher rd= req.getRequestDispatcher("print");
        rd.forward(req,resp);
    }
}
