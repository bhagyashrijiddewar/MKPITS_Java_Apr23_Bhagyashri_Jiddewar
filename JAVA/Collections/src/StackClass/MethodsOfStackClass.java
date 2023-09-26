package StackClass;

import java.util.Stack;

public class MethodsOfStackClass {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(25);
        stack.add(50);
        stack.add(60);
        System.out.println("Last value can be display : "+stack.peek());
        System.out.println(stack);
        stack.push(90);
        stack.push(100);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}