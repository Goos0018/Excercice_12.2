package be.vdab.Excercice12_2;

public class ArrayIndexOutOfBoundsExceptionTestProgram {
    public static void main(String[] args) {

        ArrayIndexOutOfBoundsException aiooe = new ArrayIndexOutOfBoundsException();

        aiooe.askNumber();

        try {
            System.out.println("The " + aiooe.getNumber() + "th month of the year is " + aiooe.getMonths()[aiooe.getNumber() - 1] + " and it has " + aiooe.getDom()[aiooe.getNumber() - 1] + " days.");
        } catch (java.lang.ArrayIndexOutOfBoundsException exc) {
            System.out.println("Wrong number.");
            aiooe.askNumber();
        }
    }
}
