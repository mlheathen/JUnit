package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования 1+6")
    @Timeout(10)
    @Tag("testsSumOfPositive")
    void sumOfPositiveEqualSeven() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Сумма не равна 7");
    }

    @Test
    @DisplayName("Проверка суммирования 1+7")
    @Timeout(10)
    @Tag("testsSumOfPositive")
    void sumOfPositiveEqualEight() {
        Calc calc = new Calc();
        int result = calc.summ(1, 7);
        Assertions.assertEquals(8, result, "Сумма не равна 8");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования")
    @Tag("testsSumOfPositive")
    void sumOfPositive(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Сумма не равна заданным результатам теста");
    }

    @Test
    @DisplayName("Проверка вычитания 10-4")
    @Timeout(10)
    @Tag("testsOfSubtract")
    void sumOfNegativeEqualFour() {
        Calc calc = new Calc();
        int result = calc.subtraction(10, 6);
        Assertions.assertEquals(4, result, "Разность не равна 4");
    }

    @Test
    @DisplayName("Проверка вычитания 13-6")
    @Timeout(10)
    @Tag("testsOfSubtract")
    void sumOfNegativeEqualSeven() {
        Calc calc = new Calc();
        int result = calc.subtraction(13, 6);
        Assertions.assertEquals(7, result, "Разность не равна 7");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"2, 1, 1", "3, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка вычитания")
    @Tag("testsOfSubtract")
    void sumOfNegative(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.subtraction(a, b);
        Assertions.assertEquals(expectedResult, result, "Разность не равна заданным результатам теста");
    }
}