package Questions.StacksAndQueues;

public class CustomQueue {
    private final int DEFAULT_CAPACITY = 10;
    private int[] arr;
    private int size = 0;

    public CustomQueue(){
        this.arr = new int[DEFAULT_CAPACITY];
    }
    public CustomQueue(int capacity){
        this.arr = new int[capacity];
    }

    public boolean add(int num){
        if(isFull()){
            int[] temp = new int[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size] = num;
        size++;
        return true;
    }
    public boolean isFull(){
        return arr.length==size;
    }
    public boolean remove()throws CustomQueueException{
        if(isEmpty()){
            throw new CustomQueueException("Empty Queue");
        }
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
        return true;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int peek()throws CustomQueueException{
        if (isEmpty()){
            throw new CustomQueueException();
        }
        return arr[0];
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+"->");
        }
        System.out.print("End]");
        System.out.println();
    }
    public int getSize(){
        return this.size;
    }
}
