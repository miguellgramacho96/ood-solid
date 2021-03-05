package mgramacho.ood.solid.interfacesegregation;

public class BearCarer implements BearCleaner, BearFeeder{

    public BearCarer() {
    }

    @Override
    public void washTheBear() {
        System.out.println("Cleaning the Bear");
    }

    @Override
    public void feedTheBear() {
        System.out.println("Feeding the Bear");
    }
}
