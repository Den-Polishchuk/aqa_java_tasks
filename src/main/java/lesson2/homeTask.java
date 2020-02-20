package main.java.lesson2;

public class homeTask {
    public static void main(String[] args) {
        lesson2.Task1 task = new lesson2.Task1();
        task.setAge(25);
        task.setName("denys");

        System.out.println("Age: " + task.getAge());
        System.out.println("Name: " + task.getName());
        System.out.println("AgeGroup: " + task.getAgeGroup());
    }
}
