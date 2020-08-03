package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public float avgSales(int[] sales) {
        return (float) sumAllSales(sales) / (float) sales.length;
    }

    public int monthOfMaxSales(int[] sales) {
        int m = 0;
        int maxSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                m = i + 1;
                maxSale = sales[i];
            }
        }

        return m;
    }

    public int monthOfMinSales(int[] sales) {
        int m = 0;
        int minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                m = i + 1;
                minSale = sales[i];
            }
        }

        return m;
    }

    public int numOfMonthBelowAvg(int[] sales) {
        int n = 0;
        float avg = avgSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if ((float)sales[i] < avg) {
                n = n + 1;
            }
        }

        return n;
    }

    public int numOfMonthAboveAvg(int[] sales) {
        int n = 0;
        float avg = avgSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if ((float)sales[i] > avg) {
                n = n + 1;
            }
        }

        return n;
    }
}
