package com.ohgiraffers.section01.xml;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet { //웹에 대한 요청을 처리하는 클래스

    private int initCount=1;
    private int serviceCount=1;
    private int destoryCount=1;


    public LifeCycleTestServlet(){
        System.out.println("LifeCycleTestServlet 인스턴스 생성됨...");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("xml 매핑 init() 메소드 호출: "+initCount);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("xml 매핑 doGet() 메소드 호출 :"+serviceCount);
    }

    @Override
    public void destroy() {
        System.out.println("xml 매핑 destroy() 메소드 호출 : "+ destoryCount);
    }
}
