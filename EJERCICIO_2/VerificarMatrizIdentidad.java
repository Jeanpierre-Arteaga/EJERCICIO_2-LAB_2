package LABORATORIO_02.EJERCICIO_2;

import java.util.Scanner;

public class VerificarMatrizIdentidad {
    
    private int matriz [][] = new int [3][3];

    public VerificarMatrizIdentidad (int matriz [][]){
        this.matriz = matriz ;
    }

    public boolean VerificadorMatrizIdentidad (){

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){

                if (i==j && matriz[i][j]!=1){

                    return false;
                }
                if (i!=j && matriz[i][j]!=0){

                    return false;
                }
            }
        }
    return true;
    }

    public static void main(String[] args) {

        int matriz [][] = new int [3][3];
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Ingrese los datos que contendrá la matriz 3x3: ");

            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){

                    System.out.print("Ingrese el valor para la posición " + "(" + (i+1) + "," + (j+1) + "): ");
                    matriz [i][j] = Entrada.nextInt();
                }
            }
        }
        System.out.println("\nMATRIZ INGRESADA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        VerificarMatrizIdentidad matrizPrueba = new VerificarMatrizIdentidad(matriz);

        if (matrizPrueba.VerificadorMatrizIdentidad()==true){

            System.out.println("Ha introducido una matriz identidad. ");
        } else{

            System.out.println("No es una matriz identidad. ");
        }
    }
}
