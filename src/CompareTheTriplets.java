import java.util.*;

public class CompareTheTriplets {
    public static final int SIZE = 3;
    public static void main(String[] args)
    {
        //Read the user input
        Scanner in = new Scanner(System.in);

        //Create arrays with a size of 3
        int[] aList = new int[SIZE];
        int[] bList = new int[SIZE];

        //Do 2 for loops, for each variable
        for(int i = 0; i<SIZE; i++)
        {
            System.out.println("Enter element [" + (i + 1) + "] for Alice: ");
            aList[i] = in.nextInt();
        }

        for(int i = 0; i<SIZE; i++)
        {
            System.out.println("Enter element [" + (i+1) + "] for Bob: ");
            bList[i] = in.nextInt();
        }

        int aScore = 0, bScore = 0;

        for(int i = 0; i<SIZE; i++)
        {
            System.out.println("For element [" + (i+1) + "]");
            System.out.println("------------");

            if(aList[i] > bList[i])
            {
                System.out.println("Alice (" + aList[i] + ") beats Bob (" + bList[i] + ")");
                System.out.println("\n");
                aScore++;
            }

            else if(bList[i] > aList[i])
            {
                System.out.println("Bob (" + bList[i] + ") beats Alice (" + aList[i] + ")");
                System.out.println("\n");
                bScore++;
            }
        }

        System.out.println(aScore + " " + bScore);

    }
}

