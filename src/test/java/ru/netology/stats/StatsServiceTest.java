package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void allSalesForYear() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.allSalesForYear(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageOfSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageOfSalesPerMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthOfMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.numberMonthOfMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthOfMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.numberMonthOfMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void amountMonthWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthWithMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void amountMonthWithMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthWithMaxSales(sales);
        assertEquals(expected, actual);
    }
}