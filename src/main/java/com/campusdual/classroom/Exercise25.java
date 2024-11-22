package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();

        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");

        return stack;

    }

    public static void printAndEmptyStack(Stack<String> stack) {

        // Imprimir respetando el orden LIFO
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

    }

    public static void main(String[] args) {

    }



}
