package com.ohgiraffers.section02.formdata;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/formdata")
public class FormDataTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getCharacterEncoding());

        String name=request.getParameter("name");
        System.out.println("name = "+name);

        int age=Integer.parseInt(request.getParameter("age"));
        System.out.println("age = "+age);

        java.sql.Date birthday=java.sql.Date.valueOf(request.getParameter("birthday"));
        System.out.println("birthday = "+ birthday);
        System.out.println(birthday instanceof java.sql.Date);

        String gender= request.getParameter("gender");
        System.out.println("gender = "+gender);

        String national = request.getParameter("national");
        System.out.println("national = "+national);

        String[] hobbies= request.getParameterValues("hobbies");
        for(String hobby:hobbies) {
            System.out.println("hobby = "+hobby);
        }
    }
}
