package javase01.t03.main;
import java.util.Scanner;

/*  Задание 3
    Составить программу для вычисления значений функции F на отрезке [a,b]
    с шагом h. Результат представить в виде таблице.
 */




public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        double a,b,h;
	    System.out.println("Enter a");
	    a = input.nextDouble();
        System.out.println("Enter b");
        b = input.nextDouble();
        System.out.println("Enter h");
        h = input.nextDouble();

        while(a <= b){
            System.out.println(a + "     " + (Math.tan(2*a)-3));
            a+=h;
        }
    }
}
