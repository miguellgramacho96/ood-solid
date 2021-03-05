package mgramacho.ood.solid.interfacesegregation;

public class InterfaceSegregation {
    public static void main(String[] args) {
        BearCarer bearCarer = new BearCarer();
        CrazyPerson crazyPerson = new CrazyPerson();

        bearCarer.washTheBear();
        bearCarer.feedTheBear();

        crazyPerson.petTheBear();
    }
}
