import java.util.Scanner;

public class ArrayCylinders {

    public static void main ( String [] args ){
       Scanner in = new Scanner(System.in);
       Cylinder list []= new Cylinder[5] ;

       //1) fill the information for each Cylinder from the user

        for (int i = 1; i < 6; i++) {
            double radius = in.nextDouble();
            double height = in.nextDouble();

            list[i] = new Cylinder(radius, height);
        }


        // 2)print the information of all Cylinders


    }
 }

