package task23.t2;

public interface Queue<E>{
    void enqueue(E e);
    E dequeue();
    E element();
    int size();
    boolean isEmpty();
    void clear();

    void print();
}
