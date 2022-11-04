import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        double[] a = {2.5, 1.1, 3.4};
        int expected = 3;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.count(a));
    }
    @Test
    void count2(){
        double[] a = {0.0, 1.1, 0.0, 0.0, 2.3, 0.0};
        int expected = 6;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.count(a));
    }

    @Test
    void count3(){
        double[] a = { };
        int expected = 0;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.count(a));
    }

    @Test
    void sum() {
        double[] a = {1.1, 2.6, 3.3};
        double expected = 7.0;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void sum2(){
        double[] a = {1.1, 2.2, 3.3, 4.4, 0.0, 5.5};
        double expected = 16.5;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void sum3(){
        double[] a = { };
        double expected = 0.0;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average() {
        double[] a = {3.5, 4.3, 1.2};
        double expected = 3.0;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.average(a));
    }

    @Test
    void average2(){
        double[] a = {0.0, 0.0, 2.5, 1.3, 2.2, 0.0};
        double expected = 1.0;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.average(a));
    }
    @Test
    void average3(){
        double[] a = { };
        double expected = 0.0;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.average(a));
    }
}