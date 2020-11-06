import java.util.Scanner;

public class Person {
    public static void showValues (String name, int age) {
        System.out.println("Person Info: ");
        System.out.println("Name");
        System.out.println(name);
        System.out.println("Age");
        System.out.println(age);
    }
    public static void change_age(String name) {
        System.out.println("Change Age");
        Scanner scanner = new Scanner(System.in);
        int age_input = scanner.nextInt();
        showValues (name, age_input);
    }
    public static void age_plus_one(String name, int age) {
        System.out.println("Age Plus One");
        showValues (name, age + 1);
    }
}

class Employee extends Person  {
    public static void employeeSalary (int salary) {
        System.out.println("Salary");
        System.out.println(salary);
    }
    public static void change_salary() {
        System.out.println("Change Salary");
        Scanner scanner = new Scanner(System.in);
        int salary_input = scanner.nextInt();
        employeeSalary (salary_input);
    }
}
class Executive extends Employee  {
    public static void employeeStocks(int stocks) {
        System.out.println("Stocks");
        System.out.println(stocks);
    }
    public static void change_stocks() {
        System.out.println("Change Stocks");
        Scanner scanner = new Scanner(System.in);
        int stocks_input = scanner.nextInt();
        employeeStocks (stocks_input);
    }
    public static void main(String[] args) {
        String name = "dwdw";
        int age = 56;
        int salary = 3409;
        int stocks = 546;
        showValues(name, age);
        change_age(name);
        age_plus_one(name, age);
        employeeSalary(salary);
        change_salary();
        employeeStocks(stocks);
        change_stocks();
    }
}