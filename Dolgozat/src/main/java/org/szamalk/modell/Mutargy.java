package org.szamalk.modell;

import java.util.UUID;

public class Mutargy {
    private UUID id;
    private String alkoto;
    private String cim;
    private  Kategoria ketegoria;

    public Mutargy(String alkoto, String cim, Kategoria ketegoria) {
        setId();
        this.alkoto = alkoto;
        this.cim = cim;
        this.ketegoria = ketegoria;
    }

    private void setId() {
        this.id=UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getAlkoto() {
        return alkoto;
    }

    public String getCim() {
        return cim;
    }

    public Kategoria getKetegoria() {
        return ketegoria;
    }

    public void setAlkoto(String alkoto) {
        this.alkoto = alkoto;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setKetegoria(Kategoria ketegoria) {
        this.ketegoria = ketegoria;
    }

}
