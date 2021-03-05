package mgramacho.ood.solid.singleresponsibility;

/**
 * A class should only have one responsibility. Furthermore, it should only have one reason to change.
 *
 * Testing – A class with one responsibility will have far fewer test cases.
 * Lower coupling – Less functionality in a single class will have fewer dependencies.
 * Organization – Smaller, well-organized classes are easier to search than monolithic ones.
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert Cecil Martin", "The mission of this series is...");
        BookPrinter bookPrinter = new BookPrinter();

        bookPrinter.print(book.getName() + " by " + book.getAuthor());
    }
}
