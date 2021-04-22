public class Podziel extends Dzialanie {
    private Wyrazenie a;
    private Wyrazenie b;
    private char znak='/';
    public Podziel(Wyrazenie x, Wyrazenie y){
        a=x;
        b=y;
    }
    public int Oblicz(){
        return a.Oblicz()/b.Oblicz();
    }
    public String toString(){
        String w="";
         w+="(";
         w+=a.toString();
         w+=")/(";
         w+= b.toString();
         w+= ")";
         return w;
    }
  
}