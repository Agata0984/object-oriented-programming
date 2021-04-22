public class Main {
    public static void main(String[] args){
    Wyrazenie wyrazenie1 = new Dodaj(new Stala(4), new Zmienna("x"));
    System.out.print(wyrazenie1.toString());
    System.out.print("\n");
    Wyrazenie wyrazenie2 = new Odejmij(new Stala(3), new Stala(2));
    System.out.print(wyrazenie2.toString());
    System.out.print("\n");
    Wyrazenie wyrazenie3= new Pomnoz(wyrazenie1, wyrazenie2);
    System.out.print(wyrazenie3.toString());
    System.out.print("\n");
    Wyrazenie wyrazenie =new Podziel(new Stala(12), new Stala(4));
    System.out.print(wyrazenie.Oblicz());
    System.out.print("\n");
  }
}