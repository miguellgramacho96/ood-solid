package mgramacho.ood.solid.dependencyinversion.without;

public class BadExample {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        ElectricPowerSwitch electricPowerSwitch = new ElectricPowerSwitch(lightBulb);

        electricPowerSwitch.press();
        electricPowerSwitch.press();
    }
}
