package ru.netology.stats;

public class StatsService {
    public int allSalesForYear(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageOfSalesPerMonth(int[] items) {
        int allSalesInYear = allSalesForYear(items);
        int avgSales = allSalesInYear / items.length;
        return avgSales;
    }

    public int numberMonthOfMaxSales(int[] items) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : items) {
            if (sale >= items[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int numberMonthOfMinSales(int[] items) {
        int minMonth = 0;
        int month = 0;
        for (long sale : items) {
            if (sale <= items[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int amountMonthWithMinSales(int[] items) {
        int average = averageOfSalesPerMonth(items);
        int count = 0;
        for (int item : items) {
            if (item > average) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthWithMaxSales(int[] items) {
        int average = averageOfSalesPerMonth(items);
        int count = 0;
        for (int item : items) {
            if (item < average) {
                count++;
            }
        }
        return count;
    }
}

