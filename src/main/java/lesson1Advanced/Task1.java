package lesson1Advanced;

public class Task1 {
    /* Минимум n чисел
    Написать функцию, которая вычисляет минимум из массива чисел.
    */
    public static void main(String[] args) {

        int a[] = {8,6,4,10,18};
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);

    }
}
