package org.szamalk.modell;

public class Fetmenyek extends Mutargy{
    private String stilus;
    private String technika;


    public Fetmenyek(String alkoto, String cim, Kategoria ketegoria, String stilus, String technika) {
        super(alkoto, cim, ketegoria);
        this.stilus=stilus;
        this.technika=technika;
    }

    public String getStilus() {
        return stilus;
    }

    public String getTechnika() {
        return technika;
    }
}
