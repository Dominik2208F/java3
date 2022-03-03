public class java30 {  // equalls i ==
    public static void main(String[] args){
        animal1 a1= new animal1();
        animal1 a2 = new animal1();

        a1.name = "Tom";
        a2.name = "Tom";

        System.out.println(a1==a2); // wyrzuci ci false, choć są takie same. bo to są obiekty z klas.  Dlatego że mamy dwie instancje( dwie zmienne z klasy animal) każda z nich ma dwie różne referencje(pamieć) mimo że napis jest ten sam.
        System.out.println(a1.equals(a2));  // nadal false // trzeba dokonać porównania na klasie a nie w main
    }// po wpisaniu metody quals stają się one równe sobie :)
}
