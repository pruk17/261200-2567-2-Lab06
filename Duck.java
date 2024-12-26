public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name){
        this.name = name;
    }

    @Override
    void sound() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb ");
    }

    @Override
    public void glide() {
        System.out.println("hi-yahhh!");
    }

    public String toString(){ // override method toString
        return "DUCK: " + this.name;
    }
    void clean(Animal animal){ // all subclass of animal can use this
        //input could be the subclass of animal, such as Cow, Pig <-- Polymorphism
        System.out.println(this.toString() + " is cleaning " + animal); // this means to Duck
    }


}
