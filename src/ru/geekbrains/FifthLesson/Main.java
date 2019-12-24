package ru.geekbrains.FifthLesson;

public class Main {
    public static void main(String[] args) {

        Employee[] EmpArray = new Employee[5];

        EmpArray[0] = new Employee("Иван", "Иванов", "Иванович", 25, "Разработчик", 25000.00d,"9019393881", "vanya@mail.ru");
        EmpArray[1] = new Employee("Петр", "Петров", "Петрович", 26, "Тестировщик", 20000.00d,"9019347644", "petya@mail.ru");
        EmpArray[2] = new Employee("Сидор", "Сидоров", "Сидорович", 27, "Дизайнер", 30000.00d,"9019348426", "sidor@mail.ru");
        EmpArray[3] = new Employee("Алексей", "Алексеев", "Алексеевич", 28, "Инженер", 35000.00d,"9019342476", "lekha@mail.ru");
        EmpArray[4] = new Employee("Петр", "Петров", "Петрович", 26, "Тестировщик", 20000.00d,"9019347644", "petya@mail.ru");

        for (int i = 0; i < EmpArray.length; i++) {
            EmpArray[i].printEmployee();
            System.out.println("-----------------");
        }

    }
}
