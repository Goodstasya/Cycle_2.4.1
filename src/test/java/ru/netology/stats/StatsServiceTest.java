package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test
    void shouldSumAllSales() {
        StatsService ss = new StatsService();

        int expected = 180;

        int actual = ss.SumAllSales();

        boolean passed = expected == actual;

        assertEquals(expected,actual);
    }

    @Test
    void shouldAvgSales() {
        StatsService ss = new StatsService();

        float expected = 15;

        float actual = ss.AvgSales();

        boolean passed = expected == actual;

        assertEquals(expected,actual);
    }

    @Test
    void shouldMonthOfMaxSales() {
        StatsService ss = new StatsService();

        int expected = 8;

        int actual = ss.MonthOfMaxSales();

        boolean passed = expected == actual;

        assertEquals(expected,actual);
    }

    @Test
    void shouldMonthOfMinSales() {
        StatsService ss = new StatsService();

        int expected = 9;

        int actual = ss.MonthOfMinSales();

        boolean passed = expected == actual;

        assertEquals(expected,actual);
    }

    @Test
    void shouldNumOfMonthBelowAvg() {
        StatsService ss = new StatsService();

        int expected = 5;

        int actual = ss.NumOfMonthBelowAvg();

        boolean passed = expected == actual;

        assertEquals(expected,actual);

    }

    @Test
    void shouldNumOfMonthAboveAvg() {
        StatsService ss = new StatsService();

        int expected = 5;

        int actual = ss.NumOfMonthAboveAvg();

        boolean passed = expected == actual;

        assertEquals(expected,actual);

    }

}
