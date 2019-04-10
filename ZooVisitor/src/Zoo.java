public class Zoo implements Animal{

    Animal[] animals;

    public Zoo() {
        animals = new Animal[] {new Tiger("Parker", 4, 210), new Zebra("Bella", 3, 100),
        new Elephant("Boba", 10, 1100), new Eagle("Kyle", 6, 50),
                new KillerWhale("Willy", 3, 2500)};
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].accept(animalVisitor);
        }
    }
}
