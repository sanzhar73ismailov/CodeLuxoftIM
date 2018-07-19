package com.luxoft.sanzhar.codeluxoftim;

/**
 *
 * @author admin
 */
public class BTNCompare {

    public static boolean compare(BTN obj1, BTN obj2) {
        if (obj1 == obj2) {
            return true;
        }
        if (obj1 == null || obj2 == null) {
            return false;
        }
        if (obj1.val != obj2.val) {
            return false;
        }
        if (!compare(obj1.left, obj2.left)) {
            return false;
        }
        if (!compare(obj1.right, obj2.right)) {
            return false;
        }
        return true;
    }
}
