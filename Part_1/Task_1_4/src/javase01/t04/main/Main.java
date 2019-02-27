package javase01.t04.main;

/*
    Задание 4
 */

public class Main {

    public static void main(String[] args) {
	double[] arrayA = { 1, 2, 3, 14, 5, 6 };

    double maxNumber = arrayA[0] + arrayA[arrayA.length-1];
    for(int i = 0; i <= arrayA.length/2 ; i++ ){

        double bufNum =  arrayA[i] + arrayA[arrayA.length-1-i];
        //System.out.println(" arrayA[" + i + "} + arrayA[" + (arrayA.length-1-i) + "] = " + bufNum);
        maxNumber = maxNumber >= bufNum ? maxNumber : bufNum;
    }

    System.out.println("max = " + maxNumber);

    }
}
