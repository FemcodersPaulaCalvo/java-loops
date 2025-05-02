public class ForLoops {
    public static void main(String[] args) {

        //Escribe un bucle for que imprima números del 1 al 10

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        //Escribe un bucle for que imprima "¡Hola FemCoders!" 5 veces

        for (int i = 0; i <= 5; i++){
            System.out.println("¡Hello, FemCoders!");
        }

        //Escribe un bucle for que imprima la tabla de multiplicar del número 7 (del 1 al 10)

        for (int i = 1; i <= 10; i++){
            System.out.print(i * 7 + " ");
        }

        //Escribe un bucle for que imprima números del 10 al 1 

        for (int i = 10; i > 0; i--){
            if(i == 10){System.out.println(i + " ");}
            System.out.print(i + " ");
        }

        //Escribe un bucle for que imprima los 10 primeros números impares
        int oddNum = 0;
        for (int i = 1; oddNum <= 10; i++){
            if(i%2 != 0) {
                if (oddNum == 0) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                }
                oddNum++;
            }
        }

        System.out.println();

        //Escribe un bucle for que encuentre el número más pequeño que sea mayor a 20 y que sea divisible para 8, usando 'break'.
        //Imprime: El número más pequeño mayor de 20 que es divisible para 8 es <result>

        for(int i = 20; i >= 1; i++){
            if(i > 20 && (i%8 == 0)){
                System.out.println("The smallest number greater than 20 that is divisible by 8 is " + i);
                break;
            }
        }

        //Escribe un bucle for que imprima números pares del 1 al 20 saltando los números impares usando 'continue'

        for(int i = 1; i <= 20; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }

}