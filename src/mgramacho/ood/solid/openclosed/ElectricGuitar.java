package mgramacho.ood.solid.openclosed;

public class ElectricGuitar extends Guitar {
    private double outPutJackSize;

    public ElectricGuitar(String make, String model, int volume, double outPutJackSize) {
        super(make, model, volume);
        this.outPutJackSize = outPutJackSize;
    }
}
