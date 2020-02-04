package lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
//    public static void main(String[] args) {
//        System.out.print("Minimal number is: ");
//        System.out.println(min(5,2,3));
//    }
//
//    public static int min(int a, int b, int c) {
//
//        if (a > b && b < c) {
//            return b;
//        }
//        return min(a, b, c);
//   }


//   Another solution

    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        int c = 17;
        int m;

        if (a > b){
            m = b;
        } else {
            m = a;
        }
        if (m > c){
            m = c;
        }
        System.out.print("Minimal number is: ");
        System.out.println(m);
    }

}
