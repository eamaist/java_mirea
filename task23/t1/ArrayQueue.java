package task23.t1;

public class ArrayQueue {
    ArrayQueueModule queue;

    public ArrayQueue(ArrayQueueModule queue) {
        this.queue = queue;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public Object element(){
        return queue.element();
    }

    public void enqueue(Object elem){
        queue.enqueue(elem);
    }

    public Object dequeue(){
        return queue.dequeue();
    }

    public void clear(){
        queue.clear();
    }

    public void print(){
        queue.print();
    }

    public static void main(String[] args) {
        System.out.println("Начало:");
        ArrayQueueModule q=new ArrayQueueModule();
        ArrayQueue queue = new ArrayQueue(q);
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
