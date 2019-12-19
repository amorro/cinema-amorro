<%@ page import="java.util.Iterator" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.cinema.dto.Film" %>
<%@ page errorPage="error/error-page.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.cinema.service.FilmService" %>
<%@ page import="com.cinema.enumeradas.EnumGenereFilm" %>

<%-- 
Aquesta pàgina mostrarà la llista de pel·lícules i filtrarà per gènere

--%>

<%-- Bloc de declaracions de variables i mètodes --%>
<%!


    private static final int NUM_FILM = 5;// màxim de pel·lícules a mostrar

    // Mètode per filtrar per genere
    private Map<Integer, Film> getFilmsPerGenere(EnumGenereFilm genereFilmEnum, Map<Integer, Film> llista) {
        if (genereFilmEnum == null) {
            return llista; //Tornam totes els films.
        } else {
            Map<Integer, Film> films = new HashMap<Integer, Film>();

            for (Map.Entry<Integer, Film> entry : llista.entrySet()) {
                if (genereFilmEnum.equals(entry.getValue().getGenereFilmEnum()))
                    films.put(entry.getKey(), entry.getValue());
            }
            return films;
        }
    }


/*
Alternativas d'iterator
//expressió lamda: datos.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));

        for (Key k : llistaFilm.keySet()) {
            films.put(k, playerCooldowns.get(k) - 20);
        }

        Iterator it = llistaFilm.keySet().iterator();
        while(it.hasNext()){
          Integer key = (Integer)it.next();
          if (genere.equals(llistaFilm.get(key).getGenere()))
                films.put(key, llistaFilm.get(key));
        }
*/

%>
<%
    FilmService serveiFilm = new FilmService();
    HashMap<Integer, Film> llistaFilms = serveiFilm.getLlistaFilms();

    String pGenere = request.getParameter("genere");
    EnumGenereFilm genere = null;
    if (pGenere != null) {
        genere = EnumGenereFilm.valueOf(pGenere);
    }
    System.out.println("genere:" + pGenere);
    Map<Integer, Film> llistaFilmsFiltrada = getFilmsPerGenere(genere, llistaFilms);
    request.setAttribute("llistaFilmsFiltrada", llistaFilmsFiltrada);

%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<%-- Enllaços cagegories/genere--%>
<div class="row mb-2">
    <ul class="nav nav-tabs">
        <li class="nav-item"><a class="nav-link" href="llista_films.jsp">Mostrar todas</a></li>
        <li class="nav-item"><a class="nav-link" href="bd_llista_films.jsp">DB</a></li>
        <li class="nav-item"><a class="nav-link" href="llista_films.jsp?genere=FICCIO">Ciència ficció</a></li>
        <li class="nav-item"><a class="nav-link" href="llista_films.jsp?genere=AVENTURES">Aventures</a></li>
        <li class="nav-item"><a class="nav-link" href="llista_films.jsp?genere=TERROR">Terror</a></li>
        <li class="nav-item"><a class="nav-link" href="llista_films.jsp?genere=DIBUIXOS">Dibuixos</a></li>
    </ul>
</div>

<%-- Mostrar llista pel·lícules per gènere --%>
<div class="row">
    <table class="table table-hover col-4">
        <tbody>

        <%-- Mostrar màxim les pel·lícules de NUM_FILM --%>
        <c:set var="NUM_FILM" value="10" scope="page"/>
        <c:forEach var="film" varStatus="loop" items="${llistaFilmsFiltrada}">
            <c:if test="${loop.index < NUM_FILM}">
                <tr>
                    <td>
                        <a href="detall_film.jsp?codi=<c:out value="${film.key}"/>">
                            <div><c:out value="${film.value.nom}"/></div>
                        </a>
                    </td>
                </tr>
            </c:if>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="footer.jsp" %>