public class cl{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="red";
        p1.tip=5;
        p1.color="green";
        System.out.println(p1.color);
        System.out.println(p1.tip);
        Student s1=new Student();
        s1.name="Anup";
        s1.calPercentage(97, 98, 89);
        System.out.println(s1.percentage);
        Bank b1=new Bank();
        b1.name="Anup Mishra";
        b1.setPassword(213435);
        System.out.println(b1.name);
    }
}

class Bank{
    String name;
    private int password;
    void setPassword(int pwd){
        password=pwd;
    }
}

class Pen{
    String color;
    int tip;
    void changeColor( String newColor){
        color=newColor;
    }

    void changeTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    float percentage;
    void calPercentage(int math,int physics,int chem){
        percentage=(math+physics+chem)/3;
    }
}