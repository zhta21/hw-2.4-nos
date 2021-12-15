package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource (
            value={
                    "'includes part of the values', 200, 300, 3",
                    "'includes all values', 100, 9801, 90",
                    "'does not include values', 10, 90, 0",
                    "'beyond values', 0, 10_000, 90"
            },
            delimiter = ','
    )
    void shouldLimitedSquaring(String test, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.limitedSquaring(lowerLimit, upperLimit);
        assertEquals(expected,actual);
    }

/*    @Test
    void shouldIncludesPartValues() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.limitedSquaring(200,300);
        assertEquals(expected,actual);
    }

    @Test
    void shouldIncludedAllValues() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.limitedSquaring(100,9801);
        assertEquals(expected,actual);
    }

    @Test
    void shouldNotIncludeValues() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.limitedSquaring(10,90);
        assertEquals(expected,actual);
    }

    @Test
    void shouldBeyondValues() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.limitedSquaring(0,10_000);
        assertEquals(expected,actual);
    }*/
}