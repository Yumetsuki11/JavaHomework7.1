package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    StatsService service = new StatsService();

    @Test
    public void amountOverallTest() {

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.amountOverall(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountAvgTest() {

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.amountAvg(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsWithSalesBelowAvgTest() {

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsWithSalesBelowAvg(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsWithSalesAboveAvgTest() {

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsWithSalesAboveAvg(sales);

        Assertions.assertEquals(expected, actual);
    }
}
