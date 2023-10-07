package org.day9;

public class CowClass extends AnimalClass {
    String color;
    int noOfLeg;
    public CowClass(String color,int noOfLeg,String animals){
        super(animals);
        this.color=color;
        this.noOfLeg=noOfLeg;
    }

    @Override
    public String getAnimal(){
            return "Animal name"+super.getAnimal()+"\nColor of Cow"+this.color+"\n No of Leg \t"+this.noOfLeg;

    }

}
