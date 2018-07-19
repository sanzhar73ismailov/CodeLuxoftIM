package com.luxoft.sanzhar.codeluxoftim;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class NewClass {

    String str1;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.str1);
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
        final NewClass other = (NewClass) obj;
        if (!Objects.equals(this.str1, other.str1)) {
            return false;
        }
        return true;
    }
    
    
}
