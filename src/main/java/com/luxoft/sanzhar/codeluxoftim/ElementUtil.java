package com.luxoft.sanzhar.codeluxoftim;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author admin
 */
public class ElementUtil {

    public static Collection<Element> getUniqCollection(Collection<Element> collection) {
        Set<Element> set = new HashSet<Element>(collection);
        return set;
    }
}
