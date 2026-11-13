<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile Summary - CSC584</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h2>Personal Profile Summary</h2>
        <p class="subtitle">Here are the details you submitted</p>

        <div class="profile-card">
            <div class="profile-item">
                <span class="label">Full Name:</span>
                <span class="value">${userName}</span>
            </div>
            <div class="profile-item">
                <span class="label">Student ID:</span>
                <span class="value">${userStudentId}</span>
            </div>
            <div class="profile-item">
                <span class="label">Programme:</span>
                <span class="value">${userProgramme}</span>
            </div>
            <div class="profile-item">
                <span class="label">Email:</span>
                <span class="value">${userEmail}</span>
            </div>
            <div class="profile-item">
                <span class="label">Hobbies:</span>
                <span class="value">${userHobbies}</span>
            </div>
            <div class="profile-item intro-box">
                <span class="label">Self-Introduction:</span>
                <p class="value">${userIntro}</p>
            </div>
        </div>

        <a href="index.html" class="btn btn-back">Edit / Submit Another Profile</a>
    </div>
</body>
</html>