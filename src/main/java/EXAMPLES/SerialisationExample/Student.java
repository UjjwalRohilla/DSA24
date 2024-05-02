package EXAMPLES.SerialisationExample;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String email;
    private int age;

    public Student() {
    }

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greetings(){
        if(this.age<18) {
            System.out.println("Can't Access this website. You are under age for this website.");
            return;
        }
        System.out.println("Welcome "+ this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
