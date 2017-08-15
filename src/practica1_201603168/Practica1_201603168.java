
package practica1_201603168;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Practica1_201603168 {
    
    static char [][] tab_minas;
    static char [][] tab_volteo;
    static int yaalli;
    static int fila;
    static int columna;
    static int tamaño;
    static int minas;
    static int op = 0;
    static boolean poder;
    static String line;
    static Random pos = new Random();
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Douglas Omar Arreola Martínez\n201603158\nIPC1 'A' Práctica 1\nBUSCAMINAS");
        line = scan.nextLine();
        do {
            System.out.println("1. Principiante\n2. Intermedio\n3. Avanzado\n4. Salir");
            System.out.println("Ingresa Opción");
            op = scan.nextInt();
            System.out.println();
            switch (op){
                case 1:
                    tamaño = 4;
                    minas = 4;
                    tab_minas = new char [tamaño][tamaño];
                    tab_volteo = new char [tamaño][tamaño];
                    for(int i=0; i<tamaño; i++){
                        for(int j=0; j<tab_minas.length; j++){
                            tab_minas[i][j] = ' ';
                        }
                    }
                    putminas();
                    imprTab();
                    imprTabvolt();
                    break;
                case 2:
                    tamaño = 6;
                    minas = 8;
                    tab_minas = new char [tamaño][tamaño];
                    tab_volteo = new char [tamaño][tamaño];
                    for(int i=0; i<tamaño; i++){
                        for(int j=0; j<tab_minas.length; j++){
                            tab_minas[i][j] = ' ';
                        }
                    }
                    putminas();
                    imprTab();
                    imprTabvolt();
                    break;
                case 3:
                    tamaño = 8;
                    minas = 12;
                    tab_minas = new char [tamaño][tamaño];
                    tab_volteo = new char [tamaño][tamaño];
                    for(int i=0; i<tamaño; i++){
                        for(int j=0; j<tab_minas.length; j++){
                            tab_minas[i][j] = ' ';
                        }
                    }
                    putminas();
                    imprTab();
                    imprTabvolt();
                    break;
                case 4:
                    System.out.println("Gracias, nos vemos pronto");
                    break;
                default:
                    System.out.println("Opción incorrecta prueba de nuevo");
            }
        } while (op != 4);
    }
    
    static void metodjuego(){
        
    }
    
    static boolean putminas(){
        for(int i = 0; i < tamaño; i++){
            fila = pos.nextInt(tamaño);
            columna = pos.nextInt(tamaño);
            if(tab_minas[fila][columna] == '*' ){
                return false;
            } else {    
                tab_minas[fila][columna] = '*';
            }
        }
        return true;
    }
    
    static void imprTab(){
        System.out.print(" ");
        for(int a = 1; a <= tamaño; a++){
           if (a < 10){
               System.out.print("  ");
               System.out.print(a);
           }
        }
        System.out.println();
        for(int c = 1; c <= tamaño; c++){
            if (c < 10){
                System.out.print(c + " ");
            }
            for(int d=0; d<tamaño; d++){
                System.out.print("[" + tab_minas[c-1][d] + "]");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
    
    static void imprTabvolt(){
        for(int i=0; i<tamaño; i++){
            for(int j=0; j<tab_volteo.length; j++){
                tab_volteo[i][j] = 'X';
            }
        }
        System.out.print(" ");
        for(int a = 1; a <= tamaño; a++){
           if (a < 10){
               System.out.print("  ");
               System.out.print(a);
           }
        }
        System.out.println();
        for(int c = 1; c <= tamaño; c++){
            if (c < 10){
                System.out.print(c + " ");
            }
            for(int d=0; d<tamaño; d++){
                System.out.print("[" + tab_volteo[c-1][d] + "]");
            }
            System.out.print("\n");
        }
        System.out.println();
    }  
}