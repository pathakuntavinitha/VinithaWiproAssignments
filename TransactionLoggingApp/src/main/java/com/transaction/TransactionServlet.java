package com.transaction;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String amount = req.getParameter("amount");
        if (amount == null) amount = "0";

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Transaction Result</title></head><body>");
            out.println("<h3>Transaction of Rs." + amount + " processed successfully.</h3>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}


/*
http://localhost:8086/TransactionLoggingApp/transaction?amount=1500

Transaction of Rs.1500 processed successfully.

[2025-08-10 19:10:44] Transaction Request from IP: 0:0:0:0:0:0:0:1 | Amount: Rs.1500

*/
