package Dt_str;

public class MyQueue<T> {
    private T[] queue;
    private int front = -1;
    private int rear = -1;
    private final int defaultSize = 10;
    private int elementCounter = 0;
    private int size = defaultSize;

    public MyQueue() {
        queue = (T[]) new Object[defaultSize];
    }

    public MyQueue(int size) {

        if (size <= 0) {
            size = defaultSize * (-1);
        }
        queue = (T[]) new Object[size];
    }

    public boolean isEmpty() {
        //(front == -1, rear == -1)
        return (elementCounter == 0) ? true : false;
    }

    public boolean isFull() {
        return (size == elementCounter)? true : false;
    }

    public int geElementCount() {
        return elementCounter;
    }

    public boolean enqueue(T element){
        if(isFull()){
            return false;
        }else {
            //TODO add element
            return  true;
        }
    }

}
