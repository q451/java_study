package StackAndQueue;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("hello");
        stack.push("world");
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
