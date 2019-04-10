public class AnimalCageVisitor implements AnimalVisitor {

    @Override
    public void visit(Tiger tiger) {
        System.out.println("Cage the tiger who listens to the name: "+tiger.getName());
    }

    @Override
    public void visit(Zebra zebra) {
        System.out.println("Cage the zebra who listens to the name: "+zebra.getName());
    }

    @Override
    public void visit(Eagle eagle) {
        System.out.println("Cage the eagle who listens to the name: "+eagle.getName());
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Cage the elephant who listens to the name: "+elephant.getName());
    }

    @Override
    public void visit(KillerWhale killerWhale) {
        System.out.println("Cage the killer whale who listens to the name: "+killerWhale.getName());
    }

}
