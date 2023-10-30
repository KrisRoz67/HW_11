package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HW11Test {
    private final HW11 sut = new HW11();

    @Test
    public void testMaxDuplicate() {
        {
            Integer res = sut.maxDuplicate(List.of());
            assertNull(res);
        }
        {
            int res = sut.maxDuplicate(List.of(1, 1, 2, 3));
            assertEquals(1, res);
        }
        {
            Integer res = sut.maxDuplicate(List.of(1, 2, 3));
            assertNull(res);
        }
        {
            int res = sut.maxDuplicate(List.of(1, 2, 2));
            assertEquals(2, res);
        }
        {
            int res = sut.maxDuplicate(List.of(1, 2, 2, 1, 1));
            assertEquals(2, res);
        }
    }

    @Test
    public void testWordNumeration() {
        {
            List<String> res = sut.wordNumeration(new ArrayList<>(List.of("hi", "hi", "welcome")));
            List<String> expected = new ArrayList<>(List.of("hi#1", "hi#2", "welcome#1"));
            assertEquals(expected, res);
        }
        {
            List<String> res = sut.wordNumeration(new ArrayList<>(List.of("Hi", "hi", "welcome", "no", "hI", "HI")));
            List<String> expected = new ArrayList<>(List.of("Hi#1", "hi#2", "welcome#1", "no#1", "hI#3", "HI#4"));
            assertEquals(expected, res);
        }
    }

    @Test
    public void testMakeBricks() {
        {
            boolean res = sut.makeBricks(3, 1, 8);
            assertTrue(res);
        }
        {
            boolean res = sut.makeBricks(3, 1, 9);
            assertFalse(res);
        }
        {
            boolean res = sut.makeBricks(3, 2, 10);
            assertTrue(res);
        }
        {
            boolean res = sut.makeBricks(2, 2, 15);
            assertFalse(res);
        }
    }
}