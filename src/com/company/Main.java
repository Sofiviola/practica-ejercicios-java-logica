package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//EJERCICIO 1
        // Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.
/*
        Scanner scanner = new Scanner(System.in);
        int numIngresado;

        System.out.println("Introduzca un entero de 3 cifras: ");
        numIngresado = scanner.nextInt(); //Escanea el siguiente token de la entrada como un int

        System.out.println("Primera cifra de " + numIngresado + " -> " + (numIngresado/100));//Division de enteros toma solo el entero, ej: 9,99 da 9
        System.out.println("Cifra central de " + numIngresado + " -> " + (numIngresado/10)%10);// Modulo % devuelve el residuo de una division
        System.out.println("Última cifra  de " + numIngresado + " -> " + (numIngresado%10));
*/

//EJERCICIO 2
        //Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
        //Por ejemplo para un número N = 12345   La salida debe ser:
        //1
        //12
        //123
        //1234
        //12345
 /*
        Scanner scanner = new Scanner(System.in);
        int numIngresado;

        System.out.println("Introduzca un entero de 5 cifras: ");
        numIngresado = scanner.nextInt();

        System.out.println(numIngresado/10000);//Division de enteros toma solo el entero, ej: 9,99 da 9
        System.out.println(numIngresado/1000);
        System.out.println(numIngresado/100);
        System.out.println(numIngresado/10);
        System.out.println(numIngresado/1);
*/

//CONCLUSION:Con division reduzco el numero a las cifras segun los 0, es decir 120/100= 1,2. OJO: si es division de enteros(Int) solo toma el 1.
// CONCLUSION: Con % obtengo el resto de una division, 999 % 10, es 998 dividido 10 da un resto de 8. La cantidad de 0 del divisor es la cantidad de numero que seran resto del dividendo.
            // Con la division reduzco en base a los ceros y en el modulo toma de atras para adelante el numero como resto.

//EJERCICIO 3
        //Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
        //Por ejemplo para un número N = 12345    La salida debe ser:
        //5
        //45
        //345
        //2345
        //12345
/*
        Scanner scanner = new Scanner(System.in);
        int numIngresado;

        System.out.println("Introduzca un entero de 5 cifras: ");
        numIngresado = scanner.nextInt();

        System.out.println(numIngresado%10);
        System.out.println(numIngresado%100);
        System.out.println(numIngresado%1000);
        System.out.println(numIngresado%10000);
        System.out.println(numIngresado%100000);
*/

//EJERCICIO 4
        //Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
        //El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
        //Por ejemplo:
              //Si la fecha de nacimiento es 12/07/1980
              //Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
              //Número de la suerte: 28
/*
        Scanner scanner = new Scanner(System.in);
        int dia, mes, anio, suerte, suma, cifra1, cifra2, cifra3, cifra4;

        System.out.println("Introduzca fecha de nacimiento");

        System.out.print("día: ");
        dia = scanner.nextInt();

        System.out.print("mes: ");
        mes = scanner.nextInt();

        System.out.print("año: ");
        anio = scanner.nextInt();

        suma = dia + mes + anio;

        cifra1 = suma/1000;
        cifra2 = (suma/100)%10;
        cifra3 = (suma/10)%10;
        cifra4 = suma%10;

        suerte= cifra1 + cifra2 + cifra3 + cifra4;

        System.out.println("Tu numero de la suerte es: " + suerte);

*/

//EJERCICIO 5
        //Programa que calcule el precio de venta de un producto conociendo el precio por unidad (sin IVA) del producto,
        // el número de productos vendidos y el porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
/*
        Scanner scanner = new Scanner(System.in);
        int cantProdVendidos;
        double precioUnidad, IVA,  precioTotalSinIVA, porcentajeTotalIVA;

        System.out.print("precio por Unidad: ");
        precioUnidad = scanner.nextDouble();

        System.out.println("Introduzca porcentaje de IVA (sin el signo): ");
        IVA = scanner.nextDouble();

        System.out.println("Cantidad de productos vendidos");
        cantProdVendidos= scanner.nextInt();

        precioTotalSinIVA = precioUnidad * cantProdVendidos;
        porcentajeTotalIVA = precioTotalSinIVA * IVA /100;
        System.out.println("Precio de venta total-> " + (precioTotalSinIVA + porcentajeTotalIVA));
*/

//EJERCICIO 6
        //Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras.
           //Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.
/*
        Scanner scanner = new Scanner(System.in);
        int N, m;

        System.out.println("Ingrese un numero");
        N = scanner.nextInt();

        System.out.println("Ingrese cantidad de cifras a retirar");
        m= scanner.nextInt();

        N = N / (int)Math.pow(10,m); //La función Math.pow() retorna la base elevada al exponente, es decir, base^(exponente)
                                      // Math.pow devuelve un número de tipo double es necesario convertirlo a int para hacer la
                                     //división entre enteros
        System.out.println("Número modificado " + N);
*/

//EJERCICIO 7
        //Programa que lee una temperatura en grados centígrados y nos calcula y muestra por pantalla su valor equivalente en grados Reamur y Kelvin.
/*
        Scanner scanner = new Scanner(System.in);
        double c, r, k;

        System.out.println("Ingrese temperatura en grados centigrados: ");
        c = scanner.nextDouble();

        r = (c*80)/100;
        k=  ((r/4)*5) +273;

        System.out.println("El equivalente en Reamur es: " + r + " El equivalente en Kelvin es: " + k);
*/

//EJERCICIO 8
        //Programa Java que lea un número entero por teclado y calcule si es par o impar.
/*
        Scanner scanner = new Scanner(System.in);
        int numIngresado;

        System.out.println("Ingrese un numero");
        numIngresado = scanner.nextInt();

        if (numIngresado%2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
*/

//EJERCICIO 9
        //Programa que lea un carácter por teclado y compruebe si es una letra mayúscula
 /*
        char letraIngresada;

        System.out.println("Ingrese una letra: ");
        letraIngresada = (char) System.in.read(); //lee un solo caracter

        if (Character.isUpperCase(letraIngresada)) //utilizamos el método isUpperCase de la clase Character
        {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }

 */
        /* OTRA FORMA SIN METODO isUpperCase
        * if(letraIngresada>='A' && letraIngresada <='Z')
           System.out.println("Es una letra mayúscula");
           else
           System.out.println("No es una letra mayúscula");  */

//EJERCICIO 10
        // Programa que lea dos caracteres y compruebe si son iguales.
/*
        char car1, car2;

        System.out.print("Introduzca primer carácter: ");
        car1 = (char)System.in.read(); //lee un carácter

        System.in.read();  //saltar el intro que ha quedado en el buffer

        System.out.print("Introduzca segundo carácter: ");
        car2 = (char)System.in.read(); //lee el segundo carácter

        if(car1 == car2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
*/

//EJERCICIO 11
        //Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas
/*
        char car1, car2;

        System.out.print("Introduzca primer carácter: ");
        car1 = (char)System.in.read(); //lee un carácter

        System.in.read();  //saltar el intro que ha quedado en el buffer

        System.out.print("Introduzca segundo carácter: ");
        car2 = (char)System.in.read(); //lee el segundo carácter

        if(Character.isLowerCase(car1)){ //utilizamos el método isLowerCase de la clase Character
            if(Character.isLowerCase(car2)){
                System.out.println("Los dos son letras minúsculas");
            }else{
                System.out.println("El primero es una letra minúscula pero el segundo no");
            }
        }else if(Character.isLowerCase(car2)){
            System.out.println("El segundo es una letra minúscula pero el primero no");
        }else{
            System.out.println("Ninguno es una letra minúscula");
        }
*/

//EJERCICIO 12
        //Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).
/*
        char car1;

        System.out.print("Introduzca el carácter: ");
        car1 = (char)System.in.read(); //lee un carácter
        if(Character.isDigit(car1)) { //utilizamos el método isDigit de la clase Character
            System.out.println("Es un dígito numérico ");
        }else{
            System.out.println("No es un dígito numérico");
        }
*/

//EJERCICIO 13
        // Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo.
        // Se debe comprobar que el divisor no puede ser cero.
/*
        Scanner scanner = new Scanner(System.in);
        double one, two;

        System.out.println("Ingrese el primer numero: ");
        one = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        two = scanner.nextDouble();

        if(two != 0){
            System.out.println("El resultado de la division: " + one/ two);
        }else
            System.out.println("El numero dos no puede ser cero");
*/

//EJERCICIO 14
        //El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres.
 /*
        Scanner scanner = new Scanner(System.in);
        int one, two, three;

        System.out.println("Ingrese el primer numero: ");
        one = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        two = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        three = scanner.nextInt();

        if (one > two) {
            if (one > three) {
                System.out.println("El mayor es: " + one);
            } else {
                System.out.println("El mayor es: " + three);
            }
        } else if (two > three) {
            System.out.println("El mayor es: " + two);
        } else {
            System.out.println("El mayor es: " + three);
        }
 */
//EJERCICIO 15
        //Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente,
        // y comprueba si la hora que indican es una hora válida.
        //Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24.
        //El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos
 /*
        Scanner scanner = new Scanner(System.in);
        int H, M, S;

        System.out.println("Ingrese solo la hora: ");
        H = scanner.nextInt();

        System.out.println("Ingrese solo los minutos: ");
        M = scanner.nextInt();

        System.out.println("Ingrese solo los segundos: ");
        S = scanner.nextInt();

        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)
            System.out.println("La hora es correcta: " + H + ":" + M + ":" + S );
        else
            System.out.println("La hora es incorrecta");
*/

//EJERCICIO 16
        //Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28.
        // Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido
        // esté comprendido entre 1 y 12.
/*
        Scanner scanner = new Scanner(System.in);
        int  M;

        System.out.println("Introduzca el numero del mes que desea (Ej: Enero introducir 1): ");
        M = scanner.nextInt();

// Solucion 1
//        if(1<= M && M<=12){
//            if(M == 1 || M ==3 || M==5 || M ==7 || M== 8 || M==10 || M==12){
//                System.out.println(M + " es un mes de 31 dias");
//            }else if ( M == 2 ){
//                System.out.println(M + " es un mes de 28 dias");
//            }else{
//                System.out.println(M + " es un mes de 30 dias");
//            }
//        }


// Solucion 2
        if(M < 1 || M > 12) //se comprueba que el valor del mes es correcto
            System.out.println("Mes incorrecto");
        else{  //si el mes es correcto
            switch(M){  //se muestra el nombre mediante una instrucción switch
                case 1: System.out.print("Enero");
                    break;
                case 2: System.out.print("Febrero");
                    break;
                case 3: System.out.print("Marzo");
                    break;
                case 4: System.out.print("Abril");
                    break;
                case 5: System.out.print("Mayo");
                    break;
                case 6: System.out.print("Junio");
                    break;
                case 7: System.out.print("Julio");
                    break;
                case 8: System.out.print("Agosto");
                    break;
                case 9: System.out.print("Septiembre");
                    break;
                case 10: System.out.print("Octubre");
                    break;
                case 11: System.out.print("Noviembre");
                    break;
                case 12: System.out.print("Diciembre");
                    break;
            }
            // mostrar si es un mes de 30, 31 0 28 días
            if(M == 4 || M == 6 || M == 9 || M == 11)
                System.out.println(" es un mes de 30 días");
            else if(M == 2)
                System.out.println(" es un mes de 28 días");
            else
                System.out.println(" es un mes de 31 días");
        }
*/

//EJERCICIO 17
        //Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.
/*
        System.out.println("Numeros del 1 al 100: ");
        int i=1;
        while(i<=100) {
            System.out.println(i);
            i++;
        }
*/

//EJERCICIO 18
        //Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while
/*
    int i = 1;
        System.out.println("Numeros del 1 al 100: ");
        do{
                   System.out.println(i);
                   i++;
        }while(i<=100);
    }
 */

//EJERCICIO 19
        //Programa Java que muestre los números del 1 al 100 utilizando la instrucción for.
/*
  System.out.println("Numeros del 1 al 100: ");
        for(int i = 1; i<=100;i++)
            System.out.println(i);
    }
 */

//EJERCICIO 20
        //Programa Java que muestre los números del 100 al 1 utilizando la instrucción while
/*
  System.out.println("Numeros del 100 al 1: ");
         int i=100;
         while(i>=1)
         {
                   System.out.println(i);
                   i--;
         }
 */

//EJERCICIO 21
        //Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while.
 /*
  int i = 100;
        System.out.println("Numeros del 100 al 1: ");
         do{
                   System.out.println(i);
                   i--;
        }while(i>=1);
    }
  */

//EJERCICIO 22
        //Programa Java que muestre los números del 100 al 1 utilizando la instrucción for.
/*
System.out.println("Numeros del 100 al 1: ");
        for(int i=100;i>=1;i--)
            System.out.println(i);
    }
 */

//EJERCICIO 23
        //
//EJERCICIO 24
        //
//EJERCICIO 25
        //
//EJERCICIO 26
        //
//EJERCICIO 27
        //
//EJERCICIO 28
        //
//EJERCICIO 29
        //
//EJERCICIO 30
        //
//EJERCICIO 31
        //
//EJERCICIO 32
        //
//EJERCICIO 33
        //
//EJERCICIO 34
        //
//EJERCICIO 35
        //
   }}