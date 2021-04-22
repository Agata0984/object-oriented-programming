import java.util.*;
import java.io.*;

public class Komunikat implements java.io.Serializable {
    private Vector<Wydatek> wydatki_planu;
    private Vector<Dochod> dochody_planu;
    private Vector<Wydatek> wydatki_realiow;
    private Vector<Dochod> dochody_realiow;
    static final long serialVersionUID = 7L;
    public Komunikat(){
        wydatki_planu = new Vector<Wydatek>();
        dochody_planu = new Vector<Dochod>();
        wydatki_realiow = new Vector<Wydatek>();
        dochody_realiow = new Vector<Dochod>();
    } 
    public void dodaj_do_planu(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w')
        {
            wydatki_planu.addElement(new Wydatek(kategoria, kwota));
        }
        else
        {
            dochody_planu.addElement(new Dochod(kategoria, kwota));
        }
    }
    public void dodaj_do_realiow(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w')
        {
            if(sprawdzenie(kategoria, kwota)){
                wydatki_realiow.addElement(new Wydatek(kategoria, kwota));
            }
            else{
                System.out.println("przekroczenie planu w kategorii " + kategoria);
            }
        }
        else
        {
            if(sprawdzenie(kategoria, kwota)){
                dochody_realiow.addElement(new Dochod(kategoria, kwota));
            }
            else{
                System.out.println("przekroczenie planu w kategorii " + kategoria);
            }
        }
    }
    public void zmiana_planu(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w')
        {
            if(sprawdzenie(kategoria, kwota)){
                for(int i = 0; i < wydatki_planu.size(); i++){
                    if(wydatki_planu.elementAt(i).kategoria == kategoria){
                        wydatki_planu.elementAt(i).kwota = kwota;
                    }
                }
            }
            else{
                System.out.println("przekroczenie planu w kategorii " + kategoria);
            }
        }
        else
        {
            for(int i = 0; i < dochody_planu.size(); i++){
                if(dochody_planu.elementAt(i).kategoria == kategoria){
                    dochody_planu.elementAt(i).kwota = kwota;
                }
            }
        }
    }
    public void zmiana_realiow(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w')
        {
            for(int i = 0; i < wydatki_realiow.size(); i++){
                if(wydatki_realiow.elementAt(i).kategoria == kategoria){
                    wydatki_realiow.elementAt(i).kwota = kwota;
                }
            }
        }
        else
        {
            for(int i = 0; i < dochody_realiow.size(); i++){
                if(dochody_realiow.elementAt(i).kategoria == kategoria){
                    dochody_realiow.elementAt(i).kwota = kwota;
                }
            }
        }
    }
    public boolean sprawdzenie(String kategoria, float kwota){
        for(int i = 0; i < wydatki_planu.size(); i++){
            if(wydatki_planu.elementAt(i).kategoria == kategoria){
                if(wydatki_planu.elementAt(i).kwota < kwota){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
  
}