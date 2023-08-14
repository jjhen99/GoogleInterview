public class Main {
    public static void main(String[] args) {
        int x = 10;

        boolean thereIsSum = false;

        int[] myList = {2,9,7,5,7,4,3,6,5,4,7,8};

        int pairsCount = 0;

        int firstLoopIndex = 0;
        int secondLoopIndex = 0;

        System.out.println("We want to find pairs for this number: " + x);


        for (int i : myList) { //For loop to check each number in Array
            //System.out.println("This is the first loop index: " + firstLoopIndex);

            int y = x - i; //Other number that will form the sum
            for (int j : myList) {

                //This part resets the second loop index so that it does not go higher than the length of the list.
                if (secondLoopIndex == (myList.length + 1)){
                    secondLoopIndex = 0;
                }

                //System.out.println("This is the second loop index: " + secondLoopIndex);

                if (j == y && ((i-j) <= 0) && (firstLoopIndex != secondLoopIndex)) {
                    thereIsSum = true;
                    int[] pair = {i, j};
                    pairsCount++;
                    System.out.println("Pair " + pairsCount + ": " + pair[0] + " (idx " + firstLoopIndex + ")" + " and " + pair[1]+ " (idx " + secondLoopIndex + ")");
                    secondLoopIndex = 0;
                    break;
                }

                secondLoopIndex++;
                }
            firstLoopIndex++;
            }

            if (thereIsSum == false) {
                System.out.println("No pairs were found");
            }
    }
}






//Future improves
//Stop when the highest number has been found.