package com.example.vognprog;

public class Bil {
    private String personNr;
    private String navn;
    private String adresse;
    private String kjennetegn;
    private String bilmerke;
    private String biltype;

    public Bil(String personNr, String navn, String adresse, String kjennetegn, String bilmerke, String biltype){
        this.personNr = personNr;
        this.navn = navn;
        this.adresse = adresse;
        this.kjennetegn = kjennetegn;
        this.bilmerke = bilmerke;
        this.biltype = biltype;
    }

    public Bil(){}

    public String getPersonNr() {
        return personNr;
    }

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getKjennetegn() {
        return kjennetegn;
    }

    public String getBilmerke() {
        return bilmerke;
    }

    public String getBiltype() {
        return biltype;
    }

    public void setPersonNr(String personNr) {
        this.personNr = personNr;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setKjennetegn(String kjennetegn) {
        this.kjennetegn = kjennetegn;
    }

    public void setBilmerke(String bilmerke) {
        this.bilmerke = bilmerke;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }
}
