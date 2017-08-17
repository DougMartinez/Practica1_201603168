
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
    static char ch;
    static int perder = 0;
    static int abrir;
    static int pedirx;
    static int pediry;
    static int yaalli;
    static int fila;
    static int columna;
    static int tamaño;
    static int cont;
    static int minas;
    static int op = 0;
    static boolean poder;
    static String line;
    static Random ran = new Random();
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
                    for(int i=0; i<tamaño; i++){
                        for(int j=0; j<tab_volteo.length; j++){
                            tab_volteo[i][j] = 'X';
                        }
                    }
                    putminas();
                    relleno();
                    imprTab();
                    imprTabvolt();
                    volteo_despeje();
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
                    for(int i=0; i<tamaño; i++){
                        for(int j=0; j<tab_volteo.length; j++){
                            tab_volteo[i][j] = 'X';
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
                    for(int i=0; i<tamaño; i++){
                        for(int j=0; j<tab_volteo.length; j++){
                            tab_volteo[i][j] = 'X';
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
        yaalli = 0;
        do{
            fila = ran.nextInt(tamaño);
            columna = ran.nextInt(tamaño);
            if(tab_minas[fila][columna] == '*' ){
            } else {    
                tab_minas[fila][columna] = '*';
                yaalli ++;
            }
        } while(yaalli < minas);
        return true;
    }
    
    static void relleno(){
        
    }
    
    static void volteo_despeje(){
        do {
            System.out.println("Pedir fila");
            pedirx = scan.nextInt();
            System.out.println("Pedir columna");
            pediry = scan.nextInt();
            if(tab_minas[pedirx - 1][pediry - 1] == '*'){
                System.out.println("Perder");
                tab_volteo[pedirx - 1][pediry - 1] = '*';
                imprTab();
                imprTabvolt();
                perder = 1;
            } else {
                if(tab_minas[pedirx - 1][pediry - 2] == '*'){
                    cont = cont + 1;
                } if(tab_minas[pedirx - 2][pediry - 2] == '*'){
                    cont = cont + 1;
                } if(tab_minas[pedirx - 2][pediry - 1] == '*'){
                    cont = cont + 1;
                } if(tab_minas[pedirx - 2][pediry] == '*'){
                    cont = cont + 1;
                } if(tab_minas[pedirx - 1][pediry] == '*'){
                    cont = cont + 1;
                } if(tab_minas[pedirx][pediry] == '*'){
                    cont = cont + 1;
                } if(tab_minas[pedirx][pediry - 1] == '*'){
                    cont = cont + 1;
                } if(tab_minas[pedirx][pediry - 2] == '*'){
                    cont = cont + 1;
                }
                switch(cont){
                    case 1:
                        ch = '1';
                        break;
                    case 2:
                        ch = '2';
                        break;
                    case 3:
                        ch = '3';
                        break;
                    case 4:
                        ch = '4';
                        break;
                    case 5:
                        ch = '5';
                        break;
                    case 6:
                        ch = '6';
                        break;
                    case 7:
                        ch = '7';
                        break;
                    case 8:
                        ch = '8';
                        break;
                }
                System.out.println("minas: " + ch);
                tab_volteo[pedirx - 1][pediry - 1] = ch;
                imprTab();
                imprTabvolt();
            } 
        }while(perder != 1);
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