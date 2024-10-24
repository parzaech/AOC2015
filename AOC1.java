import java.util.ArrayList;
import java.util.Scanner;

public class AOC1 {
    public static void main(String[] args) {
        int lw, wh, hl, min, max, mid, sum = 0;

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        String line;

        System.out.println("Enter multiple lines of input (press Enter on an empty line to finish):");

        while (!(line = scanner.nextLine()).isEmpty()) {
            inputList.add(line);
        }

        // Convert ArrayList to Array
        String[] inputArray = inputList.toArray(new String[0]);

        // Loop through each line of input
        for (int i = 0; i < inputArray.length; i++) {
            String elementToSplit = inputArray[i];
            String[] b = elementToSplit.split("x"); // Split dimensions by "x"

            // Convert split string array to integer array
            int[] a = new int[b.length];
            for (int j = 0; j < b.length; j++) { // Use 'j' instead of 'i'
                a[j] = Integer.parseInt(b[j].trim()); // Convert to integer
            }

            // Calculate lw, wh, hl
            lw = a[0] * a[1];
            wh = a[1] * a[2];
            hl = a[0] * a[2];

            // Find the minimum of lw, wh, hl
            min = Math.min(a[0],a[1]);
            min = Math.min(min,a[2]);
            max = Math.max(a[0],a[1]);
            max = Math.max(max,a[2]);
            mid = (a[0]+a[1]+a[2])-min;
            mid = mid - max;

            // Calculate the total sum
            sum += 2*min+2*mid+(a[0]*a[1]*a[2]);
        }

        // Print the final sum
        System.out.println(sum);

        scanner.close();
    }
}
