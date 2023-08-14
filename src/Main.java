public class Main {
    public static void main(String[] args) {
        int x = 9;

        boolean thereIsSum = false;

        int[] myList = {7, 3, 9, 1, 4, 6, 3, 9, 6, 5};

        for (int i : myList) {

            int y = x - i;
            //System.out.println(y);

            for (int j : myList) {
                if (j == y) {
                    thereIsSum = true;
                    System.out.println("A pair of numbers to make the sum have been found!");
                    System.out.println("These pairs are: " + i + " and " + j);
                    break;
                }
                //If you want program to stop once a pair has been found
                if(thereIsSum == true){
                    break;
                }
            }

        }
        if(thereIsSum == false){
            System.out.println("No pairs were found");
        }
    }
}