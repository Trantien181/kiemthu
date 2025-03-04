package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Phan1serviceTest {

    @Test
    void tinhTong() {
    }

    @Test
    void testTinhTong() {
        assertEquals(9,Phan1service.tinhTong(5));
        assertEquals(0,Phan1service.tinhTong(-1));
        assertEquals(1,Phan1service.tinhTong(1));
        assertEquals(9,Phan1service.tinhTong(5));
        assertEquals(9,Phan1service.tinhTong(5));
        assertEquals(9,Phan1service.tinhTong(5));
        assertEquals(9,Phan1service.tinhTong(5));
    }

    @Test
    void tinhTongMang() {
    }
}