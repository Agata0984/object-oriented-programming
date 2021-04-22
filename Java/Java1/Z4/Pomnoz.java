public class Pomnoz extends Dzialanie {
    private Wyrazenie a;
    private Wyrazenie b;
    private char znak='*';
    public Pomnoz(Wyrazenie x, Wyrazenie y){
        a=x;
        b=y;
    }
    public int Oblicz(){
        return a.Oblicz()*b.Oblicz();
    }
    public String toString(){
        String w="";
         w+="(";
         w+=a.toString();
         w+=")*(";
         w+= b.toString();
         w+= ")";
         return w;
    }
    public Wyrazenie D(){
        return new Dodaj(new Pomnoz(a, b.D()), new Pomnoz(b, a.D()));
    }
  
}