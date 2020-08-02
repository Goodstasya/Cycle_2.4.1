package ru.netology.stats;

public class StatsService {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int SumAllSales() {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public float AvgSales() {
        return (float) SumAllSales() / (float) sales.length;
    }

    public int MonthOfMaxSales() {
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

    public int MonthOfMinSales() {
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

    public int NumOfMonthBelowAvg() {
        int n = 0;
        float avg = AvgSales();

        for (int i = 0; i < sales.length; i++) {
            if ((float)sales[i] < avg) {
                n = n + 1;
            }
        }

        return n;
    }

    public int NumOfMonthAboveAvg() {
        int n = 0;
        float avg = AvgSales();

        for (int i = 0; i < sales.length; i++) {
            if ((float)sales[i] > avg) {
                n = n + 1;
            }
        }

        return n;
    }
}
