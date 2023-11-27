package ru.rudnev.test.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        firstTask(1,8);
        List<Integer> list = Arrays.asList(1,6,6,2);
        List<Integer> smth = Arrays.asList(2,1,3,4);
        secondTask(list);
        thirdTask(3, list);
        fourthTask(2, smth);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30));
        employees.add(new Employee("Jane", 30));
        employees.add(new Employee("Bob", 30));

        List<String> names = Employee.getEmloyeesName(employees);
        System.out.println(names);

        List<String> age = Employee.getMinAge(employees, 30);
        System.out.println(age);

        boolean avgAge = Employee.checkAverageAge(employees, 35);
        System.out.println(avgAge);

        Employee em = Employee.getYoungest(employees);
        System.out.println(em);
    }

    /***
     *
     * Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий
     * ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
     *
     */
    public static ArrayList<Integer> firstTask(int min, int max){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max ; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    /***
     *
     * Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
     * значение которых больше 5, и возвращающий сумму;
     *
     */
    public static int secondTask(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) > 5){
                sum += list.get(i);
            }
        }
        return sum;
    }

    /***
     * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
     * метод должен переписать каждую заполненную ячейку списка указанным числом;
     */
    public static List<Integer> thirdTask(int value, List<Integer> list){
        for (int i = 0; i < list.size() ; i++) {
            list.set(i, value);
        }
        return list;
    }

    /***
     * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
     * увеличивающий каждый элемент списка на указанное число;
     */
    public static List<Integer> fourthTask(int value, List<Integer> smth){
        for (int i = 0; i < smth.size() ; i++) {
            smth.set(i, smth.get(i) + value);
        }
        return smth;
    }

}