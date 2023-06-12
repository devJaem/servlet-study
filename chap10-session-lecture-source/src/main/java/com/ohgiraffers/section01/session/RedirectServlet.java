package com.ohgiraffers.section01.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession();

        System.out.println("redirect servlet session id : "+session.getId()); //session을 찾아가기 위한 고유의 값 출력

        String firstName = String.valueOf(session.getAttribute("firstName"));
        String lastName= String.valueOf(session.getAttribute("lastName"));

        System.out.println("fristName : "+firstName);
        System.out.println("lastName : "+lastName);

    }
}
