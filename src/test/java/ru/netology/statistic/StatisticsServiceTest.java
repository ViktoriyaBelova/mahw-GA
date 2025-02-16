package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxIsFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsInMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 4, 12, 3, 7, 9};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsLast() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 4, 3, 7, 9, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllElementsAreEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 7, 7, 7, 7, 7, 7};
        long expected = 7;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenArrayHasOneElement() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}