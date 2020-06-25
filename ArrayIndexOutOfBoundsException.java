package be.vdab.Excercice12_2;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int number;

    public String[] getMonths() {
        return months;
    }

    public int[] getDom() {
        return dom;
    }

    public int getNumber() {
        return number;
    }

    public void askNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number between 1 and 12.");
        number = input.nextInt();
    }
}


