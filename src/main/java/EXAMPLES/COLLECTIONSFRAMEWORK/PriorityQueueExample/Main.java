package EXAMPLES.COLLECTIONSFRAMEWORK.PriorityQueueExample;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new LinkedList<>();
        list.add(new Student(45,56));
        list.add(new Student(70,88));
        list.add(new Student(90,66));
        list.add(new Student(20,30));
        list.add(new Student(88,95));

        PriorityQueue<Student> priorityStudent = new PriorityQueue<>((s1,s2)-> s1.getMaths()- s2.getMaths());
        for (Student student: list) {
            priorityStudent.offer(student);
        }

        List<Student> top3 = new LinkedList<>();
        int top3Count = 0;
        while(!priorityStudent.isEmpty()){
            if(top3Count==3)break;
            top3.add(priorityStudent.poll());
            top3Count++;
        }

        System.out.println(top3);
    }
}
