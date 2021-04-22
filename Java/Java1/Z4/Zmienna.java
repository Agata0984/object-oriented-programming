public class Zmienna extends Wyrazenie {
    private int c;
    private String d;
    public Zmienna(String x){
        d=x;
    }
    public void Podstaw(int l){
        c=l;
    }
    public int Oblicz(){
        return c;
    }
    public String toString(){
         return d;
    }
    public Wyrazenie D(){
        return new Stala(1);
    }
  
}