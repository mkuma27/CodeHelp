package PracticeJavaConcepts;

public class Practice1 {
    int x=888;

    public void marry(){

        System.out.println("Parent Method");
    }

}

class Child extends Practice1 {

    int x=999;


    public  static void main(String[] args){
        Practice1 practice1=new Practice1();
        Practice1 practice11=new Child();
        Child child=new Child();

        practice1.marry();
        practice11.marry();
        child.marry();

        System.out.println(practice1.x);
        System.out.println(practice11.x);
        System.out.println(child.x);

    }

}

