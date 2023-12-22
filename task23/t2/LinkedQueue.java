package task23.t2;

import java.util.NoSuchElementException;

public class LinkedQueue<E> extends AbstractQueue<E> {
    private static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data, Node<E> next){
            this.data = data;
            this.next = null;
        }
    }
    private Node<E> front;
    private Node<E> rear;
    public LinkedQueue(){
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e, null);
        if(isEmpty()) front = newNode;
        else rear.next = newNode;
        rear = newNode;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){throw new NoSuchElementException("Очередь пуста");}
        else{
            E data = front.data;
            front = front.next;
            size --;
            if(front == null) rear = null;

            return data;
        }
    }

    @Override
    public E element() {
        if (isEmpty()){throw new NoSuchElementException("Очередь пуста");}
        return front.data;
    }

    @Override
    public void print() {
        Node<E> elem=front;
        while (elem!=null){
            System.out.print(elem.data+" ");
            elem=elem.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        System.out.println("Начало:");
        LinkedQueue<Object> queue = new LinkedQueue<>();
        for (int i = 0; i < 9; i++) queue.enqueue(i);
        queue.print();
        System.out.println("Количество элементов: " + queue.size());
        System.out.println("Первый элемент: " + queue.element());

        System.out.println("Удаление элемента: ");
        queue.dequeue();
        queue.print();
        System.out.println("Количество элементов: " + queue.size());
        System.out.println("Первый элемент: " + queue.element());

        System.out.println("Добавление элементов: ");
        queue.enqueue(9);
        queue.enqueue(10);
        queue.print();
        System.out.println("Первый элемент: " + queue.element());

        System.out.println("Добавление элементов: ");
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.print();

        System.out.println("Удаление всех элементов: ");
        queue.clear();
        queue.print();
        System.out.println("Количество элементов: " + queue.size());
        System.out.println("Очередь пуста?: " + queue.isEmpty());

    }
}
