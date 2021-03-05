package mgramacho.ood.solid.openclosed;

/**
 * Classes should be open for extension, but closed for modification.
 *
 * Stop ourselves from modifying existing code and causing potential new bugs.
 */
public class OpenClosed {
    public static void main(String[] args) {
        // Simple guitar
        Guitar guitar = new Guitar("abc", "def", 75);

        // Electic guitar
        ElectricGuitar electricGuitar = new ElectricGuitar("ghi", "jkl", 75, 2);
    }
}
