package EXAMPLES.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Students student1 = new Students("ujjwal",21);
//        Students student2 = new Students("Simran",4);
//        Students student3 = new Students("Rahul",15);
//        Students student4 = new Students("Sakshi",12);
//        Students student5 = new Students("Abhishek",1);
//


        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("ujjwal",21));
        studentsList.add(new Students("simran",4));
        studentsList.add(new Students("rahul",15));
        studentsList.add(new Students("sakshi",12));
        studentsList.add(new Students("abhishek",1));

        for (int i = 0; i < studentsList.size()-1; i++) {
            Students student1 = studentsList.get(i);
            Students student2 = studentsList.get(i+1);
            if(student1.compareTo(student2)>0){
                System.out.println(student1.compareTo(student2));
                System.out.println("student 1 -> "+student1.getName()+" is greater than student2 -> "+student2.getName());
                System.out.println();
            } else if (student1.compareTo(student2) == 0) {
                System.out.println(student1.compareTo(student2));
                System.out.println("Both Are equals");
                System.out.println();
            }else {
                System.out.println(student1.compareTo(student2));
                System.out.println("student 2 -> "+student2.getName()+" is greater than student1 -> "+student1.getName());
                System.out.println();
            }
        }

        Collections.sort(studentsList, (o1,o2)-> o1.getRoll$no()- o2.getRoll$no());
        System.out.println(studentsList);
    }


}
