public class Eagle implements Animal {

    private String name;
    private int age;
    private int weight;

    public Eagle(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}

