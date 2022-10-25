/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task3;

/**
 *
 * @author izzai
 */
public class Main {
    static boolean isCube(long input) {
        return (Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input))) == input;
    }
}
