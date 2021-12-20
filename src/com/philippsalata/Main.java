package com.philippsalata;

public class Main {

    public static void main(String[] args) {
        {
            MinStack s = new MinStack();

            s.push(6);
            System.out.println(s.peekMin());

            s.push(7);
            System.out.println(s.peekMin());

            s.push(5);
            System.out.println(s.peekMin());

            s.push(3);
            System.out.println(s.peekMin());

            s.pop();
            System.out.println(s.peekMin ());

            s.pop();
            System.out.println(s.peekMin());
        }
    }

}
