package Goncharova.Hw3;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class Tester {
    private UnderTest underTest;

    @BeforeEach
    public void init() {
        underTest = new UnderTest();
    }


    @Test
    public void test1() {
        underTest = new UnderTest();

        int [] arr = {1,2,3,5,6,7,8};

        Assertions.assertThrows(RuntimeException.class, () -> {
            underTest.m1(arr);
        });

    }

    @Test
    public void test2() {
        underTest = new UnderTest();

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] expect = {5, 6, 7, 8};

        Assertions.assertArrayEquals(expect, underTest.m1(arr));
    }

    @Test
    public void test3() {
        underTest = new UnderTest();

        int [] arr = {1, 2, 3, 4};
        int [] expect = {};

        Assertions.assertArrayEquals(expect, underTest.m1(arr));
    }

    @Test
    public void test4() {

        underTest = new UnderTest();

        int [] data = {1,1,1,4,1,4,1};

        Assertions.assertTrue(underTest.m2(data));
    }

    @Test
    public void test5() {

        underTest = new UnderTest();

        int [] data = {1,1,1,1,1,1,1};

        Assertions.assertFalse(underTest.m2(data));
    }

    @Test
    public void test6() {

        underTest = new UnderTest();

        int [] data = {4,4,4,4,4,4,4};

        Assertions.assertFalse(underTest.m2(data));
    }

    @Test
    public void test7() {

        underTest = new UnderTest();

        int [] data = {5,2,3,7,6,9,0};

        Assertions.assertFalse(underTest.m2(data));
    }
}
