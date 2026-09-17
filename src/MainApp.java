import java.util.Scanner;

/**
 * PROG5121 PoE Part 1 - console driver.
 */
public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login userLogin = new Login();

        System.out.println("==========================================");
        System.out.println("       USER ACCOUNT REGISTRATION          ");
        System.out.println("==========================================");

        System.out.print("Enter First Name: ");
        userLogin.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        userLogin.setLastName(scanner.nextLine());

        System.out.print("Enter Username: ");
        userLogin.setUsername(scanner.nextLine());

        System.out.print("Enter Password: ");
        userLogin.setPassword(scanner.nextLine());

        System.out.print("Enter Cell Phone Number (e.g. +27838968976): ");
        userLogin.setCellPhoneNumber(scanner.nextLine());

        System.out.println("\n--- Registration Output ---");
        System.out.println(userLogin.registerUser());

        if (userLogin.checkUserName() && userLogin.checkPasswordComplexity() && userLogin.checkCellPhoneNumber()) {
            System.out.println("\n==========================================");
            System.out.println("             USER LOGIN                   ");
            System.out.println("==========================================");

            System.out.print("Enter Username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter Password: ");
            String loginPassword = scanner.nextLine();

            boolean isLoggedIn = userLogin.loginUser(loginUsername, loginPassword);

            System.out.println("\n--- Login Output ---");
            System.out.println(userLogin.returnLoginStatus(isLoggedIn));
        } else {
            System.out.println("\nRegistration incomplete. Please correct the formatting issues and try again.");
        }

        scanner.close();
    }
}
