
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
    static int ganar = 0;
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
    static String conv;
    static String filcol;
    static String line;
    static String opg;
    static String conf;
    static Random ran = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Douglas Omar Arreola Martínez\n201603158\nIPC1 'A' Práctica 1\nBUSCAMINAS");
        line = scan.nextLine();
        do {
            System.out.println("-----------------------------");
            System.out.println("1. Principiante\n2. Intermedio\n3. Avanzado\n4. Salir");
            System.out.println("Ingresa Opción");
            op = scan.nextInt();
            System.out.println("-----------------------------");
            switch (op){
                case 1:
                    principiante();
                    break;
                case 2:
                    intermedio();
                    break;
                case 3:
                    avanzado();
                    break;
                case 4:
                    System.out.println("Gracias, nos vemos pronto");
                    break;
                default:
                    System.out.println("Opción incorrecta prueba de nuevo");
            }
        } while (op != 4);
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
    
    static void principiante(){
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
        nums1();
        System.out.println("NIVEL PRINCIPIANTE");
        imprTab();
        imprTabvolt();
        volteo_despeje();
    }
    
    static void intermedio(){
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
        nums2();
        System.out.println("NIVEL INTERMEDIO");
        imprTab();
        imprTabvolt();
        volteo_despeje();
    }
    
    static void avanzado(){
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
        nums3();
        System.out.println("NIVEL AVANZADO");
        imprTab();
        imprTabvolt();
        volteo_despeje();
    }

    static void nums1(){
        /*    
            Linea de arriba
        */
        cont = 0;
        if(tab_minas[0][0] == '*'){
            
        } else {
            if(tab_minas[0][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[0][0] = ch;
        }
        //
        cont = 0;
        if(tab_minas[0][1] == '*'){
            
        } else {
            if(tab_minas[0][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][2] == '*'){
                cont = cont + 1;
            } 
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[0][1] = ch;
        }
        //
        cont = 0;
        if(tab_minas[0][2] == '*'){
            
        } else {
            if(tab_minas[0][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][3] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[0][2] = ch;
        }
        //
        cont = 0;
        if(tab_minas[0][3] == '*'){
            
        } else {
            if(tab_minas[0][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][3] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[0][3] = ch;
        }
        /*
            Linea de abajo
        */
        cont = 0;
        if(tab_minas[3][0] == '*'){
            
        } else {
            if(tab_minas[2][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[3][0] = ch;
        }
        //
        cont = 0;
        if(tab_minas[3][1] == '*'){
            
        } else {
            if(tab_minas[3][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][2] == '*'){
                cont = cont + 1;
            } 
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[3][1] = ch;
        }
        //
        cont = 0;
        if(tab_minas[3][2] == '*'){
            
        } else {
            if(tab_minas[3][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][3] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[3][2] = ch;
        }
        //
        cont = 0;
        if(tab_minas[3][3] == '*'){
            
        } else {
            if(tab_minas[3][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][3] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[3][3] = ch;
        }
        /*
            Columna izq
        */
        cont = 0;
        if(tab_minas[1][0] == '*'){
            
        } else {
            if(tab_minas[0][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[1][0] = ch;
        }
        //
        cont = 0;
        if(tab_minas[2][0] == '*'){
            
        } else {
            if(tab_minas[1][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[2][0] = ch;
        }
        /*
            Lado der
        */
        cont = 0;
        if(tab_minas[1][3] == '*'){
            
        } else {
            if(tab_minas[0][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][2] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[1][3] = ch;
        }
        //
        cont = 0;
        if(tab_minas[2][3] == '*'){
            
        } else {
            if(tab_minas[1][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][2] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[2][3] = ch;
        }
        /*
            Centro
        */
        cont = 0;
        for(int p = 1; p < 3; p++){
            cont = 0;
            for(int o = 1; o < 3; o++){
                cont = 0;
                if(tab_minas[p][o] == '*'){
                    
                } else {
                    if(tab_minas[p - 1][o - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[p - 1][o] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[p - 1][o + 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[p][o - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[p][o + 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[p + 1][o - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[p + 1][o] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[p + 1][o + 1] == '*'){
                        cont = cont + 1;
                    }
                    switch(cont){
                        case 0:
                            ch = '0';
                            break;
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
                    tab_minas[p][o] = ch;
                }
            }
        }
    }

    static void nums2(){
        /*    
            Linea de arriba
        */
        cont = 0;
        if(tab_minas[0][0] == '*'){
            
        } else {
            if(tab_minas[0][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[0][0] = ch;
        }
        //
        cont = 0;
        if(tab_minas[0][1] == '*'){
            
        } else {
            if(tab_minas[0][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][2] == '*'){
                cont = cont + 1;
            } 
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[0][1] = ch;
        }
        //
        cont = 0;
        if(tab_minas[0][2] == '*'){
            
        } else {
            if(tab_minas[0][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][3] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[0][2] = ch;
        }
        //
        cont = 0;
        if(tab_minas[0][3] == '*'){
            
        } else {
            if(tab_minas[0][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][4] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[0][3] = ch;
        }
        //
        cont = 0;
        if(tab_minas[0][4] == '*'){
            
        } else {
            if(tab_minas[0][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][5] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][5] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[0][4] = ch;
        }
        //
        cont = 0;
        if(tab_minas[0][5] == '*'){
            
        } else {
            if(tab_minas[0][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][5] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[0][5] = ch;
        }
        /*
            Linea de abajo
        */
        cont = 0;
        if(tab_minas[5][0] == '*'){
            
        } else {
            if(tab_minas[4][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[5][0] = ch;
        }
        //
        cont = 0;
        if(tab_minas[5][1] == '*'){
            
        } else {
            if(tab_minas[5][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][2] == '*'){
                cont = cont + 1;
            } 
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[5][1] = ch;
        }
        //
        cont = 0;
        if(tab_minas[5][2] == '*'){
            
        } else {
            if(tab_minas[5][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][3] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[5][2] = ch;
        }
        //
        cont = 0;
        if(tab_minas[5][3] == '*'){
            
        } else {
            if(tab_minas[5][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][2] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][4] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[5][3] = ch;
        }
        //
        cont = 0;
        if(tab_minas[5][4] == '*'){
            
        } else {
            if(tab_minas[5][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][5] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][3] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][5] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[5][4] = ch;
        }
        //
        cont = 0;
        if(tab_minas[5][5] == '*'){
            
        } else {
            if(tab_minas[5][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][5] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[5][5] = ch;
        }
        /*
            Columna izq
        */
        cont = 0;
        if(tab_minas[1][0] == '*'){
            
        } else {
            if(tab_minas[0][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[1][0] = ch;
        }
        //
        cont = 0;
        if(tab_minas[2][0] == '*'){
            
        } else {
            if(tab_minas[1][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[2][0] = ch;
        }
        //
        cont = 0;
        if(tab_minas[3][0] == '*'){
            
        } else {
            if(tab_minas[2][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[3][0] = ch;
        }
        //
        cont = 0;
        if(tab_minas[4][0] == '*'){
            
        } else {
            if(tab_minas[3][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[4][0] = ch;
        }
        /*
            Lado der
        */
        cont = 0;
        if(tab_minas[1][5] == '*'){
            
        } else {
            if(tab_minas[0][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[0][5] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][5] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[1][5] = ch;
        }
        //
        cont = 0;
        if(tab_minas[2][5] == '*'){
            
        } else {
            if(tab_minas[1][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][5] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][5] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[2][5] = ch;
        }
        //
        cont = 0;
        if(tab_minas[3][5] == '*'){
            
        } else {
            if(tab_minas[2][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[2][5] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][5] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[3][5] = ch;
        }
        //
        cont = 0;
        if(tab_minas[4][5] == '*'){
            
        } else {
            if(tab_minas[3][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[3][5] == '*'){
                cont = cont + 1;
            } if(tab_minas[4][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][4] == '*'){
                cont = cont + 1;
            } if(tab_minas[5][5] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
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
            }
            tab_minas[4][5] = ch;
        }
        /*
            Centro
        */
        cont = 0;
        for(int ñ = 1; ñ < 5; ñ++){
            cont = 0;
            for(int l = 1; l < 5; l++){
                cont = 0;
                if(tab_minas[ñ][l] == '*'){
                    
                } else {
                    if(tab_minas[ñ - 1][l - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ - 1][l] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ - 1][l + 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ][l - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ][l + 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ + 1][l - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ + 1][l] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ + 1][l + 1] == '*'){
                        cont = cont + 1;
                    }
                    switch(cont){
                        case 0:
                            ch = '0';
                            break;
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
                    tab_minas[ñ][l] = ch;
                }
            }
        }
    }

    static void nums3(){
        // Esquina supiz
        cont = 0;
        if(tab_minas[0][0] == '*'){
            
        } else {
            if(tab_minas[0][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[0][0] = ch;
        }
        // Esquina supder
        cont = 0;
        if(tab_minas[0][7] == '*'){
            
        } else {
            if(tab_minas[0][6] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][6] == '*'){
                cont = cont + 1;
            } if(tab_minas[1][7] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[0][7] = ch;
        }
        // Esquina infiz
        cont = 0;
        if(tab_minas[7][0] == '*'){
            
        } else {
            if(tab_minas[6][0] == '*'){
                cont = cont + 1;
            } if(tab_minas[6][1] == '*'){
                cont = cont + 1;
            } if(tab_minas[7][1] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[7][0] = ch;
        }
        // Esquina infder
        cont = 0;
        if(tab_minas[7][7] == '*'){
            
        } else {
            if(tab_minas[7][6] == '*'){
                cont = cont + 1;
            } if(tab_minas[6][6] == '*'){
                cont = cont + 1;
            } if(tab_minas[6][7] == '*'){
                cont = cont + 1;
            }
            switch(cont){
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
            }
            tab_minas[7][7] = ch;
        }
        /*
            Centro
        */
        cont = 0;
        for(int ñ = 1; ñ < 7; ñ++){
            cont = 0;
            for(int l = 1; l < 7; l++){
                cont = 0;
                if(tab_minas[ñ][l] == '*'){
                    
                } else {
                    if(tab_minas[ñ - 1][l - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ - 1][l] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ - 1][l + 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ][l - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ][l + 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ + 1][l - 1] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ + 1][l] == '*'){
                        cont = cont + 1;
                    } if(tab_minas[ñ + 1][l + 1] == '*'){
                        cont = cont + 1;
                    }
                    switch(cont){
                        case 0:
                            ch = '0';
                            break;
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
                    tab_minas[ñ][l] = ch;
                }
            }
        }
        // Linea arriba
        cont = 0;
        for( int m = 1; m < 7; m++){
            cont = 0;
            if(tab_minas[0][m] == '*'){
                
            } else {
                if (tab_minas[0][m - 1] == '*'){
                    cont = cont + 1;
                } if (tab_minas[0][m + 1] == '*'){
                    cont = cont + 1;
                } if (tab_minas[1][m - 1] == '*'){
                    cont = cont + 1;
                } if (tab_minas[1][m] == '*'){
                    cont = cont + 1;
                } if (tab_minas[1][m + 1] == '*'){
                    cont = cont + 1;
                }
                switch(cont){
                case 0:
                    ch = '0';
                    break;
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
                }
                tab_minas[0][m] = ch;
            }
        }
        // Linea abajo
        cont = 0;
        for( int m = 1; m < 7; m++){
            cont = 0;
            if(tab_minas[7][m] == '*'){
                
            } else {
                if (tab_minas[7][m - 1] == '*'){
                    cont = cont + 1;
                } if (tab_minas[7][m + 1] == '*'){
                    cont = cont + 1;
                } if (tab_minas[6][m - 1] == '*'){
                    cont = cont + 1;
                } if (tab_minas[6][m] == '*'){
                    cont = cont + 1;
                } if (tab_minas[6][m + 1] == '*'){
                    cont = cont + 1;
                }
                switch(cont){
                case 0:
                    ch = '0';
                    break;
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
                }
                tab_minas[7][m] = ch;
            }
        }
        // Linea izquierda
        cont = 0;
        for( int m = 1; m < 7; m++){
            cont = 0;
            if(tab_minas[m][0] == '*'){
                
            } else {
                if (tab_minas[m - 1][0] == '*'){
                    cont = cont + 1;
                } if (tab_minas[m - 1][1] == '*'){
                    cont = cont + 1;
                } if (tab_minas[m][1] == '*'){
                    cont = cont + 1;
                } if (tab_minas[m + 1][0] == '*'){
                    cont = cont + 1;
                } if (tab_minas[m + 1][1] == '*'){
                    cont = cont + 1;
                }
                switch(cont){
                case 0:
                    ch = '0';
                    break;
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
                }
                tab_minas[m][0] = ch;
            }
        }
        // Linea derecha
        cont = 0;
        for( int m = 1; m < 7; m++){
            cont = 0;
            if(tab_minas[m][7] == '*'){
                
            } else {
                if (tab_minas[m - 1][6] == '*'){
                    cont = cont + 1;
                } if (tab_minas[m - 1][7] == '*'){
                    cont = cont + 1;
                } if (tab_minas[m][6] == '*'){
                    cont = cont + 1;
                } if (tab_minas[m + 1][6] == '*'){
                    cont = cont + 1;
                } if (tab_minas[m + 1][7] == '*'){
                    cont = cont + 1;
                }
                switch(cont){
                case 0:
                    ch = '0';
                    break;
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
                }
                tab_minas[m][7] = ch;
            }
        }
    }

    static void volteo_despeje(){
        do {
            ganar = 0;
            ganar();
            if(ganar == minas){
                System.out.println("Has ganado, muchas felicidades");
                perder = 1;
            } else {
                System.out.println("Presiona 'Enter' para continuar");
                scan.nextLine();
                System.out.println("-----------------------------");
                System.out.println("Voltear: V\nReiniciar: R\nSalir: S\n\n");
                System.out.printf("Ingrese Opción:");
                opg = scan.next();
                opg = opg.toLowerCase();
                switch(opg){
                    case "r":
                        switch (op) {
                            case 1:
                                principiante();
                                break;
                            case 2:
                                intermedio();
                                break;
                            case 3:
                                avanzado();
                                break;
                            default:
                            break;
                        }
                        break;
                    case "v":
                        scan.nextLine();
                        System.out.println("Ingresar fila y columna separada por una coma ',' ");
                        filcol = scan.nextLine();
                        conv = "" + filcol.charAt(0);
                        pedirx = (Integer.parseInt(conv));
                        conv = "" + filcol.charAt(2);
                        pediry = (Integer.parseInt(conv));
                        if(1 <= pedirx && pedirx <= tamaño && 1 <= pediry && pediry <= tamaño){
                            System.out.println("¿Aceptar datos ingresados?\nSi: Y\nNo: N");
                            conf = scan.nextLine();
                            conf = conf.toLowerCase();
                            switch(conf){
                                case "y":
                                    if(tab_minas[pedirx - 1][pediry - 1] == '*'){
                                        System.out.println("Has perdido, bien jugado");
                                        System.out.println("Este es tu resultado");
                                        tab_volteo[pedirx - 1][pediry - 1] = '*';
                                        imprTab();
                                        imprTabvolt();
                                        perder = 1;
                                    } else {
                                        despeje();
                                        tab_volteo[pedirx - 1][pediry - 1] = tab_minas[pedirx - 1][pediry - 1];
                                        imprTab();
                                        imprTabvolt();
                                    }
                                    break;
                                case "n":
                                    
                                    break;
                            }
                        } else {
                            System.out.println("Fuera de rango");
                        }
                        break;
                    case "s":
                        perder = 1;
                        break;
                    default:
                        System.out.println("Te has equivocado, prueba de nuevo");
                }
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

    static void despeje(){
        // esquina supiz
        if(pedirx-1 == 0 && pediry-1 == 0){
            if(tab_minas[0][1] == '*'){
                
            } else {
                tab_volteo[0][1] = tab_minas[0][1];
            }
            if (tab_minas[1][0] == '*'){
                
            } else {
                tab_volteo[1][0] = tab_minas[1][0];
            }
        } else if (pedirx == tamaño && pediry-1 == 0){ //Esquina infiz
            if(tab_minas[tamaño - 2][0] == '*'){
                
            } else {
                tab_volteo[tamaño - 2][0] = tab_minas[tamaño - 2][0];
            }
            if (tab_minas[tamaño - 1][1] == '*'){
                
            } else {
                tab_volteo[tamaño - 1][1] = tab_minas[tamaño - 1][1];
            }
        } else if (pedirx - 1 == 0 && pediry == tamaño){ //Esquina supder
            if(tab_minas[0][tamaño - 2] == '*'){
                
            } else {
                tab_volteo[0][tamaño - 2] = tab_minas[0][tamaño - 2];
            }
            if (tab_minas[1][tamaño - 1] == '*'){
                
            } else {
                tab_volteo[1][tamaño - 1] = tab_minas[1][tamaño - 1];
            }
        } else if (pedirx == tamaño && pediry == tamaño){ //Esquina infder
            if(tab_minas[tamaño - 1][tamaño - 2] == '*'){
                
            } else {
                tab_volteo[tamaño - 1][tamaño - 2] = tab_minas[tamaño - 1][tamaño - 2];
            }
            if (tab_minas[tamaño - 2][tamaño - 1] == '*'){
                
            } else {
                tab_volteo[tamaño - 2][tamaño - 1] = tab_minas[tamaño - 2][tamaño - 1];
            }
        } else if (pediry == 1){ //linea izquierda
            for(int y = 1; y < tamaño-1; y++ ){
                if (y == pedirx-1){
                    if(tab_minas[y - 1][0] == '*' ){

                    } else {
                        tab_volteo[y - 1][0] = tab_minas[y - 1][0];
                    }
                    if(tab_minas[y][1] == '*' ){

                    } else {
                        tab_volteo[y][1] = tab_minas[y][1];
                    }
                    if(tab_minas[y + 1][0] == '*' ){

                    } else {
                        tab_volteo[y + 1][0] = tab_minas[y + 1][0];
                    }
                }
            }
        } else if (pediry == tamaño){ //linea derecha
            for(int y = 1; y < tamaño-1; y++ ){
                if (y == pedirx-1){
                    if(tab_minas[y - 1][pediry - 1] == '*' ){

                    } else {
                        tab_volteo[y - 1][pediry - 1] = tab_minas[y - 1][pediry - 1];
                    }
                    if(tab_minas[y][pediry - 2] == '*' ){

                    } else {
                        tab_volteo[y][pediry - 2] = tab_minas[y][pediry - 2];
                    }
                    if(tab_minas[y + 1][pediry - 1] == '*' ){

                    } else {
                        tab_volteo[y + 1][pediry - 1] = tab_minas[y + 1][pediry - 1];
                    }
                }
            }
        } else if (pedirx == 1){ //linea arriba
            for(int y = 1; y < tamaño-1; y++ ){
                if (y == pediry-1){
                    if(tab_minas[0][y - 1] == '*' ){

                    } else {
                        tab_volteo[0][y - 1] = tab_minas[0][y - 1];
                    }
                    if(tab_minas[1][y] == '*' ){

                    } else {
                        tab_volteo[1][y] = tab_minas[1][y];
                    }
                    if(tab_minas[0][y + 1] == '*' ){

                    } else {
                        tab_volteo[0][y + 1] = tab_minas[0][y + 1];
                    }
                }
            }
        } else if (pedirx == tamaño){ //linea abajo
            for(int y = 1; y < tamaño-1; y++ ){
                if (y == pediry-1){
                    if(tab_minas[tamaño - 1][y - 1] == '*' ){

                    } else {
                        tab_volteo[tamaño - 1][y - 1] = tab_minas[tamaño - 1][y - 1];
                    }
                    if(tab_minas[tamaño - 2][y] == '*' ){

                    } else {
                        tab_volteo[tamaño - 2][y] = tab_minas[tamaño - 2][y];
                    }
                    if(tab_minas[tamaño - 1][y + 1] == '*' ){

                    } else {
                        tab_volteo[tamaño - 1][y + 1] = tab_minas[tamaño - 1][y + 1];
                    }
                }
            }
        } else {
            if(tab_minas[pedirx - 2][pediry - 1] == '*' ){
                //Arriba
            } else {
                tab_volteo[pedirx - 2][pediry - 1] = tab_minas[pedirx - 2][pediry - 1];
            }
            if(tab_minas[pedirx - 1][pediry - 2] == '*' ){
                //Izquierda
            } else {
                tab_volteo[pedirx - 1][pediry - 2] = tab_minas[pedirx - 1][pediry - 2];
            }
            if(tab_minas[pedirx - 1][pediry] == '*' ){
                //Derecha
            } else {
                tab_volteo[pedirx - 1][pediry] = tab_minas[pedirx - 1][pediry];
            }
            if(tab_minas[pedirx][pediry - 1] == '*' ){
                //Abajo
            } else {
                tab_volteo[pedirx][pediry - 1] = tab_minas[pedirx][pediry - 1];
            }
        }
    }

    static void ganar(){
        for(int f = 0; f < tamaño; f++){
            for(int h = 0; h < tamaño; h++){
                if(tab_volteo[f][h] == 'X'){
                    ganar = ganar + 1;
                }
            }
        }
    }
}