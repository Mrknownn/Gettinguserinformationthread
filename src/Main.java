import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Thread {
    public static final String PERSON_URL = "c:\\io\\turgutozaluniversitesi\\person.txt";
    public static final String SECRET_URL = "c:\\io\\turgutozaluniversitesi\\secret.txt";

    // Get user information
    public String getUserInformation() {
        Scanner keyboard = new Scanner(System.in);
        String username, password, email;

        System.out.println("Enter Username: ");
        username = keyboard.nextLine();

        System.out.println("Enter Password: ");
        password = keyboard.nextLine();

        System.out.println("Enter Email: ");
        email = keyboard.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Username: ").append(username).append("\n");
        stringBuilder.append("Password: ").append(password).append("\n");
        stringBuilder.append("Email: ").append(email);

        return stringBuilder.toString();
    }

    // Save user information to a file
    public void saveUserInformationToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PERSON_URL, false))) {
            String userInformation = getUserInformation();
            bufferedWriter.write(userInformation);
            bufferedWriter.flush();
            System.out.println("User information saved to file: " + PERSON_URL);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Get secret information
    public String getSecretInformation() {
        Scanner keyboard = new Scanner(System.in);
        String secretInfo;

        System.out.println("Enter Secret Information: ");
        secretInfo = keyboard.nextLine();

        return secretInfo;
    }

    // Save secret information to a file
    public void saveSecretInformationToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(SECRET_URL, false))) {
            String secretInfo = getSecretInformation();
            bufferedWriter.write(secretInfo);
            bufferedWriter.flush();
            System.out.println("Secret information saved to file: " + SECRET_URL);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Thread 1: Save user information to file
        Main thread1 = new Main();
        thread1.saveUserInformationToFile();

        // Thread 2: Save secret information to file
        Main thread2 = new Main();
        thread2.saveSecretInformationToFile();

        // Start the threads
        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        System.out.println("Program completed.");
    }
}
