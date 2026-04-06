import java.security.PublicKey;

public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Dodano książkę: " + ksiazka);
        } else {
            System.out.println("Biblioteka jest pełna");
        }
    }
    public void wypiszDostepneKsiazki() {
        System.out.println("Dostępne książki:");
        boolean znaleziono = false;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
                znaleziono = true;
            }
        }
        if (!znaleziono) {
            System.out.println("Brak dostępnych książek.");
        }
    }
    public void znajdzKsiazkePoTytule(String tytul) {
        System.out.println("Szukam: " + tytul + "===");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                ksiazki[i].wypiszInfo();
                return;
            }
        }
        System.out.println("Nie znaleziono książki o tytule: " + tytul);
    }
    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }
        System.out.println("Liczba dostępnych książek: " + licznik);
        return licznik;
    }
    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                if (ksiazki[i].isDostepna()) {
                    ksiazki[i].wypozycz();
                    czytelnik.zwiekszLiczbeWypozyczen();
                } else {
                    System.out.println("Ksiazka \"" + tytul + "\" jest już wypożyczona.");
                }
                return;
                }
            }
        System.out.println("Nie znaleziono książki o tytule: " + tytul);
        }

        public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                if (!ksiazki[i].isDostepna()) {
                    ksiazki[i].zwroc();
                    czytelnik.zmniejszLiczbeWypozyczen();
                } else {
                    System.out.println("Książka \"" + tytul + "\" nie była wypożyczona.");
                }
                return;
            }
        }
        System.out.println("Nie znaleziono książki o tytule: " + tytul);
        }
    }

