public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;

    }
    public void wypiszDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer Karty: " + numerKarty);
        System.out.println("Liczba wypożyczeń: " + liczbaWypozyczen);
        System.out.println("-----------------------");
    }

    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
        System.out.println(imie + " " + nazwisko + " wypożyczył/a książkę. Łączne wypożyczenia: " + liczbaWypozyczen);

    }
    public void zmniejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0) {
            liczbaWypozyczen--;
            System.out.println(imie + " " + nazwisko + " zwrócił/a książkę. Łączne wypożyczenia: " + liczbaWypozyczen);
        } else {
            System.out.println(imie + " " + nazwisko + " nie ma wypożyczeń. ");
        }
}

}
