
public class Main {
    public static void main(String[] args) {
        /*
           -----------------------Tipos de datos en JAVA-------------------------------------------------------

        Boolean - Se usa para guardar valores de true - false
        char - Se utiliza para guardar unicamente un caracter
        Float - Se utiliza para manejar numeros con decimales, no utilizar si necesitas mucha exactitud
        Double - Cantidad ilimitada de caracteres, tambien ocupa mucho espacio en memoria tener cuidado.
        Long - Rango de valores de -2^65  a 2^65
        Int - Rango de valores de -2^35  a 2^35

        */

        //************************** DECLARANDO VARIABLES *********************************************
        /*


        Para declarar una variable, al ser un lenguaje tipado necesitas colocar el tipo de la variable que vas a utilizar
        En este caso por ejemplo para declarar una variable de tipo Entero (numerico) lo hacemos de la siguiente manera:

        Int            numero1                     = 10;
         ^               ^                           ^
        Tipo | Nombre de la variable  |   Valor que deseamos asignar

        ******************************* Imprimir datos **********************************************

        para imprimir datos en la consola hacemos uso de la funcion:
                        System.out.println();

         todo lo que este dentro de los parentesis debe estar dentro de "" para mostrar lo que se va imprimir, salvo
         si se desea imprimir una variable que se hace de la siguiente manera:
         */

        //Ejemplo solo con una cadena de texto
        System.out.println("Hola esto es una cadena de texto");

        //Ejemplo imprimiendo el contenido de una variable:
        int valor1 = 10;
        System.out.println("Soy la variable valor1 y mi valor es: "+valor1);

        //Esta funcion para imprimir datos lleva cierta jerarquia es decir si quieres sumarle un numero al valor de la variable
        //Dentro del system.out si haces esto:

        System.out.println("Soy la variable valor1 y mi valor sumandole un numero es: "+valor1+5);
        //Si te diste cuenta no sumo los valores si que no en su lugar hizo una operacion de concatenacion, esto se debe
        //a que dentro del SOUT es considerado un string, si deseas operar algo dentro de este deberias hacerlo de la siguiente manera:

        System.out.println("Soy la variable valor1 y mi valor sumandole un numero es: "+(valor1+5));

        /*
        Tambien puedes hacer uso de mas variables para sumar datos u hacer cualquier otra operacion por ejemplo para sumar:
         */
        int numero1 = 10;
        int numero2= 5;
        int resultado = numero1 + numero2;

        System.out.println("El resultado de la operacion es este: "+ resultado );

        //Ahora como tarea ocupas hacer una calculadora de las operaciones basicas con los numeros enteros y con los flotantes (int,float)



    }
}