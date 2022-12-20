package Task1; // Package name

// Import library that app need
import java.util.*;
import java.io.*;

/**
 * @author Izza Ihsan Fathony | 202110370311297
 */

public class Main {
    // Main method
    public static void main(String[] args) {
        // Initialization variable for Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Input length : ");
        int length = input.nextInt(); // Catch user input
        String clean = input.nextLine(); // cleaning Scanner, because error from change data type

        /**
         * Inizialitation array variable but temporary
         * length from input user
         */
        int[] inNumberTemp = new int[length];
        String[] inStringTemp = new String[length];

        // Iniziliation for index n length for inString n inNumber
        int countNumber = 0, countString = 0;

        // Input data process
        for (int i = 0; i < length; i++) {
            System.out.print("Input data : ");
            String data = input.nextLine();

            // Check if input is number or string
            if (data.matches("[0-9]+")) {
                inNumberTemp[countNumber] = Integer.valueOf(data);
                countNumber++;
            } else {
                inStringTemp[countString] = data;
                countString++;
            }
        }

        // Inizialitation array variable real use
        String[] inString = new String[countString];
        int[] inNumber = new int[countNumber];

        // Transfer data from temporary variable to real variable
        for (int i = 0; i < countString; i++) {
            inString[i] = inStringTemp[i];
        }
        for (int i = 0; i < countNumber; i++) {
            inNumber[i] = inNumberTemp[i];
        }

        // Write File
        try {
            FileWriter writer = new FileWriter("input.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            // Write array to file
            bufferedWriter.write("Angka: " + Arrays.toString(inNumber));
            bufferedWriter.newLine();
            bufferedWriter.write("String: " + Arrays.toString(inString));

            bufferedWriter.close(); // Close file

            System.out.println("Data berhasil disimpan ke dalam file input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read File
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            // Cek if file has text at nextline
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
