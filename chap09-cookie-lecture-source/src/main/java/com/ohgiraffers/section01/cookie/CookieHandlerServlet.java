package com.ohgiraffers.section01.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName= req.getParameter("lastName");

        //Parameter 이용하기
        System.out.println("firstName = "+firstName);
        System.out.println("lastName = "+lastName);

        //Attribute 이용하기
        //req.setAttribute("firstName",firstName);
        //req.setAttribute("lastName",lastName);

        //쿠키를 사용하여 전달하기
        //1. 쿠키생성
        //2. 생성한 쿠키의 만료시간 설정
        //3. 응답 헤더에 쿠키를 담는다.
        //4. 응답을 보낸다.

        //쿠키 사용시 주의사항
        //1. 쿠키의 이름은 아스키 문자만을 이용 (askii)
        //2. 쿠키의 이름은 공백, 일부 특수문자 사용불가
        // [ ] ( ) = , " \ ? @ : ;
        //3.쿠키의 이름은 한번 설정시 변경 불가

        Cookie firstNameCookie= new Cookie("fristName",firstName);
        Cookie lastNameCookie=new Cookie("lastName",lastName);
        //쿠키생성

        firstNameCookie.setMaxAge(60*60*24);//분단위
        lastNameCookie.setMaxAge(60*60*24); //1일
        //유효시간 설정

        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);

        resp.sendRedirect("redirect");
    }
}
