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


        int tries = 0;

        while(true) {

            tries ++; //Count tries

            System.out.println(tries);

            List<List<Integer>> newMatrix = matrixTool.generateRandomMatrix(); //Create a new matrix

            if(matrixTool.isMagicMatrix(newMatrix)) {

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


        /**
         * This method is used to perform the following ability:
         * 1: Generate a 3x3 matrix.
         * 2: Returns a 3x3 matrix (Nested List)
         */


        Random rand = new Random();

        List<List<Integer>> magicMatrix = new ArrayList<>(3); //Matrix

        Set<Integer> used = new HashSet<>(9); //Store numbers that are already used to ensure no duplicates


        while (magicMatrix.size() < 3) {

            List<Integer> row = new ArrayList<>(3); //Make row

            while (row.size()<3){

                int num = rand.nextInt(1, 10); //Assign Random Number

                if (used.add(num)) { //Returns false if there is duplicates

                    row.add(num);
                }

            }

            magicMatrix.add(row); //Add row to column

        }


        return magicMatrix;
    }


    public static boolean isMagicMatrix(List<List<Integer>> matrix) {

        /**
         * This method is used to perform the following ability:
         * 1: Perform the calculations to check if it is a magic square.
         * 2: Returns a boolean if true.
         */


        if (matrix.isEmpty()) {


            return false;

        }

        int isMagic = 15;

        // rows and columns
        for (int i = 0; i < 3; i++) {

            int row = matrix.get(i).get(0) + matrix.get(i).get(1) + matrix.get(i).get(2); //Check row sum

            int col = matrix.get(0).get(i) + matrix.get(1).get(i) + matrix.get(2).get(i); //Check column sum

            if (row != isMagic || col != isMagic) {

                return false;
            }
        }

        // Now check diagonal values
        int diagonalOne = matrix.get(0).get(0) + matrix.get(1).get(1) + matrix.get(2).get(2);

        int diagonalTwo = matrix.get(0).get(2) + matrix.get(1).get(1) + matrix.get(2).get(0);

        if (diagonalOne != isMagic || diagonalTwo != isMagic) {

            return false;

        }

    return true;
    }




}