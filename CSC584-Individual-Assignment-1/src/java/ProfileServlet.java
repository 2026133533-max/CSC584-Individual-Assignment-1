package com.profile;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Set encoding untuk sokong aksara khas
        request.setCharacterEncoding("UTF-8");

        // 1. Terima data daripada borang HTML
        String name = request.getParameter("name");
        String studentId = request.getParameter("studentId");
        String programme = request.getParameter("programme");
        String email = request.getParameter("email");
        String hobbies = request.getParameter("hobbies");
        String intro = request.getParameter("intro");

        // 2. Simpan data di dalam Session supaya tidak hilang semasa redirect
        HttpSession session = request.getSession();
        session.setAttribute("userName", name);
        session.setAttribute("userStudentId", studentId);
        session.setAttribute("userProgramme", programme);
        session.setAttribute("userEmail", email);
        session.setAttribute("userHobbies", hobbies);
        session.setAttribute("userIntro", intro);

        // 3. Redirect terus ke halaman profile.jsp (URL akan bertukar kepada profile.jsp)
        response.sendRedirect("profile.jsp");
    }
}