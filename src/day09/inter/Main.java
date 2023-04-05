package day09.inter;

public class Main {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();

        bullDog.hunt();
        bullDog.violent();

        Duck duck = new Duck();
        duck.eat();


        // 인터페이스는 다형성을 구현하는 역할을 함
        // 인터페이스도 부모타입으로 사용이 가능함
        Pet[] pets = {
                bullDog, duck
        };

        for (Pet pet: pets ) {
            pet.eat();
        }

        Shark shark = new Shark();
        shark.hunt();
    }
}
