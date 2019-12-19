<%@page import="java.time.LocalDate" %>
<%@page import="com.cinema.dto.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%
    String nomWeb = "CinemaDor";
    int anysAniversari = 30;
    LocalDate dataFundacio = LocalDate.of(1986, 3, 11);
    //Coordenades localització
    float x = 167.23f;
    float y = 168.23f;


    User usuari = (User) session.getAttribute("user");
    request.setAttribute("usuari", usuari);


%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Cinema</title>
</head>
<body class="container">
    <div class="text-center">
        <a class="text-decoration-none text-dark" href="llista_films.jsp">
            <h1><%=nomWeb %>
            </h1>
        </a>
    </div>
    <div class="row">
        <div class="col">
            <c:set var="avui" value="<%=new java.util.Date()%>"/>
            <p>Avui:<c:out value="${avui}"/></p>
        </div>
        <div class="col">
        <c:if test="${usuari==null}">
            <div class="float-right">
                <a href="./login/user-login.jsp" class="btn btn-primary" role="button">LOG in</a>
            </div>
        </c:if>
        <c:if test="${usuari!=null}">
            <div class="float-right">
                <c:out value="${usuari.nomComplet}"/>
            </div>
        </c:if>
        </div>
    </div>