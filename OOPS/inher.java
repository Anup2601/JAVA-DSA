public class inher {
    public static void main(String[] args) {
        Fish sark=new Fish();
        sark.eat();
        sark.bread();
        sark.swim();
        Bird crow=new Bird();
        crow.bread();
        crow.eat();
        crow.fly();
        Shark s=new Shark();
        s.bread();
        s.eat();
        s.swim();
        s.life();
        Tuna t=new Tuna();
        t.bread();
        t.eat();
        t.swim();
        t.life();
        Peakcock p=new Peakcock();
        p.bread();
        p.eat();
        p.fly();
        p.life();
    }
}
class Animal{
    void eat(){
        System.out.println("eat");
    }
    void bread(){
        System.out.println("bread");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}

class Shark extends Fish{
    void life(){
        System.out.println("45years");
    }
}

class Tuna extends Fish{
    void life(){
        System.out.println("12years");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

class Peakcock extends Bird{
    void life(){
        System.out.println("25year");
    }
}