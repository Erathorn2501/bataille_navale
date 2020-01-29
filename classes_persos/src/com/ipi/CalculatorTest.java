package com.ipi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void soustraire_1() {

        var c = new Calculator();
        assertEquals(2,c.soustraire(5, 3));
    }

    void soustraire_2() {

        var c = new Calculator();
        assertThrows(double.soustraire(8.3, 5));
        assertEquals(3,c.soustraire(6, 3));
    }

    void soustraire_3() {

        var c = new Calculator();
        assertEquals(6,c.soustraire(21, 15));
    }

    void soustraire_4() {

        var c = new Calculator();
        assertEquals(12,c.soustraire(15, 3));
    }

    void soustraire_5() {

        var c = new Calculator();
        assertEquals(-2,c.soustraire(1, 3));
    }

    void soustraire_6() {

        var c = new Calculator();
        assertEquals(8,c.soustraire(5, -3));
    }

    void soustraire_7() {

        var c = new Calculator();
        assertEquals(2,c.soustraire(1, -1));
    }

    void soustraire_8() {

        var c = new Calculator();
        assertEquals(2,c.soustraire(5, '@'));
    }

    void soustraire_9() {

        var c = new Calculator();
        assertEquals(2,c.soustraire('@', 5));
    }

    void soustraire_10() {

        var c = new Calculator();
        assertEquals(-2,c.soustraire(-1, 1));
    }

    void soustraire_11() {

        var c = new Calculator();
        assertEquals(0,c.soustraire(-1, -1));
    }

    void soustraire_12() {

        var c = new Calculator();
        assertEquals(0,c.soustraire(0, 0));
    }

    void soustraire_13() {

        var c = new Calculator();
        assertEquals(0.5,c.soustraire(5.5, 5));
    }

    void soustraire_14() {

        var c = new Calculator();
        assertEquals(-0.5,c.soustraire(5, 5.5));
    }

    void soustraire_15() {

        var c = new Calculator();
        assertEquals(2,c.soustraire('F', '@'));
    }

    void soustraire_16() {

        var c = new Calculator();
        assertEquals(0x0F,c.soustraire(0xFF, 0xF0));
    }

    void soustraire_17() {

        var c = new Calculator();
        assertThrows(2,c.soustraire(TRUE, FALSE));
    }

    void soustraire_18() {

        var c = new Calculator();
        assertEquals(00000011,c.soustraire(01010011, 01010000));
    }

    void soustraire_19() {

        var c = new Calculator();
        assertEquals(50,c.soustraire(75, 25));
    }

//    void soustraire_20() {
//
//        var c = new Calculator();
//        assertEquals(2,c.soustraire(A=5, B=3));
//    }

    void soustraire_21() {

        var c = new Calculator();
        assertEquals(2,c.soustraire(NULL, NULL));
    }

    void soustraire_22() {

        var c = new Calculator();
        assertEquals(5,c.soustraire(5, 0));
    }

    void soustraire_23() {

        var c = new Calculator();
        assertEquals(0,c.soustraire(500, 500));
    }

    void soustraire_24() {

        var c = new Calculator();
        assertEquals(0,c.soustraire(-25, -25));
    }

    void soustraire_25() {

        var c = new Calculator();
        assertEquals(2,c.soustraire('@', '@'));
    }

    @Test

    void additionner_1(){

        var c = new Calculator();
        assertEquals(35,c.soustraire(25, 10));
        }

    void additionner_2(){

        var c = new Calculator();
        assertEquals(35,c.soustraire(25, 10));
        }

    void additionner_3() {

        var c = new Calculator();
        assertEquals(-35,c.soustraire(-25, -10));
    }

    void additionner_4() {

        var c = new Calculator();
        assertThrows(Integer,c.soustraire(25, 10));
    }

    void additionner_5() {

        var c = new Calculator();
        assertThrows(double.class..soustraire(25, 10));
    }

    void additionner_6() {

        var c = new Calculator();
        assertEquals(6.5,c.soustraire(3.5, 3));
    }

    void additionner_7() {

        var c = new Calculator();
        assertEquals(6.5,c.soustraire(3, 3.5));
    }

    void additionner_8() {

        var c = new Calculator();
        assertEquals(-4.5,c.soustraire(-5.5, 1));
    }

    void additionner_9() {

        var c = new Calculator();
        assertEquals(-4.5,c.soustraire(1, -5.5));
    }


    @Test
    void diviser_1() {

        var c = new Calculator();
        assertEquals(2.5,c.soustraire(5, 2));
    }

    void diviser_2() {

        var c = new Calculator();
        assertEquals(2.5,c.soustraire(5, 2));
    }

    void diviser_3() {

        var c = new Calculator();
        assertEquals(2.5,c.soustraire(5, 2));
    }
}