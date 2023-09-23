package org.day7.interimpl;

public class InterFaceImplemts implements ILocator{
    public static void main(String[] args) {
        //ILocator il=new ILocator(); can't be instantiated
        ILocator iLocator=new InterFaceImplemts();
        System.out.println(iLocator.area(10));

    }

    @Override
    public double area(int radius) {

        return 2*pie*(radius*radius);
    }
}
