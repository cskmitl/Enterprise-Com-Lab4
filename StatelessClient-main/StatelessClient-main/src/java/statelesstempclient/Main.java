/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statelesstempclient;

import java.util.Scanner;
import javax.ejb.EJB;
import mybeans.TempCalulateBeanRemote;

/**
 *
 * @author tleku
 */
public class Main {

    @EJB
    private static TempCalulateBeanRemote tempCalulateBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Degree in Fahrenheit: ");
        double fTemp = in.nextDouble();
        System.out.println(fTemp + " Fahrenheit = " + tempCalulateBean.fToC(fTemp) + " Celsius");
    }
    
}
