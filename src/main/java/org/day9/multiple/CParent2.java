package org.day9.multiple;

import org.day9.IParent;

public class CParent2 implements IParent {
    @Override
    public void first() {
        System.out.println("CParent2 of first");
    }

    @Override
    public void second() {
        System.out.println("CParent2 of seccond");
    }

    @Override
    public void third() {
        System.out.println("CParent2 of third");
    }
}
