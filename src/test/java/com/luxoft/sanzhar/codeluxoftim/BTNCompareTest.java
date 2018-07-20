/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luxoft.sanzhar.codeluxoftim;

import org.junit.Test;
import static org.junit.Assert.*;

public class BTNCompareTest {

    /**
     * Test of compare method, of class BTNCompare.
     */
    @Test
    public void testCompareIfBorthAreNull() {
        System.out.println("CompareIfBorthAreNull");
        BTN obj1 = null;
        BTN obj2 = null;
        boolean expResult = true;
        boolean result = BTNCompare.compare(obj1, obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareIfFirstIsNull() {
        System.out.println("CompareIfFirstIsNull");
        BTN obj1 = null;
        BTN obj2 = new BTN();
        boolean expResult = false;
        boolean result = BTNCompare.compare(obj1, obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareIfSecondIsNull() {
        System.out.println("CompareIfFirstIsNull");
        BTN obj1 = new BTN();
        BTN obj2 = null;
        boolean expResult = false;
        boolean result = BTNCompare.compare(obj1, obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareIfSameReference() {
        System.out.println("CompareIfSameReference");
        BTN obj1 = new BTN();
        BTN obj2 = obj1;
        boolean expResult = true;
        boolean result = BTNCompare.compare(obj1, obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareIfValIsSame() {
        System.out.println("CompareIfValIsSame");
        BTN obj1 = new BTN();
        BTN obj2 = new BTN();
        obj1.val = 10;
        obj2.val = 10;
        boolean expResult = true;
        boolean result = BTNCompare.compare(obj1, obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareIfValIsDifferent() {
        System.out.println("CompareIfValIsDifferent");
        BTN obj1 = new BTN();
        BTN obj2 = new BTN();
        obj1.val = 2;
        obj2.val = 10;
        boolean expResult = false;
        boolean result = BTNCompare.compare(obj1, obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareIfEqualTrees() {
        System.out.println("CompareIfEqualTrees");

        BTN leftForObj1 = createBTN();
        BTN rightForObj1 = createBTN();

        BTN leftForObj2 = createBTN();
        BTN rightForObj2 = createBTN();

        BTN obj1 = new BTN(10, leftForObj1, rightForObj1);
        BTN obj2 = new BTN(10, leftForObj2, rightForObj2);

        boolean expResult = true;
        boolean result = BTNCompare.compare(obj1, obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareIfNotEqualTrees() {
        System.out.println("CompareIfNotEqualTrees");

        BTN leftForObj1 = createBTN();
        BTN rightForObj1 = createBTN();

        BTN leftForObj2 = createBTN();
        BTN rightForObj2 = createBTN();

        BTN obj1 = new BTN(10, new BTN(0), rightForObj1);
        BTN obj2 = new BTN(10, leftForObj2, rightForObj2);

        boolean expResult = false;
        boolean result = BTNCompare.compare(obj1, obj2);
        assertEquals(expResult, result);
    }

    private BTN createBTN() {
        final BTN btn = new BTN(2);
        btn.left = new BTN(3);
        btn.right = new BTN(30);
        return btn;
    }
}
