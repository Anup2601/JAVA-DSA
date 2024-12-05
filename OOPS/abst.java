class abst{
    public static void main(String[] args) {
        Horse h=new Horse();
        h.legs();
        h.eat();
        Hean h1=new Hean();
        h1.eat();
        h1.legs();
        Mastang m= new Mastang();
        System.out.println(h.color="hguj");
    }
}
abstract class Animal{
    String color="red";
    
    public Animal() {
        System.out.println("Animal constuuctor is called");
    }
    
    void eat(){
        System.out.println("eat");
    }
    abstract void legs();
}
class Horse extends Animal{

    public Horse() {
        System.out.println("Horse constuuctor is called");
    }

    void changeColor(){
        color="blue";
    }
    
    void legs(){
        System.out.println("4 legs");
    }
}
class Mastang extends Horse{

    public Mastang() {
        System.out.println("Mastang constuuctor is called");
    }
    
}
class Hean extends Animal{
    void legs(){
        System.out.println("2 legs");
    }
}