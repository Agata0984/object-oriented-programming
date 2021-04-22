import java.util.*;
import java.io.*;

public class Realia implements java.io.Serializable {
    private Vector<Wydatek> wydatki;
    private Vector<Dochod> dochody;
    static final long serialVersionUID = 3L;
    public Realia(){ 
        wydatki = new Vector<Wydatek>();
        dochody = new Vector<Dochod>();
    }
    public void dodaj(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w')
        {
            wydatki.addElement(new Wydatek(kategoria, kwota));
        }
        else
        {
            dochody.addElement(new Dochod(kategoria, kwota));
        }
    }
    public void zmiana(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w')
        {
            for(int i = 0; i < wydatki.size(); i++){
                if(wydatki.elementAt(i).kategoria == kategoria){
                    wydatki.elementAt(i).kwota = kwota;
                }
            }
        }
        else
        {
            for(int i = 0; i < dochody.size(); i++){
                if(dochody.elementAt(i).kategoria == kategoria){
                    dochody.elementAt(i).kwota = kwota;
                }
            }
        }
    }
    public void sprawdzenie(char rodzaj, String kategoria){
        if(rodzaj == 'w'){
            for(int i = 0; i < wydatki.size(); i++){
                if(wydatki.elementAt(i).kategoria == kategoria){
                    System.out.println("realia " + kategoria + " " + wydatki.elementAt(i).kwota);
                }
            }
        }
        else{
            for(int i = 0; i < dochody.size(); i++){
                if(dochody.elementAt(i).kategoria == kategoria){
                    System.out.println("realia " + kategoria + " " + dochody.elementAt(i).kwota);
                }
            }        
        }
    }
  
}