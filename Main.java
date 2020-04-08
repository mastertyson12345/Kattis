import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Defines the numONegs and makes a getter for entered text.
        int numONegs = 0;
        Scanner input = new Scanner(System.in);

        // Disregards number of temps and takes in the temps as a single string
        int numOTemps = input.nextInt();
        String temps = input.nextLine();
        input.close();

        // Changes single string to array and makes an empty int array for temps
        String[] sTemps = temps.split(" ", numOTemps + 1);
        int[] iTemps = new int[numOTemps];

        // Moves temps into empty Int array and adds 1 to the number of negatives for each negative temp
        for(int n = 0; n < numOTemps; n++) {
            iTemps[n] = Integer.parseInt(sTemps[n]);
            if(iTemps[n] <= 0) {
                numONegs++;
            }
        }

        // Prints out the number of negative temps.
        System.out.print(numONegs);
    }
}