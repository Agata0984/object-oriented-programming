import java.util.*;
import java.io.*;

public class Plan implements java.io.Serializable {
    private Vector<Wydatek> wydatki;
    private Vector<Dochod> dochody;
    private Bilans bilans;
    static final long serialVersionUID = 2L;
    public Plan(){
        wydatki = new Vector<Wydatek>();
        dochody = new Vector<Dochod>();
        bilans = new Bilans();
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
        bilans.dodaj(rodzaj, kwota);
    }
    public void zmiana(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w')
        {
            for(int i = 0; i < wydatki.size(); i++){
                if(wydatki.elementAt(i).kategoria == kategoria){
                    bilans.zmiana(rodzaj, wydatki.elementAt(i).kwota, kwota);
                    wydatki.elementAt(i).kwota = kwota;
                }
            }
        }
        else
        {
            for(int i = 0; i < dochody.size(); i++){
                if(dochody.elementAt(i).kategoria == kategoria){
                    bilans.zmiana(rodzaj, dochody.elementAt(i).kwota, kwota);
                    dochody.elementAt(i).kwota = kwota;
                }
            }
        }
    }
    public float sprawdzenie_bilansu(){
        return bilans.sprawdzenie();
    }
    public void sprawdzenie(char rodzaj, String kategoria){
        if(rodzaj == 'w'){
            for(int i = 0; i < wydatki.size(); i++){
                if(wydatki.elementAt(i).kategoria == kategoria){
                    System.out.println("plan " + kategoria + " " + wydatki.elementAt(i).kwota);
                }
            }
        }
        else{
            for(int i = 0; i < dochody.size(); i++){
                if(dochody.elementAt(i).kategoria == kategoria){
                    System.out.println("plan " + kategoria + " " + dochody.elementAt(i).kwota);
                }
            }        
        }
    }
}