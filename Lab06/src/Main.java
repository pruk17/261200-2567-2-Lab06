public class Main {
    public static void main(String[] args) {
//      Animal animal = new Animal(); <-- error.  Animal is abstract, cannot instantiate
        Cow wagyu = new Cow();
        Duck donald = new Duck("Donald");
        Pig burin = new Pig();
        Owl hedwig = new Owl();

        PekingDuck JiaTongHeng = new PekingDuck("JTH");
        JiaTongHeng.clean(burin);
        JiaTongHeng.fly();

        donald.clean(wagyu);

        wagyu.sound();
        donald.sound();
        burin.sound();
        hedwig.sound();



    }
}

