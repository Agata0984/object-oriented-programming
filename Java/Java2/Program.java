class Program {

    public static void main(String args[]){

        Budzet budzet = new Budzet("maj");
        budzet.dodaj_do_planu('w', "jedzenie", 500);
        budzet.dodaj_do_realiow('w', "jedzenie", 600);
        budzet.sprawdzenie_planu('w', "jedzenie");
        budzet.zmien_w_planie('w', "jedzenie", 700);
        budzet.sprawdzenie_planu('w', "jedzenie");
        budzet.sprawdzenie_bilansu();
        budzet.zapisz_do_pliku("budzet.ser");
        Budzet test = new Budzet();
        test = test.wczytaj_z_pliku("budzet.ser");
        test.sprawdzenie_bilansu();
        test.dodaj_do_planu('d', "pensja", 3500);
        test.dodaj_do_realiow('d', "pensja", 3800);
        test.zmien_w_realiach('d', "pensja", 3000);
        test.sprawdzenie_realiow('d', "pensja");
        test.sprawdzenie_planu('d', "pensja");
    }
}