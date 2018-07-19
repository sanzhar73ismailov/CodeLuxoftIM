package com.luxoft.sanzhar.codeluxoftim;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class BTN {

    int val;
    BTN left;
    BTN right;

    public BTN() {
    }

    public BTN(int val) {
        this.val = val;
    }

    public BTN(int val, BTN left, BTN right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

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
        final BTN other = (BTN) obj;
        if (this.val != other.val) {
            return false;
        }
        if (!Objects.equals(this.left, other.left)) {
            return false;
        }
        if (!Objects.equals(this.right, other.right)) {
            return false;
        }
        return true;
    }
    
    
}
