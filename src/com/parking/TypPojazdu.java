package com.parking;

public enum TypPojazdu {
    OSOBOWY(8.00),
    DOSTAWCZY(13.50),
    MOTOCYKL(4.00),
    CIEZAROWKA(20.00);

    private final double oplataZaGodzine;

    TypPojazdu(double oplataZaGodzine) {
        this.oplataZaGodzine = oplataZaGodzine;
    }

    public double getOplataZaGodzine() {
        return oplataZaGodzine;
    }
}
