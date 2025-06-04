package com.parking;

public class MiejsceParkingowe {
    private String identyfikator;  
    private boolean status;        
    private TypPojazdu typ;       

    public MiejsceParkingowe(String identyfikator, TypPojazdu typ) 
    {
        this.identyfikator = identyfikator;
        this.typ = typ;
        this.status = false; 
    }

    public String getIdentyfikator() 
    {
        return identyfikator;
    }

    public boolean isZajete() 
    {
        return status;
    }

    public void zajmij() 
    {
        this.status = true;
    }

    public void zwolnij() 
    {
        this.status = false;
    }

    public TypPojazdu getTyp() 
    {
        return typ;
    }
}