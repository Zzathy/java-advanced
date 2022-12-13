/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Task1;

//Import the Scanner library
import java.util.Scanner;

/**
 *
 * @author Izza Ihsan Fathony | 202110370311297
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input array length : ");
        int length = input.nextInt();
        int[] inNumber = new int[length];
        String[] inString = new String[length];
        
        int countNumber = 0, countString = 0;
        
        int i = 1;
        while(i <= length) {
            System.out.print("Input data : ");
            String data = input.nextLine();

            if(data.matches("[0-9]+")) {
                countNumber++;
                for(int j = 0; j < countNumber; j++) {
                    inNumber[j] = Integer.valueOf(data);
                }
            } else if(data.matches("[a-zA-Z]")) {
                for(int k = 0; k < countNumber; k++) {
                    inString[k] = data;
                }
            } else {
                i--;
            }
        }
        
        for(int a = 0; a < length; a++) {
            System.out.print("[" + a + "] = ");
            System.out.print(inNumber[a] + ",");
        }
        
    }
    
}
