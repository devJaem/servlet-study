package com.ohgiraffers.section02.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //session 내부 확인
        HttpSession session = req.getSession();
        Enumeration<String> sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println("sessionNames.nextElement() = " + sessionNames.nextElement());
        }
        //세션의 데이터를 지우는 방법.
        //1. 만료시간 설정
        //2. removeAttribute()로 session의 attribute 제거
        //3. invalidate() 호출시 세션이 만료됨.

        //1. 만료시간
//      session.setMaxInactiveInterval(600);//만료시간 int 초단위
        //2. removeAttribute() 특정값 삭제
        session.removeAttribute("firstName");
        Enumeration<String> remain = session.getAttributeNames();
        while (remain.hasMoreElements()) {
            System.out.println("remain.nextElement() = " + remain.nextElement());
        }
        //3. invalidate() 무효화
        session.invalidate();
        Enumeration<String> remain2 = session.getAttributeNames();
        while (remain2.hasMoreElements()) {
            System.out.println("session.getId() : " + session.getId());

        }

    }
}