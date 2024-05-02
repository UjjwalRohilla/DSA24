package EXAMPLES.SerialisationExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Nikhil","nikhil@gmail.com",22);
            Student student2 = new Student("Lakshay","lakshay@gmail.com",17);

            FileOutputStream fos = new FileOutputStream("stuOb.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(student1);
            oos.writeObject(student2);

            oos.close();
            fos.close();
            System.out.println("Object state has been transferred to file file ob");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
