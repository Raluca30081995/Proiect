package com.itfactory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problema2 {

    //Sa se verifice daca un numar citit de la tastatura este palindrom sau nu.
    //Ex.: Numarul 991199 este palindrom, deoarece numarul citit invers este ca, cel initial.

    public static void main(String[] args) {
        int nr = 12;
        String[] strArray = convertNumberInStringArray(nr);

        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
            queue.add(strArray[i]);
            stack.push(strArray[i]);
        }

        boolean isPalindrom = true;

        while (!queue.isEmpty() || !stack.isEmpty()) {

            String x = queue.poll();
            String y = stack.pop();

            if (!x.equals(y)) {
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom) {
            System.out.println("Numarul meu este palindrom");
        } else {
            System.out.println("Numarul meu nu este palindrom");
        }
    }

    private static String[] convertNumberInStringArray(int nr) {

        return new String[0];
    }


}

