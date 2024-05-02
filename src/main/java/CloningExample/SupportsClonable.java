package CloningExample;

import java.util.ArrayList;
import java.util.List;

public class SupportsClonable implements Cloneable{

    private int size;
    private List<Integer> list;

    public SupportsClonable(int size, List<Integer> list) {
        this.size = size;
        this.list = new ArrayList<>(list);
    }
    public List<Integer> getList(){
        return this.list;
    }
    public int getSize(){
        return this.size;
    }


    @Override
    public SupportsClonable clone() {
        try {
            SupportsClonable clone = (SupportsClonable) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            SupportsClonable diff = new SupportsClonable(clone.getSize(), new ArrayList<>(clone.list));
            return diff;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}