public class Main {
    public static void main(String[] args){

        Ksiazka k1 = new Ksiazka("Diuna", "Frank Herbert", 777, true);
        Ksiazka k2 = new Ksiazka("Gra o Tron", "George R. R. Martin", 777, true);
        Ksiazka k3 = new Ksiazka("Chłopki. Opowieść o naszych babkach", "Joanna Kuciel-Frydryszak", 469, false);

        k1.wypiszInfo();
        k2.wypiszInfo();
        k3.wypiszInfo();

        k1.wypozycz();
        k2.zwroc();
        k3.wypozycz();
    }
}
