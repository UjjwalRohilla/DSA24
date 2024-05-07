package EXAMPLES.COLLECTIONSFRAMEWORK.PriorityQueueExample;

public class Student{
    private int maths;
    private int science;

    public Student(int maths, int science) {
        this.maths = maths;
        this.science = science;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maths=" + maths +
                ", science=" + science +
                '}';
    }
}
