package EXAMPLES.SerialisationExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("StuOb.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student)ois.readObject();
            student.greetings();
            System.out.println(student.getName());
            System.out.println(student.getEmail());
            System.out.println(student.getAge());
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
    }
}
