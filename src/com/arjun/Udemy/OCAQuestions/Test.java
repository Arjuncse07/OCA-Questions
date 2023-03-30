package com.arjun.Udemy.OCAQuestions;

public class Test {

    public static void main(String[] args) {
        char[][] ticTacToe = new char[3][3];                  // Line r1
        ticTacToe[1][3] = 'X';                                // Line r2
        ticTacToe[2][2] = 'X';
        ticTacToe[3][1] = 'X';
        System.out.println(ticTacToe.length + " in a row!");  // Line r3
    }
}
