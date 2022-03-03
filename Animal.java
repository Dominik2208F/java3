public class Animal {
    void makeVoice(){
        System.out.println("Grrr");
    }
    class Pet{  // to jest klasa Pet utworzona w klasie Animal. To pozwala na dostęp w klasie wewnętrznej pet do metod z klasy zewnętrznej animal makevoic()-> nie trzeba ich na nowo definiować jak getname()  ona nie musi być zgodna z nazwą pliku.
        void getName(){
            String name = "raz";
            System.out.println(name);
            makeVoice(); // to jest metoda zabrana z animal, nie trzeba jej na nowo definiować (z zewnątrz do wewnątrz)
        }

    }


}

// DO ANONIMOWEJ normlanie zrobilbyśmy nowa klase kota, która dziedziczyła by po animal, atak już w klasie animal tworzy zmienna = kot, która nadpisane ma zachowanie. TO oszczędza pisanie kodu i tworzenie klas, których i tak chcemy użyc raz.
// DO ANONIMOWEJ Taka konstrukcja jest wygodna na przykład wtedy, gdy chcemy przekazać do metody obiekt, będący instancją klasy, którą użyjemy tylko raz w kodzie. W takiej sytuacji tworzenie klasy a następnie obiektu, który następnie przekazujemy metodzie jest niepotrzebnym mnożeniem kodu