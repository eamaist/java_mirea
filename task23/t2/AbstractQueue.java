package task23.t2;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;


    @Override
    public boolean isEmpty(){
        return size==0;
    }

    public void clear(){
        while(!isEmpty()){
            dequeue();
        }
    }

    @Override
    public int size(){
        return size;
    }
}
