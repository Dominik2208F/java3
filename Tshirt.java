public class Tshirt {
    private TshirtSize size;     //typ danych enum  zmienna rozmiar
    private String manufacturer; // typ danych string zmienna producenty

    public Tshirt(TshirtSize size, String manufacturer) {   // konstruktor który przypisane ma typ danych enum i zmienna i typ danych string i producent
        this.size = size; // to jest przypisanie zmiennej rozmiar ze enuma wyżej do zmiennej z konstrukora
        this.manufacturer = manufacturer; // to jest przypisanie zmiennej producent ze stringa do producenta z konstruktora
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Polex");  // to jest wywołanie zmiennej przez enum
        System.out.println(tshirt.size);
    }
}