package mgramacho.ood.solid.liskov;

public class LiskovSubstitution {
    public static void main(String[] args) {
        Dog rover = new Dog("bacon");
        Cat bingo = new Cat("fish");

        GiveTreatTo(rover);
        GiveTreatTo(bingo);
    }

    public static void GiveTreatTo(Animal animal) {
        String msg = "You fed the " + animal.getClass().getSimpleName() + " some "  + animal.getFavoriteFood();
        System.out.println(msg);
    }
}
