package org.day8;

import org.day7_01.Polymorph;

public class OverloadCallExample {
    public static void main(String[] args) {
        Polymorph pl=new Polymorph();
        pl.add();
        pl.add(12,45);
        pl.add(23.678,90);
        }
}
