import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.
    String intFile = "/Users/andrew/Projects/ArraysAndLists/testIntegerData1.txt";

    String doubleFile = "/Users/andrew/Projects/ArraysAndLists/testDoubleData2.txt";

    String stringFile = "/Users/andrew/Projects/ArraysAndLists/testStringData3.txt";

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        LoadAndStore check = new LoadAndStore();
        String expected = "[4, 5, 6, 11, 13, 8, 9, 7, 14, 18]";
        String actual = Arrays.toString(check.loadIntArrayFromFile(intFile));
        assertEquals(expected, actual);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        LoadAndStore check = new LoadAndStore();
        String expected = "[4, 5, 6, 11, 13, 8, 9, 7, 14, 18]";
        String actual = String.valueOf(check.loadIntegerArrayListFromFile(intFile));
        assertEquals(expected, actual);
    }

    @Test
    void loaddoubleArrayFromFile() {
        LoadAndStore check = new LoadAndStore();
        String expected = "[4.4, 5.5, 6.34, 11.0001, 13.004, 8.7, 9.9706, 7.4532, 14.5, 18.00023132123]";
        String actual = Arrays.toString(check.loaddoubleArrayFromFile(doubleFile));
        assertEquals(expected, actual);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        LoadAndStore check = new LoadAndStore();
        String expected = "[4.4, 5.5, 6.34, 11.0001, 13.004, 8.7, 9.9706, 7.4532, 14.5, 18.00023132123]";
        String actual = String.valueOf(check.loadDoubleArrayListFromFile(doubleFile));
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayFromFile() {
        LoadAndStore check = new LoadAndStore();
        String expected = "[4.4, 5.5, Foo, 11.0001, Bar, Lost in Space, Lido Shuffle, How much data was destroyed?, I think therefore I compute, 0, NaN, ZipCode Rocks!]";
        String actual = Arrays.toString(check.loadStringArrayFromFile(stringFile));
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayListFromFile() {
        LoadAndStore check = new LoadAndStore();
        String expected = "[4.4, 5.5, Foo, 11.0001, Bar, Lost in Space, Lido Shuffle, How much data was destroyed?, I think therefore I compute, 0, NaN, ZipCode Rocks!]";
        String actual = String.valueOf(check.loadStringArrayListFromFile(stringFile));
        assertEquals(expected, actual);
    }
}