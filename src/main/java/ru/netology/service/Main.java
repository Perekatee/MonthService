package ru.netology.service;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        MonthService service = new MonthService();
        System.out.println(service.calculate(100000, 60000, 150000));

    }
}