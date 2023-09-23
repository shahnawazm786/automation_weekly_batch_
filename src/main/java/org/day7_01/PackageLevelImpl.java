package org.day7_01;

import org.day7.PackageVariableAccessibility;

public class PackageLevelImpl extends PackageVariableAccessibility {
    public static void main(String[] args) {
        PackageLevelImpl p1=new PackageLevelImpl();

    }
}
class PackageLevelImpl1
{
    public static void main(String[] args) {
        PackageVariableAccessibility obj=new PackageVariableAccessibility();

    }
}
