package com.parking;

import java.time.LocalDateTime;

public class Pojazd {
    private String nrTablicRejestracyjnych;
    private LocalDateTime ZglosWjazd;
    private LocalDateTime ZglosWyjazd;
    private TypPojazdu typ;

    public Pojazd(String nrTablicRejestracyjnych, TypPojazdu typ) {
        this.nrTablicRejestracyjnych = nrTablicRejestracyjnych;
        this.typ = typ;
        this.ZglosWjazd = LocalDateTime.now();
        this.ZglosWyjazd = null;
    }

    public String getNrTablicRejestracyjnych() {
        return nrTablicRejestracyjnych;
    }

    public LocalDateTime getZglosWjazd() {
        return ZglosWjazd;
    }

    public LocalDateTime getZglosWyjazd() {
        return ZglosWyjazd;
    }

    public void setZglosWyjazd(LocalDateTime zglosWyjazd) {
        this.ZglosWyjazd = zglosWyjazd;
    }

    public TypPojazdu getTyp() {
        return typ;
    }
}
