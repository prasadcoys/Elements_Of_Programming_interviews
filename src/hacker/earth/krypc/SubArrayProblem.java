package hacker.earth.krypc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubArrayProblem
{
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
       /* Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/

        // Write your code here

        //split the first line into input array size and query size

        String[] names = name.split(" ");
        int inputArraySize = Integer.parseInt(names[0]);
        int querySize = Integer.parseInt(names[1]);

        //To read the input array

        String inputArrayString = br.readLine();
        String[] inputArraySplit = inputArrayString.split(" ");
        int[] inputArray = new int[inputArraySize];
        for(int i =0;i<inputArraySize;i++)
        {
            inputArray[i] = Integer.parseInt(inputArraySplit[i]);
        }

        // To read the query array
        int[] queryArray = new int[querySize];
        for(int i =0;i<querySize;i++)
        {
            queryArray[i] = Integer.parseInt(br.readLine());
        }


        // convert the integer to binary
        int[] onesArray = new int[inputArraySize];

        for(int i=0;i<inputArraySize;i++)
        {
            int result = 0;
            String binaryString = Integer.toBinaryString(inputArray[i]);
            char[] chars = binaryString.toCharArray();
            for(char c : chars)
            {
                if(c=='1')
                    result++;
            }
            onesArray[i] = result;
        }

        int[] queryAnswers = new int[querySize];
        //check if queryString matches
        for (int i = 0;i<querySize;i++)
        {
            if(queryArray[i] == 0)
            {
                queryAnswers[i] = 0;
                continue;
            }
            int currentSize = 0;
            for(int j = 0;j<inputArraySize;j++)
            {
                currentSize+=onesArray[j];
                if(currentSize>=queryArray[i])
                {
                    queryAnswers[i] = j+1;
                    break;
                }
                if(j== inputArraySize-1)
                {
                    queryAnswers[i] = -1;
                }
            }
        }

        // print result
        for(int i = 0;i<querySize;i++)
        {
            System.out.println(queryAnswers[i]);
        }

    }
}


