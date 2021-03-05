package mgramacho.ood.solid.interfacesegregation;

public class CrazyPerson implements BearPetter{

    public CrazyPerson() {
    }

    @Override
    public void petTheBear() {
        System.out.println("Auch!");
    }
}
