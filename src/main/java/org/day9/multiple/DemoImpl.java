package org.day9.multiple;

import org.day9.IParent;

public class DemoImpl {
    public static void main(String[] args) {
        IParent p=new CParent2();
        p.first();
        p.second();
        p.third();
    }
}
