import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args){

        Random rand = new Random();
        List<List<Integer>> magicMatrix = new ArrayList<>(); //Matrix


        int numOfTries = 0;

        while (magicMatrix.size()<3) {

            List<Integer> row = new ArrayList<>();

            for (int i=0; i<3; i++ ) {

                int num = rand.nextInt(1,10); //Assign Random Number

                row.add(num);


            }

        magicMatrix.add(row);

        }

   









    }


}
