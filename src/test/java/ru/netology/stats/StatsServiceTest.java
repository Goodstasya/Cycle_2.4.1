package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test
    void shouldSumAllSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService ss = new StatsService();

        int expected = 180;

        int actual = ss.sumAllSales(sales);

        boolean passed = expected == actual;

        assertEquals(expected,actual);
    }

    @Test
    void shouldAvgSales() {
        StatsService ss = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        float expected = 15;

        float actual = ss.avgSales(sales);

        boolean passed = expected == actual;

        assertEquals(expected,actual);
    }

    @Test
    void shouldMonthOfMaxSales() {
        StatsService ss = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;

        int actual = ss.monthOfMaxSales(sales);

        boolean passed = expected == actual;

        assertEquals(expected,actual);
    }

    @Test
    void shouldMonthOfMinSales() {
        StatsService ss = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;

        int actual = ss.monthOfMinSales(sales);

        boolean passed = expected == actual;

        assertEquals(expected,actual);
    }

    @Test
    void shouldNumOfMonthBelowAvg() {
        StatsService ss = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = ss.numOfMonthBelowAvg(sales);

        boolean passed = expected == actual;

        assertEquals(expected,actual);

    }

    @Test
    void shouldNumOfMonthAboveAvg() {
        StatsService ss = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = ss.numOfMonthAboveAvg(sales);

        boolean passed = expected == actual;

        assertEquals(expected,actual);

    }

}
