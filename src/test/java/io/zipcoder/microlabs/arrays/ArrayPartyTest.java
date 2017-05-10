package io.zipcoder.microlabs.arrays;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class ArrayPartyTest {

    ArrayParty arrayParty;
    @Before
    public void setUp(){ arrayParty = new ArrayParty(); }


    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        assertEquals(expected, actual);
    }


    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        String expected = "*** Output ***\nMushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        assertEquals( expected, actual);

    }


    @Test
    public void lastSecondElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        String expected = "*** Output ***\nTomatoes";

        //: When
        String actual = arrayParty.lastSecondElement(breakfast);

        //: Then
        assertEquals( expected, actual);

    }


    @Test
    public void reverseTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        String expected = "*** Output ***\nMushrooms\nTomatoes\nBacon\nBeans\nEggs\nSausage";

        //: When
        String actual = arrayParty.reverse(breakfast);

        //: Then
        assertEquals( expected, actual);

    }


    @Test
    public void trueIsPalindromeTest(){  // test a true Palin to see if it returns true
        //: Given
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};

        String expected = "*** Output ***\nTrue";

        //: When
        String actual = arrayParty.isPalindrome(breakfast);

        //: Then
        assertEquals( expected, actual);

    }


    @Test
    public void falseIsPalindromeTest(){  // test a true Palin to see if it returns false
        //: Given
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        String expected = "*** Output ***\nFalse";

        //: When
        String actual = arrayParty.isPalindrome(breakfast);

        //: Then
        assertEquals( expected, actual);

    }


    @Test
    public void compressTest(){  // test a true Palin to see if it returns false
        //: Given
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};

        String expected = "compressTest()\n*** Output ***\n: 1\n: 3\n: 2\n: 1\n: 4";

        //: When
        String actual = arrayParty.compress(nums);

        //: Then
        assertEquals( expected, actual);

    }


    @Test
    public void packTest(){  // test a true Palin to see if it returns false
        //: Given
        char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};

        String expected = "pack()\n*** Output ***\n: aaaa, b, cc, aa, d, eeee";

        //: When
        String actual = arrayParty.pack(letters);

        //: Then
        assertEquals( expected, actual);

    }

}
