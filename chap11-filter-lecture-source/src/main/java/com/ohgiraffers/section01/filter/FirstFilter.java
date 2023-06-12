package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//filter 생성시 jakarta에 Filter iplements 필요
@WebFilter("/first/*") //* /first뒤에 모두 동작
public class FirstFilter implements Filter {

    //필수 오버라이드 메소드
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("Filter doFilter 호출됨...");

        //다을 필터를 호출
        //더이상 표출할 필터가 없다면 서블릿 호출
        chain.doFilter(request,response);

        System.out.println("Servlet 요청 수행 완료!");
    }

    @Override
    public void destroy() {

        System.out.println("destroy 호출됨...");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 호출됨...");
    }
}
