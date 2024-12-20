package ru.netology.FreelanceCalculator.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelanceServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/validdata.csv")
    public void shouldCalculateForValidData(int expected, int income, int expense, int threshold) {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}