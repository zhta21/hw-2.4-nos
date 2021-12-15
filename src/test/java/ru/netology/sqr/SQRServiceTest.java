package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
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
    }
}