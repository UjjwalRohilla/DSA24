package EXAMPLES.COLLECTIONSFRAMEWORK.UnderstandingIterator;

import java.util.Iterator;

public class OurList<T> implements Iterable<T>{
    private T[] Items;
    private int size;
    private final static int MIN_SIZE = 10;

    public OurList() {
        this.Items = (T[]) new Object[MIN_SIZE];
        this.size = 0;
    }
    public OurList(int size){
        this.Items = (T[])new Object[size];
        this.size = 0;
    }
    public void setItem(T item){
        Items[size++] = item;
    }
    public T getItemAtIndex(int index){
        return this.Items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    private class OurListIterator implements Iterator{

        private OurList<T> listIterator;
        private int index;

        public OurListIterator(OurList<T> listIterator) {
            this.listIterator = listIterator;
        }

        @Override
        public boolean hasNext() {
            return index<listIterator.size;
        }

        @Override
        public Object next() {
            return listIterator.getItemAtIndex(index++);
        }
    }
}
