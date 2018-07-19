package com.luxoft.sanzhar.codeluxoftim;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Element el1 = new Element(1, 10);
        Element el2 = new Element(1, 21);
        Element el3 = new Element(2, 10);
        Element el4 = new Element(1, 12);
        Element el5 = new Element(2, 12);
        Element el6 = new Element(2, 22);
        Element el7 = new Element(2, 29);

        System.out.println("el1.equals(el2) = " + el1.equals(el2));
        Set set = new HashSet();
        System.out.println("add = " + set.add(el1));
        System.out.println("add = " + set.add(el2));
        System.out.println("add = " + set.add(el3));
        System.out.println("add = " + set.add(el4));
        System.out.println("add = " + set.add(el5));
        System.out.println("add = " + set.add(el6));
        System.out.println("add = " + set.add(el7));
    
        
        System.out.println("set = " + set);
        
    }
}
