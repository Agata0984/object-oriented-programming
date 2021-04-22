import java.util.*;
import java.io.*;

public class Budzet implements java.io.Serializable {
    public String miesiac;
    private Plan plan;
    private Realia realia;
    private Komunikat komunikat;
    static final long serialVersionUID = 1L;
    public Budzet(String m){
        miesiac=m;
        plan = new Plan();
        realia = new Realia();
        komunikat = new Komunikat();
    }public Budzet(){
        plan = new Plan();
        realia = new Realia();
        komunikat = new Komunikat();
    }
    public void dodaj_do_planu(char rodzaj, String kategoria, float kwota){
        plan.dodaj(rodzaj, kategoria, kwota);
        komunikat.dodaj_do_planu(rodzaj, kategoria, kwota);
    }
    public void dodaj_do_realiow(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w'){
            if(komunikat.sprawdzenie(kategoria, kwota) == true){
                realia.dodaj(rodzaj, kategoria, kwota);
            }
        }
        else{
            if(komunikat.sprawdzenie(kategoria, kwota) == true){
                realia.dodaj(rodzaj, kategoria, kwota);
            }
        }
        komunikat.dodaj_do_realiow(rodzaj, kategoria, kwota);
    }
    public void zmien_w_planie(char rodzaj, String kategoria, float kwota){
        plan.zmiana(rodzaj, kategoria, kwota);
    }
    public void zmien_w_realiach(char rodzaj, String kategoria, float kwota){
        if(rodzaj == 'w'){
            if(komunikat.sprawdzenie(kategoria, kwota) == true){
                realia.zmiana(rodzaj, kategoria, kwota);
            }
        }
        else{
            if(komunikat.sprawdzenie(kategoria, kwota) == true){
                realia.zmiana(rodzaj, kategoria, kwota);
            }
        }
        komunikat.zmiana_realiow(rodzaj, kategoria, kwota);
    }
    public void sprawdzenie_bilansu(){
        System.out.println(plan.sprawdzenie_bilansu());
    }
    public void sprawdzenie_planu(char rodzaj, String kategoria){
        plan.sprawdzenie(rodzaj, kategoria);
    }
    public void sprawdzenie_realiow(char rodzaj, String kategoria){
        realia.sprawdzenie(rodzaj, kategoria);
    }
    public void zapisz_do_pliku(String nazwa) {
      try {
         FileOutputStream fileOut =
         new FileOutputStream(nazwa);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(this);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in " + nazwa + "\n");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
    public Budzet wczytaj_z_pliku(String nazwa) {
      Budzet e = new Budzet();
      try {
         FileInputStream fileIn = new FileInputStream(nazwa);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Budzet) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return null;
      } catch (ClassNotFoundException c) {
         System.out.println("Budzet class not found");
         c.printStackTrace();
         return null;
      }
        return e;
   }
}