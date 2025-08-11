package com.transaction;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionLoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException { }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        if (request instanceof HttpServletRequest) {
            HttpServletRequest req = (HttpServletRequest) request;
            String amount = req.getParameter("amount");
            String ip = req.getRemoteAddr();
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            System.out.println("[" + timestamp + "] Transaction Request from IP: " + ip + " | Amount: Rs."
                    + (amount != null ? amount : "0"));
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() { }
}
