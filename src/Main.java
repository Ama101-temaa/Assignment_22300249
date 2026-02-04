import java.util.Scanner;
public class Main {
    public static void main(String[] args){


        GradeReport.executeGradeReport(84.3);

        double average1 = ClassAverageCalc.calculateClassAverage(45,90);

        double average2 = ClassAverageCalc.calculateClassAverage(19,87,67);

        double average3 = ClassAverageCalc.calculateClassAverage(new double []{30,77,85,14});

        //Test for all methods in ClassAverageCalc

        System.out.println("average1: "+ average1);
        System.out.println("average2: "+ average2);
        System.out.println("average3: "+ average3);


    }
}
