package com.cinema.dto;

import java.time.LocalTime;
import java.util.Objects;

public class Session {
    private Film idFilm;
    private LocalTime horaInici;
    private LocalTime horaFinal;

    public Session(Film idFilm, LocalTime horaInici, LocalTime horaFinal) {
        this.idFilm = idFilm;
        this.horaInici = horaInici;
        this.horaFinal = horaFinal;
    }

    public Film getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Film idFilm) {
        this.idFilm = idFilm;
    }

    public LocalTime getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(LocalTime horaInici) {
        this.horaInici = horaInici;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return idFilm.equals(session.idFilm) &&
                horaInici.equals(session.horaInici);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFilm, horaInici);
    }

    @Override
    public String toString() {
        return "Session{" +
                "idFilm=" + idFilm +
                ", horaInici=" + horaInici +
                ", horaFinal=" + horaFinal +
                '}';
    }
}
