package org.day7_01;

import org.day7.ProtectedVariableAccessibility;

public class SubClassProtectedAccessibility extends ProtectedVariableAccessibility {
    public static void main(String[] args) {
        SubClassProtectedAccessibility s=new SubClassProtectedAccessibility();
        s.flightNo=123;
    }
}
