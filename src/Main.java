public class Main {
    public static void main(String[] args) {

        //Zadanie 1//
        Ksiazka k1 = new Ksiazka("Diuna", "Frank Herbert", 777, true);
        Ksiazka k2 = new Ksiazka("Gra o Tron", "George R. R. Martin", 777, true);
        Ksiazka k3 = new Ksiazka("Chłopki. Opowieść o naszych babkach", "Joanna Kuciel-Frydryszak", 469, false);

        k1.wypiszInfo();
        k2.wypiszInfo();
        k3.wypiszInfo();

        k1.wypozycz();
        k2.zwroc();
        k3.wypozycz();

        //Zadanie 2//
        Czytelnik c1 = new Czytelnik("Brajan", "Sebowy", 1234, 0);
        Czytelnik c2 = new Czytelnik("Dżon", "Snoł", 1, 900);

        c1.wypiszDane();
        c2.wypiszDane();

        c1.zwiekszLiczbeWypozyczen();
        c1.zwiekszLiczbeWypozyczen();
        c1.zmniejszLiczbeWypozyczen();

        c2.zwiekszLiczbeWypozyczen();
        c2.zmniejszLiczbeWypozyczen();
        c1.zmniejszLiczbeWypozyczen();

        Biblioteka biblioteka = new Biblioteka(7);

        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);

        biblioteka.wypiszDostepneKsiazki();
        biblioteka.znajdzKsiazkePoTytule("Diuna");
        biblioteka.znajdzKsiazkePoTytule("Ferdydurke");
        biblioteka.policzDostepneKsiazki();
    }
}
