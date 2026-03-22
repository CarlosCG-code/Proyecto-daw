package cosasprogramacion;

import java.util.Arrays;

public class AR56 {
   static int primitiva(int[] apuesta,int[] combinacionganadora) {
    int aciertos = 0;
    for(int a : apuesta) {
        if(Arrays.binarySearch(combinacionganadora, a) >= 0){
            aciertos++;
        }
    }
    return aciertos;
    } 
    public static void main(String[] args) {
        int[] apuesta = {3,6,1,72,3};
        int[] combinacionganadora = {4,6,8,34,9};
        int resultado = primitiva(apuesta, combinacionganadora);
        System.out.println("Numero de aciertos: " + resultado);
    }
}
