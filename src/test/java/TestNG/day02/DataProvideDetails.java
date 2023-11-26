package TestNG.day02;

import org.testng.annotations.DataProvider;

public class DataProvideDetails {

    @DataProvider(name = "car")
    public Object[][] carDetails(){
        Object [][] cars= {
                {"Grand Vitara","Black",4,1234,12000.99},
                {"Scarpio","Red",5,8888,7000.89}

        };
        return  cars;
    }
    @DataProvider(name="wicket")
    public Object[][] totalWicket(){
        Object [][] wicket= {
                {"Mohammad Shami",23},
                {"Bumarah",20},
                {"Zampa",22},
                {"Madhushanka",20}

        };
        return  wicket;
    }
    @DataProvider(name="runs")
    public Object[][] totalRun(){
        Object [][] run= {
                {"Virat Kohli",792,12},
                {"Quniton",760,11},
                {"Rohit Sharma",700,12},
                {"Williamsons",645,8}

        };
        return  run;
    }

}
