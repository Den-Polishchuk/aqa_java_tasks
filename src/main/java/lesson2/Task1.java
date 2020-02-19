package lesson2;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name
 *  - нельзя установить значение age меньше нуля
 *  - максимальныое значение для возраста - 100
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 *  - name не может состоять из одних только пробелов
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

public class Task1 {

    public Task1(){
        System.out.println("Person information:");
    }

    private int age;
    public void setAge(int age) {
        if(age < 0 || age > 100){
            System.out.println("Age Error");
        }else {
            this.age = age;
        }

        if (age < 15){
            this.ageGroup = "Child";
        } else if(age > 15 && age <= 25){
            this.ageGroup = "Student";
        } else if(age > 26 && age <= 65){
            this.ageGroup = "Worker";
        } else if(age > 65 && age <= 100) {
            this.ageGroup = "Pensioner";
        }

    }

    public int getAge() {
        return age;
    }


    private String name;
    public void setName(String name) {
        int len = name.trim().length();
        if(len < 3 || len > 50 || len == 0){
            System.out.println("Name Error");
            this.name = "fail";
        }else {
            this.name = name;
        }
    }

    public String getName() {
        String name2 = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name2;
    }


    String ageGroup;

    private void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getAgeGroup() {
        return this.ageGroup;
    }
}
