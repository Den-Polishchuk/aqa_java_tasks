package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {

    public static void main(String[] args) {
//        String s = "Vladimir";
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("Den ");
            }
            System.out.println();
        }
  }
}