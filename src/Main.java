
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //pi*r2
        double r;       // define radius r
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yari Capini Giriniz : " );       //ask user for r value
        r = input.nextInt();                // save r value

        double area = Math.PI * Math.pow(r,2);      // circle area calculation
        double perimeter = Math.PI * 2 * r;         // circle perimeter calculation

        System.out.println("Dairenin alani : " + area);         // print area
        System.out.println("Darirenin cevresi : " + perimeter); // print perimeter

    }
}