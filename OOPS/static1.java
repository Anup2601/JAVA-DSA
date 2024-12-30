class static1{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="Anup Mishra";
        s1.rollno=12;
        s1.School="GNIOT";
        s2.School="abcd";
        System.out.println(s2.School);
        System.out.println(s1.name);
        System.out.println(s1.School);
        System.out.println(s1.rollno);
    }
}

class Student{
    String name;
    int rollno;
    static String School;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}