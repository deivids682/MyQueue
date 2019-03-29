package Dt_str;

public class MyLinkedStack <T>{

    private MyNode<T> linkToTopElement = null;
    private int elementCounter = 0;

    public MyLinkedStack() {
    }

    public boolean isEmpty(){
        return (elementCounter == 0)? true : false;
    }

    public boolean isFull(){
        try {
            MyNode temp = new MyNode();

        }catch (OutOfMemoryError e){
            return true;
        }
        return false;
    }

    public int getElementCounter(){
        return elementCounter;
    }

    public boolean push(T element){

    }

    public T top(){

    }

    public boolean pop(){

    }
}
