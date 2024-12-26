public class PekingDuck extends Duck{
    PekingDuck(String name){
        super(name);// simulate Constructor of duck
    }

    @Override
    void clean(Animal animal) {
        System.out.println( this + " clean & crispy");
    }
}

