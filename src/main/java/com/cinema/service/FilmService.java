package com.cinema.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

import com.cinema.dto.Session;
import com.cinema.enumeradas.EnumGenereFilm;
import com.cinema.dto.Film;

public class FilmService {

    HashMap<Integer, Film> llistaFilms = new HashMap<>();

    public FilmService() {
		/* Dades simples amb objectes predefinits per java
	    Map<Integer, String> llistaFilms = new HashMap();
	    llistaFilms.put(1, "Cronicas de narnia");
	    llistaFilms.put(2, "Rey leon");
	    llistaFilms.put(3, "Ripley");
	    llistaFilms.put(3, "Piratas del caribe");
	    */

        // Dades de pel·lícules

        llistaFilms.put(1, new Film(1, "Crónicas de narnia", "pelicula de terror oooo", "https://picsum.photos/200", EnumGenereFilm.AVENTURES, 7, LocalDate.of(2017, 3, 1)));
        llistaFilms.put(2, new Film(2, "Rey León", "pelicula de terror oooo", "https://picsum.photos/200", EnumGenereFilm.DIBUIXOS, 0, LocalDate.of(2017, 3, 1)));
        llistaFilms.put(3, new Film(3, "Marvel supereroes", "pelicula de terror oooo", "https://picsum.photos/200", EnumGenereFilm.FICCIO, 16, LocalDate.of(2017, 3, 1)));
        llistaFilms.put(4, new Film(4, "Marvel supereroesd", "pelicula de terror oooo", "https://picsum.photos/200", EnumGenereFilm.TERROR, 16, LocalDate.of(2017, 3, 1)));


        // Pelis actuals
        Film peli_5 = new Film(5, "Crónicas de narnia 2", "pelicula de terror oooo", "https://picsum.photos/200", EnumGenereFilm.AVENTURES, 7, LocalDate.of(2017, 3, 1));
        HashMap<Integer, Session> horari_peli_5 = new HashMap<>();
        // sessió i horari

        Session sessionPeli5_1 = new Session(peli_5, LocalTime.of(18, 50), LocalTime.of(20, 50));
        Session sessionPeli5_2 = new Session(peli_5, LocalTime.of(19, 50), LocalTime.of(21, 50));
        Session sessionPeli5_3 = new Session(peli_5, LocalTime.of(22, 50), LocalTime.of(0, 50));

        horari_peli_5.put(1, sessionPeli5_1);
        horari_peli_5.put(2, sessionPeli5_2);
        horari_peli_5.put(3, sessionPeli5_3);
        peli_5.setHorari(horari_peli_5);

        llistaFilms.put(5, peli_5);


        Film peli_6 = new Film(6, "Massa", "pelicula de masa de coca oooo", "https://picsum.photos/200", EnumGenereFilm.TERROR, 18, LocalDate.of(2017, 3, 1));
        HashMap<Integer, String> horari_peli_6 = new HashMap<>();
        // sessió i horari
//        horari_peli_6.put(1, "18.50");
//        horari_peli_6.put(2, "19.50");
//        horari_peli_6.put(3, "22.50");
//        peli_6.setHorari(horari_peli_6);
        llistaFilms.put(6, peli_6);

        Film peli_7 = new Film(7, "Terminator 3", "pelicula de terminarse oooo", "https://picsum.photos/200", EnumGenereFilm.FICCIO, 16, LocalDate.of(2017, 3, 1));
        HashMap<Integer, String> horari_peli_7 = new HashMap<>();
        // sessió i horari
//        horari_peli_7.put(1, "18.50");
//        horari_peli_7.put(2, "19.50");
//        horari_peli_7.put(3, "22.50");
//        peli_7.setHorari(horari_peli_7);
        llistaFilms.put(7, peli_7);

        Film peli_8 = new Film(8, "Los vegadores", "pelicula de vengación oooo", "https://picsum.photos/200", EnumGenereFilm.DIBUIXOS, 16, LocalDate.of(2017, 3, 1));
        HashMap<Integer, String> horari_peli_8 = new HashMap<>();
        // sessió i horari
//        horari_peli_8.put(1, "18.50");
//        horari_peli_8.put(2, "19.50");
//        horari_peli_8.put(3, "22.50");
//        peli_8.setHorari(horari_peli_8);
        llistaFilms.put(8, peli_8);
    }

    public HashMap<Integer, Film> getLlistaFilms() {
        return llistaFilms;
    }

    public void setLlistaFilms(HashMap<Integer, Film> llistaFilms) {
        this.llistaFilms = llistaFilms;
    }


}
