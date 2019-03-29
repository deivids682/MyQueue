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
        if(isFull()) return false;
        else {

            MyNode newNode = new MyNode();
            newNode.setData(element);
            newNode.setNext(linkToTopElement);
            linkToTopElement = newNode;
            elementCounter++;
            return true;
        }
    }

    public T top() throws Exception{
        if(isEmpty())
            throw (new Exception("Stack is empty and there are not any element"));
        else {
            elementCounter--;
            return linkToTopElement.getData();
        }

    }

    public boolean pop(){

        if (isEmpty()) return false;
        else{
            linkToTopElement = linkToTopElement.getNext();
            return true;
        }
    }

    public void display(){
        MyNode temp = linkToTopElement;

        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }

    }

    public void clear(){
        linkToTopElement = null;
    }
}
