package org.szamalk.nezett;

import org.szamalk.modell.Fetmenyek;
import org.szamalk.modell.Gyujtemeny;
import org.szamalk.modell.Kategoria;
import org.szamalk.modell.Szobrok;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Konzol {


    public static void main(String[] args) {
        new Konzol();
    }

    public Konzol() {
        Gyujtemeny gy = new Gyujtemeny();
        gy.ujGyujtemeny(new Fetmenyek("Festo1","Cim1", Kategoria.EREDETEI,"szürelista", "szén"));
        gy.ujGyujtemeny(new Szobrok("Szobrasz1","cim2",Kategoria.MASOLAT,"márvány", 21));
        konzzolraIr("Gyüjtemények: \n: ");
        konzzolraIr(gy.toString());
        fajlbaIr(gy);
    }

    private  void fajlbaIr(Gyujtemeny gy) {
        try {
            ObjectOutputStream objKi = new ObjectOutputStream((new FileOutputStream("gyujtemenyek.txt")));
            objKi.writeObject(gy);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void konzzolraIr(String szoveg) {
        System.out.print(szoveg);
    }
    
   
}
