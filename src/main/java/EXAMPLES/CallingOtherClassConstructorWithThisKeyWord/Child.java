package EXAMPLES.CallingOtherClassConstructorWithThisKeyWord;

public class Child extends Parent {
    public Child(){
        this(4);
    }
    public Child(int a ){

    }
    protected Integer printNum(int num){
        System.out.println("Child class printing num value, return the number after decrementing it with one = "+num);
        return num-1;
    }
}
