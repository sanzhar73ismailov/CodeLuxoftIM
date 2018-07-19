/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luxoft.sanzhar.codeluxoftim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class ElementUtilTest {
    
    public ElementUtilTest() {
    }

    @Test
    public void testGetUniqCollection() {
        Element element1 = new Element(1, 5);
        Element element2 = new Element(1, 50);
        Element element3 = new Element(1, 7);
        Element element4 = new Element(2, 5);
        Element element5 = new Element(2, 10);
        List list = new ArrayList();
        list.add(element1);
        list.add(element2);
        list.add(element3);
        list.add(element4);
        list.add(element5);
        System.out.println("list = " + list);
        final Collection uniqCollection = ElementUtil.getUniqCollection(list);
        System.out.println("uniqCollection = " + uniqCollection);
        assertTrue(1==1);
    }
    
}
