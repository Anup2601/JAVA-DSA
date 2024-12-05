

class imple{
    public static void main(String[] args) {
        King k=new King();
        k.move();
    }
}
interface Chess{
     void move();
}

class Quieen implements Chess{
    public void move(){
        System.out.println("all dir");
    }
}
class Rook implements Chess{
    public void move(){
        System.out.println("up,down");
    }
}
class King implements Chess{
    public void move(){
        System.out.println("All dir 1 step");
    }
}