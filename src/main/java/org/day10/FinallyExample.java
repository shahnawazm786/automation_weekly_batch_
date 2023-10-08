package org.day10;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);

        }
        catch (NullPointerException ne){
        ne.printStackTrace();
        }
        catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        finally {
            System.out.println("Finally block executed");
            // file pointer close
            // database pointer close
            // assigned null
        }

        System.out.println("Hello program");
        System.out.println(100+200);
    }
}
