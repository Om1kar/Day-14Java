package Stack.Queue;


import java.util.LinkedList;

public class queue<T> {
        public LinkedList<T> queue = new LinkedList<>();

        public void enqueue(T data){
            queue.push(data);
        }

        public T dequeue(){
            if(isEmpty())
                return null;
            else
                return queue.popLast();
        }
        public void printQueue(){
            queue.show();
        }

        public boolean isEmpty(){
            if(queue.head.equals(null))
                return true;
            else
                return false;


        }
}
