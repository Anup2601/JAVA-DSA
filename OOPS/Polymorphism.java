class Polymorphism{
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.sum(4, 5);
        c.sum(43,43,50);
        Animal a=new Animal();
        a.eat();
        Deer d=new Deer();
        d.eat();
        a.eat();
    }
}

//Compile time or method overload
class Calculator{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

class Animal{
    void eat(){
        System.out.println("eat meat");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}