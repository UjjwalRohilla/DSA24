package EXAMPLES.ComparableExample;

public class Students implements Comparable<Students>{
    private String name;
    private int roll$no;

    public Students(String name, int roll$no) {
        this.name = name;
        this.roll$no = roll$no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll$no() {
        return roll$no;
    }

    public void setRoll$no(int roll$no) {
        this.roll$no = roll$no;
    }

    @Override
    public int compareTo(Students o) {
        if(this.name.charAt(0)>o.name.charAt(0)){
            return 1;
        } else if (this.name.charAt(0) == o.name.charAt(0)) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", roll$no=" + roll$no +
                '}';
    }
}
