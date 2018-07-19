package com.luxoft.sanzhar.codeluxoftim;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class Element {

    private int num;
    private String name;
    private int age;

    public Element() {
    }

    public Element(int num, int age) {
        this.num = num;
        this.age = age;
    }

    public Element(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.num;
        hash = 37 * hash + this.age > 20 ? 1 : 0;
        return hash;
    }

/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Element other = (Element) obj;
        if (this.num != other.num) {
            return false;
        }
        if ( (this.age > 20) != (other.age > 20)) {
            return false;
        }
//        if (this.age != other.age) {
//            return false;
//        }
        return true;
    }
    */

    @Override
    public String toString() {
        return "Element{" + "num=" + num + ", name=" + name + ", age=" + age + "}\r\n";
    }

}
