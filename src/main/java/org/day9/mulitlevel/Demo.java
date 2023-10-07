package org.day9.mulitlevel;

public class Demo {
    public static void main(String[] args) {
        TopModelHondaCarClass top=new TopModelHondaCarClass();
        top.setNoOfSeat(4);
        top.showCarName("Honda - Asscent");
        top.getIsHybrid(false);
        System.out.println("Car name"+top.carName);
        System.out.println("Car name"+top.noOfSeat);
        System.out.println("Car name"+top.isHybrid);
    }
}
