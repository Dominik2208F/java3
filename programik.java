import java.util.Scanner;

public class programik {
    public static void main(String[] args){

   // for( int i=0; i<10; i++) {    //no to spowoduje że będzisz mógł to wklepać 10 razy 
   // Scanner scan = new Scanner(System.in);
   // System.out.println("Jak masz na imię?");
   // String firstName = scan.nextLine() ;
   // System.out.println("Witaj " + firstName);
   // }
    

    String imie ="Arkadiusz";

    Scanner scan = new Scanner(System.in);
    System.out.println("Jak masz na imię?");
    String x = scan.nextLine();

    while( imie = "Arkadiusz"){

        System.out.println("Podaj pełne imię mojego kumpla" + "to" + x + "niejestprawidłowe");
    }
}
}
