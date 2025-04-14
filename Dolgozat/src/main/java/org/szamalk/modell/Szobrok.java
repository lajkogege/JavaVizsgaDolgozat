package org.szamalk.modell;

public class Szobrok extends Mutargy implements Comparable<Mutargy> {
    private String anyag;
    private int szazadKeszult;

    public Szobrok(String alkoto, String cim, Kategoria ketegoria, String anyag, int szazadKeszult) {
        super(alkoto, cim, ketegoria);
        this.anyag=anyag;
        this.szazadKeszult=szazadKeszult;
    }



   /* public Szobrok(String alkoto, String cim, Kategoria ketegoria, String anyag, int szazadKeszult) {
        super(alkoto, cim, ketegoria);
        this.anyag=anyag;
        if(szazadKeszult==null){
            this.szazadKeszult=20;
        }else{
            this.szazadKeszult = szazadKeszult;
        }
    }*/

    public int getSzazadKeszult() {
        return szazadKeszult;
    }

    public String getAnyag() {
        return anyag;
    }

    @Override
    public int compareTo(Mutargy alkoto) {
        return this.getAlkoto().compareTo(String.valueOf((alkoto)));
    }




}
