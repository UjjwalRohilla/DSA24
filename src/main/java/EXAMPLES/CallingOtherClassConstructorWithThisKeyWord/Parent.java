package EXAMPLES.CallingOtherClassConstructorWithThisKeyWord;

public class Parent {
    public Parent(){
        System.out.println("This is a parent default constructor");
    }
    public Parent(int a){
        System.out.println("This is a parent constructor with a single parameter");
    }
    protected Integer printNum(int num){
        System.out.println("Parent class printing num value, return the number after incrementing it with one = "+num);
        return num+1;
    }
}
