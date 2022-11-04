import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        ArrayList<Double> a = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));
        double expected = 3.0;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.count(a));
    }

    @Test
    void count2(){
        ArrayList<Double> a = new ArrayList<>(Arrays.asList(0.0, 2.3, 4.1, 0.0, 1.1, 0.0, 0.0));
        double expected = 7.0;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.count(a));
    }

    @Test
    void count3(){
        ArrayList<Double> a = new ArrayList<>();
        double expected = 0.0;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.count(a));
    }

    @Test
    void sum() {
        ArrayList<Double> a = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));
        double expected = 6.6;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void sum2(){
        ArrayList<Double> a = new ArrayList<>(Arrays.asList(0.0, 0.0, 2.5, 5.2, 3.3, 0.0));
        double expected = 11.0;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void sum3(){
        ArrayList<Double> a = new ArrayList<>();
        double expected = 0.0;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average() {
        ArrayList<Double> a = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));
        double expected = 2.2;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.average(a));
    }

    @Test
    void average2(){
        ArrayList<Double> a = new ArrayList<>(Arrays.asList(0.0, 1.3, 0.0, 7.8, 3.4));
        double expected = 2.5;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.average(a));
    }

    @Test
    void average3(){
        ArrayList<Double> a = new ArrayList<>();
        double expected = 0.0;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.average(a));
    }
}