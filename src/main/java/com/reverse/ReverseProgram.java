package com.reverse;

public class ReverseProgram implements InterfaceX {
    public static void main(String[] args) {
        ReverseProgram reverseProgram = new ReverseProgram();
        System.out.println(reverseProgram.reverse(3455));
    }
    @Override
    public int reverse(int x) {
        int number = x, reverse = 0;
            for( ;number != 0; number=number/10)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
            }
        return reverse;
    }
}