public class Main {
    public static void main(String[] args){
    Wyrazenie wyrazenie1 = new Dodaj(new Stala(4), new Zmienna("x"));
    Wyrazenie wyrazenie2 = new Odejmij(new Stala(3), new Stala(2));
    Wyrazenie wyrazenie4 = new Pomnoz(wyrazenie2, new Zmienna("x"));
    Wyrazenie wyrazenie3= new Pomnoz(wyrazenie1, wyrazenie4);
    Wyrazenie wyrazenie =new Pomnoz(new Zmienna("x"), wyrazenie3);
    System.out.print(wyrazenie.toString());
    System.out.print("\n");
    System.out.print(wyrazenie.D());
    System.out.print("\n");
  }
}