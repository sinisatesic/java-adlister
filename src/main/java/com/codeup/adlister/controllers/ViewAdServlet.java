package com.codeup.adlister.controllers;


import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ads/id")
public class ViewAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr);

        //this is creating a list of ads from one ad to see that it works
        Ad ad = DaoFactory.getAdsDao().getById(id);
        List<Ad> fake = new ArrayList<>();
        fake.add(ad);
        System.out.println(ad.getId());
        System.out.println(ad.getTitle());
        System.out.println(ad.getDescription());

        request.setAttribute("ads", fake);
        System.out.println(ad);
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }
}
