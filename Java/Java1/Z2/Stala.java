public class Stala extends Wyrazenie {
    private int c;
    public Stala(int x){
        c=x;
    }
    public int Oblicz(){
        return c;
    }
    public String toString(){
        String w="";
        int a=c;
        int z=1;
        while(a>9){
            a/=10;
            z*=10;
        }
        a=c;
        while(z>0){
            w+=(a/z);
            a=a%z;
            z/=10;
        }
         return w;
    }
  
}