package ru.netology.stats;

public class StatsService {
    public long amountOverall(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long amountAvg(long[] sales) {
        return amountOverall(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int monthsWithSalesBelowAvg(long[] sales) {
        long amountAvg = amountAvg(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale < amountAvg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthsWithSalesAboveAvg(long[] sales) {
        long amountAvg = amountAvg(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale > amountAvg) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
