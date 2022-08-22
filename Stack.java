package Stack;

import java.util.LinkedList;

public class Stack<T> {
    public LinkedList<T> stack = new LinkedList<>();

    public void push(T data){
        stack.push(data);
    }
    public T peak(){
        return stack.head.data;
    }

    public T pop(){
        return stack.pop();
    }
    public void printStack(){
        stack.show();
    }
} 

