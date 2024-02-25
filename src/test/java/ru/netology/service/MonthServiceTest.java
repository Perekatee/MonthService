package ru.netology.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthServiceTest {

    @ParameterizedTest
    @CsvSource({

            "3,10000,3000,20000",
            "2,100000,60000,150000"

    })
    public void testMonthService(int expected, int income, int expenses, int threshold) {
        MonthService Service = new MonthService();

        int actual = Service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }


}
