<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>My movie collection</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link id="cssLink" rel="stylesheet" type="text/css" href="/ThymeleafDemo-1.0/css/main.css"/>
</head>
<body>
<div class="title" style="overflow: auto">
    <img src="/ThymeleafDemo-1.0/images/logo.png" style="float:right;"/>

    <h1>Movie counter page</h1>
</div>

We have the following movies:
<br/>
<br/>

<c:forEach items="${allMovies}" var="movie">
    ${movie.title} <br/>
</c:forEach>
<br/>

Number of movies: ${allMovies.size()}
<br/>
<br/>

<dl>
    <dt><a href="../movie/list.html">Movie List</a></dt>
    <dt><a href="../home.html">Return to Home</a></dt>
</dl>
<br/>
<br/>

<footer>
    <div class="footer">
        <span>Copyright 2013 - G. Mollema (offline)</span>
    </div>
</footer>
</body>
</html>















