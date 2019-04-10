public class AnimalFeedVisitor implements AnimalVisitor{

    @Override
    public void visit(Tiger tiger) {
        System.out.println("Feed the tiger who listens to the name: "+tiger.getName());
    }

    @Override
    public void visit(Zebra zebra) {
        System.out.println("Feed the zebra who listens to the name: "+zebra.getName());
    }

    @Override
    public void visit(Eagle eagle) {
        System.out.println("Feed the Eagle who listens to the name: "+eagle.getName());
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Feed the elephant who listens to the name: "+elephant.getName());
    }

    @Override
    public void visit(KillerWhale killerWhale) {
        System.out.println("Feed the killer whale who listens to the name: "+killerWhale.getName());
    }
}
