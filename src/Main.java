import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int x = 8;

        boolean thereIsSum = false;

        int[] myList = {1,2,3,6,7,};

        //System.out.println(myList.length);

        int pairsCount = 0;

        int firstLoopIndex = 0;
        int secondLoopIndex = 0;
        Set<String> printedPairs = new HashSet<>();

        System.out.println("We want to find pairs for this number: " + x);


        for (int i : myList) { //For loop to check each number in Array
            //System.out.println("This is the first loop index: " + firstLoopIndex);

            int y = x - i; //Other number that will form the sum
            for (int j : myList) {

                //This part resets the second loop index so that it does not go higher than the length of the list.
                if (secondLoopIndex == (myList.length)){
                    secondLoopIndex = 0;
                }

                //System.out.println("This is the second loop index: " + secondLoopIndex);

                if ((j == y) && (i <= j) && (firstLoopIndex != secondLoopIndex)) {
                    String pairKey = i + "," + j;
                    if(!printedPairs.contains(pairKey)){
                        printedPairs.add(pairKey);
                        thereIsSum = true;
                        pairsCount++;
                        System.out.println("Pair " + pairsCount + ": " + i + " (idx " + firstLoopIndex + ")" + " and " + j + " (idx " + secondLoopIndex + ")");
                    }
                    secondLoopIndex = 0;
                    break;
                }

                secondLoopIndex++;
                }

            firstLoopIndex++;
            }

            if (!thereIsSum) {
                System.out.println("No pairs were found");
            }
    }
}






//Future improves
//Stop when the highest number has been found.