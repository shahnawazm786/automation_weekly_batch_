package org.day9.mulitlevel;

public class TopModelHondaCarClass extends HondaClass {
    boolean isHybrid;
    public void getIsHybrid(boolean isHybrid){
        this.isHybrid=isHybrid;
        if(this.isHybrid){
            System.out.println("Car is hybrid model");
        }
        else
        {
            System.out.println("Car is not hybrid");
        }
    }
}
