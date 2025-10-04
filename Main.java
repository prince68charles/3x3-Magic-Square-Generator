import java.util.*;


/**
 * Simon Lavers (#20479732).
 * CISC 124
 */



public class Main {


    public static void main(String[] args){


        long seconds = System.currentTimeMillis(); //Initialize Seconds
        double startSeconds = seconds / 1000.0; //Start timer
        Date startDate = new Date(seconds); //Current date

        List<List<Integer>> newMatrix = matrixTool.generateRandomMatrix(); //Create a new matrix


        int tries = 0;

        while(true) {

            tries ++;

            System.out.println(tries);

            if(matrixTool.isSquareMatrix(newMatrix)) {

                System.out.println("It is a magic square");
                System.out.println(newMatrix);

                //End the timer
                long endMillis = System.currentTimeMillis();
                double endSeconds = endMillis / 1000.0;
                Date endDate = new Date(endMillis);


                //Output all the times and dates
                System.out.println("It started at :  " + startSeconds + "  using seconds");
                System.out.println("It ended   at :  " + endSeconds + "  using seconds");
                System.out.println("It started at :  " + startDate);
                System.out.println("It ended   at :  " + endDate);
                System.out.println("It took " + (endSeconds - startSeconds) + " seconds  to find the magic square");
                break;


            }


        }
    }







}



class matrixTool {


    public static List<List<Integer>> generateRandomMatrix() {

        Random rand = new Random();
        List<List<Integer>> magicMatrix = new ArrayList<>(); //Matrix


        int numOfTries = 0;

        while (magicMatrix.size() < 3) {

            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < 3; i++) {

                int num = rand.nextInt(1, 10); //Assign Random Number

                row.add(num);


            }

            magicMatrix.add(row);

        }


        return magicMatrix;
    }


    public static boolean isSquareMatrix(List<List<Integer>> matrix) {

        return true;


    }


}