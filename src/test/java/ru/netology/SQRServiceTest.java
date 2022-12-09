package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    int left = 0;
    int right = 0;
    SQRService service = null;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.left = 200;
        this.right = 300;
        try {
            this.service = new SQRService(left, right);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @org.junit.jupiter.api.Test
    void findNumberOfSquares() {
        int expected = 3;
        assertEquals(expected, this.service.findNumberOfSquares());
    }
}