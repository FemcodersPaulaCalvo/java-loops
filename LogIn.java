import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";
        String inputUsername;
        String inputPassword;
        boolean logInOk = false;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Username: ");
            inputUsername = scanner.nextLine();
            System.out.print("Password: ");
            inputPassword = scanner.nextLine();
            logInOk = (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) ? true : false;
            System.out.println(logInOk ? "¡Access granted!" : "Incorrect data, please try again");

        } while (logInOk == false);

        scanner.close();
    }
}
