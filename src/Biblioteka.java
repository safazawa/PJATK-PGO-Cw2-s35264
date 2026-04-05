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
}
