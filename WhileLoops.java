import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber

        int randomNumber = getRandomNumber(7);
        while(randomNumber!=7){
            randomNumber = getRandomNumber(7);

        }
        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        int randomNumber2 = getRandomNumber(100);
        while(randomNumber2 < 70){
            randomNumber2 = getRandomNumber(100);
        }
        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber

        int randomNumber3 = getRandomNumber(100);
        int userNumber;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write a number: ");
            userNumber = scanner.nextInt();
            if(userNumber < randomNumber3){
                System.out.println("Your number is under the random number.");
            }
            if(userNumber > randomNumber3){
                System.out.println("Your number is greater than de random number");
            }
        }while (!(randomNumber3 == userNumber));

        if(randomNumber3 == userNumber){
            System.out.println("The number is " + userNumber);
        }
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
