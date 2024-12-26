public abstract class Animal {
    abstract void sound();// when type " sout " will auto typing to "System.out.println"
        // use abstract to tell that Animal can use sound method but not tell what sound method do

    //if not type "private, public or protected" it's "package" all class in same folder can use it
    /*void sound(){  //if subclass not redefine sound it will sound "Hoo Haa"
        System.out.println("Hoo Haa");
    }*/

}
