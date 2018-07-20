/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luxoft.sanzhar.codeluxoftim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Test;

public class ElementUtilTest {

    @Test
    public void testGetUniqCollection() {
        Element element1 = new Element(1, 5); // num=1 and age<20 
        Element element2 = new Element(1, 50); // num=1 and age>20
        Element element3 = new Element(1, 7); // num=1 and age<20 - dublicate
        Element element4 = new Element(2, 5); // num=2 and age<20
        Element element5 = new Element(2, 10); // num=2 and age<20 - dublicate
        List list = new ArrayList();
        list.add(element1);
        list.add(element2);
        list.add(element3);
        list.add(element4);
        list.add(element5);
        System.out.println("list = " + list);
        assertFalse(list.isEmpty());
        assertTrue(list.size() == 5);
        final Collection uniqCollection = ElementUtil.getUniqCollection(list);
        System.out.println("uniqCollection = " + uniqCollection);
        assertFalse(uniqCollection.isEmpty());
        assertNotNull(uniqCollection);
        assertTrue(uniqCollection.size() == 3);
        assertTrue(isInSet(uniqCollection, element1));
        assertTrue(isInSet(uniqCollection, element2));
        assertTrue(isInSet(uniqCollection, element4));
        assertFalse(isInSet(uniqCollection, element3));
        assertFalse(isInSet(uniqCollection, element5));
    }

    private boolean isInSet(Collection<Element> set, Element element) {
        final Iterator<Element> iterator = set.iterator();
        while (iterator.hasNext()) {
            Element nextElement = iterator.next();
            if (nextElement.getNum() == element.getNum() && nextElement.getAge() == element.getAge()) {
                return true;
            }

        }
        return false;
    }
}
