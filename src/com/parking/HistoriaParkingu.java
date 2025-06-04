package com.parking;

import java.time.LocalDateTime;

public class RekordParkowania 
{
    private String nrRejestracyjny;
    private TypPojazdu typ;
    private LocalDateTime czasWjazdu;
    private LocalDateTime czasWyjazdu;
    private double oplata;

    public RekordParkowania(String nrRejestracyjny, TypPojazdu typ, LocalDateTime czasWjazdu, LocalDateTime czasWyjazdu, double oplata) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.typ = typ;
        this.czasWjazdu = czasWjazdu;
        this.czasWyjazdu = czasWyjazdu;
        this.oplata = oplata;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public LocalDateTime getCzasWjazdu() {
        return czasWjazdu;
    }

    public LocalDateTime getCzasWyjazdu() {
        return czasWyjazdu;
    }

    public double getOplata() {
        return oplata;
    }

    public TypPojazdu getTyp() {
        return typ;
    }
}