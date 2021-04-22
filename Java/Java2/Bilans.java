import java.util.*;
import java.io.*;

public class Bilans implements java.io.Serializable {
    private float wydatki;
    private float dochody;
    static final long serialVersionUID = 4L;
    public Bilans(){
        wydatki = 0;
        dochody = 0;
    } 
    public void dodaj(char rodzaj, float kwota){
        if(rodzaj == 'w')
        {
            wydatki+=kwota;
        }
        else
        {
            dochody+=kwota;
        }
    }
    public void zmiana(char rodzaj, float kwota1, float kwota2){
        if(rodzaj == 'w')
        {
            wydatki-=kwota1;
            wydatki+=kwota2;
        }
        else
        {
            dochody+=kwota2;
            dochody-=kwota1;
        }
    }
    public float sprawdzenie(){
        return dochody-wydatki;
    }
  
}