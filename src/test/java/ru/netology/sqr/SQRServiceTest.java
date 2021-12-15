package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldLimitedSquaring() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.limitedSquaring(200,300);
        assertEquals(expected,actual);
    }
}