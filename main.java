public class main{   // klasy anonimowe i wewnętrzne
    public static void main(String[] args) {
        
    Animal kot = new Animal(){   // wyglada jak tworzenie obiektu ale dostaje ciała {}   // anonimowa -> raczej się tego nie używa.
    @Override
        void makeVoice(){
            System.out.println("Meowww Meoww");
        }
    
    };  // to jest zamkniecie ciała objektu ( nowość)
       kot.makeVoice();

       Animal kot2 = new Animal();

       kot2.makeVoice();  // ten już nie widzi meoww, dlatego że jest zwykłym objektem utworzym od animal czyli widzi tylko makevoice() z animal. Kot widzi , bo jest kotem  z nadpisaną metoda makevoic() przypisana tylko do tego objektu.(kopią)
        // i teraz pozostaje dualizam, bo tworzymy sobie koty od ANimal. Lepiej by było oczywiście stowrzyć klasę kot i z niej zrobić dziedzicenie makevoic() z animals. no wtedy juz by nie trzeba było nadpisywać i nie robiłby się burdel.



       // Animal.pet pet = Animal.new pet(); odwołanie do klasy wewnętrznej.. -> to się raczej rzadko robisz w ogóle stosuje anonimowe i wewnętrzne.




    }
}

