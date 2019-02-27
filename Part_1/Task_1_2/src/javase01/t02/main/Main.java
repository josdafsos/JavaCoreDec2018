package javase01.t02.main;

/*  Задание 1.2
    Найти наименьший номер элемента последовательности,
    для которого выполняется условеи. Вывести на экран этот номер
    и все эелменты ai, где i = 1, 2, ..., n

 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       double eps = 1;

        Scanner input = new Scanner(System.in);
        while(eps!=0){
            System.out.println("Write 0 < epsilone < 1, write 0 to exit");
            eps = input.nextDouble();
            if(eps<=0)
                break;
            else if(eps >= 1 ) {
                System.out.println("Epsilone must be < 1");
                continue;
            }
            int i = 1;
             do{
                System.out.println("i = " + (i) + " ai = " + (1 / Math.pow(i+1, 2)));
            }while( (1/Math.pow( ++i, 2)) >= eps );
        }




    }
}
