package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {

        String str = "Hello world!!!";
        char[] chr = str.toCharArray();

        for (int i = chr.length - 1; i >= 0; i--) {
            System.out.print(chr[i]);
        }
    }
}

