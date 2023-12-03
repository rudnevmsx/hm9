package ru.rudnev.test.java;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /***
     *
     * @param list
     * @return
     * Реализуйте метод, принимающий в качестве аргумента список сотрудников,
     * и возвращающий список их имен;
     */
    public static List<String> getEmloyeesName(List<Employee> list){
        List<String> names = new ArrayList<>();
        for (Employee employee : list){
            names.add(employee.getName());
        }
        return names;
    }

    /***
     *
     * @param list
     * @param value
     * @return
     * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
     * и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
     */
    public static List<String> getMinAge(List<Employee> list, int value){
        List<String> emp = new ArrayList<>();
        for (Employee employee : list){
            if (employee.getAge() >= value){
                emp.add(employee.getName());
            }
        }
        return emp;
    }

    /***
     * @return
     * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст
     * и проверяющий что средний возраст сотрудников превышает указанный аргумент;
     */
    public static boolean checkAverageAge(ArrayList<Employee> employees, int minAverageAge){
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        return employees.size() > 0 && (totalAge / employees.size()) > minAverageAge;
    }

    public static Employee getYoungest(List<Employee> employees){
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }



}
