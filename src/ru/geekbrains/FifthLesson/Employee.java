package ru.geekbrains.FifthLesson;

public class Employee {

    private String LastName;    // Фамилия
    private String FirstName;   // Имя
    private String Patronymic;  // Отчество
    private int Age;            // Возраст
    private String Position;    // Должность
    private double Salary;      // Зарплата
    private String PhoneNumber; // Номер телефона
    private String Email;       // Электронная почта

    public Employee() {};

    public Employee(String _FirstName, String _LastName, String _Patronymic, int _Age, String _Position, double _Salary, String _PhoneNumber, String _Email) {
        FirstName = _FirstName;
        LastName = _LastName;
        Patronymic = _Patronymic;
        Age = _Age;
        Position = _Position;
        Salary = _Salary;
        PhoneNumber = _PhoneNumber;
        Email = _Email;
    }

    private String getFIO() {
        String str = LastName + " " + FirstName + " " + Patronymic;
        return str;
    }

    public void printEmployee() {
        System.out.println("ФИО:\t" + this.getFIO());
        System.out.println("Возраст:\t" + Age);
        System.out.println("Должность:\t" + Position);
        System.out.println("Зарплата:\t" + Salary);
        System.out.println("Телефон:\t" + PhoneNumber);
        System.out.println("e-mail:\t" + Email);;
    }

}
