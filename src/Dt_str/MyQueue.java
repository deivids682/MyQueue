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
            if(isEmpty())
                front = 0;
                rear++;
                queue[rear] = element;
                elementCounter++;
                return true;

        }
    }

    public T dequeue() throws Exception{
        if (isEmpty()){
            throw  (new Exception("It is not possible to remove element because queue is empty"));
        }else {
            T temp = queue[front];
            if(elementCounter == 1){
                rear = -1;
                front = -1;
            }
            front++;
            elementCounter--;
            return temp;
        }
    }

    public String toString(){

        String res = "";
        for (int i = front; i <= rear ; i++)
            res = res + queue[i] + " ";

            return res;

    }

    public  void clear(){
        front = -1;
        rear = -1;
        elementCounter = 0;
    }

}
