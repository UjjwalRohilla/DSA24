package EXAMPLES;

public class Main {
    private String name;
    private int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    private void printName(){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Main obj = new Main("ujjwal",22);
        obj.printName();
    }
}
