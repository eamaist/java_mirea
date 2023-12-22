package task23.t1;

import extra.UniPracPack23.ArrayQueue;

public class ArrayQueueModule {
    // Инвариант: items содержит элементы очереди, size - количество элементов,
    // front - индекс первого элемента, rear - индекс следующего свободного элемента.

    private Object[] items = new Object[10];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public boolean isEmpty(){
        return size == 0;
    }//Постусловие: возвращено true, если очередь пуста, иначе false.

    public int size() {
        return size;
    }
    //Постусловие: размер очереди возвращен, очередь не изменена.

    public Object element(){
        if (size == 0){throw new IllegalStateException("Очередь пуста");}
        else {return items[front];}
    }
    //Постусловие: первый элемент в очереди возвращен, очередь не изменена.

    public void enqueue(Object elem){
        if (size+1>items.length) resize();
        items[rear] = elem;
        rear = (rear + 1) % items.length;
        size++;
    }//Постусловие: элемент добавлен в конец очереди

    public Object dequeue(){
        if (size == 0){throw new IllegalStateException("Очередь пуста");}
        else {
            Object element = items[front];
            items[front] = null;
            front = (front + 1) % items.length;
            size--;
            return element;
        }
    } //Постусловие: первый элемент удален и возвращен.

    public void clear(){
        items=new Object[10];
        size = 0;
        front = 0;
        rear = 0;
    }
    //Постусловие: все элементы удалены.
    private void resize(){
        Object[] newItems = new Object[items.length * 2];
        for (int i = 0, j = front; i < size; i++, j = (j + 1) % items.length) {
            newItems[i] = items[j];
        }
        items = newItems;
        front = 0;
        rear = size;

    }

    public void print(){
        for (Object el : items) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Начало:");
        ArrayQueueModule queue = new ArrayQueueModule();
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
