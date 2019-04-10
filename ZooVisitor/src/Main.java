public class Main {

    public static void main(String[] args) {

        Animal zoo = new Zoo();
        zoo.accept(new AnimalCageVisitor());
        System.out.println("_________________________");
        System.out.println();
        zoo.accept(new AnimalFeedVisitor());
    }
}
