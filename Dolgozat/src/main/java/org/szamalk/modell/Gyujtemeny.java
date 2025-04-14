package org.szamalk.modell;

import java.util.ArrayList;
import java.util.List;

public class Gyujtemeny {
    private List<Mutargy> mutargy;

    public Gyujtemeny() {
        mutargy = new ArrayList<>();

    }

    public void ujGyujtemeny(Mutargy mutargy){
        this.mutargy.add(mutargy);
    }

    @Override
    public String toString() {
        return "Gyujtemeny{" +
                "mutargy=" + mutargy +
                '}';
    }
}
