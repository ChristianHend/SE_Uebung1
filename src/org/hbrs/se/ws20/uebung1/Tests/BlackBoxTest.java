import org.hbrs.se.ws20.uebung1.view.Client;

public class BlackBoxTest {
    public static void main(String[] args) {
        Client testClient = new Client();
        System.out.println("Input: 5 \nExpected output: fünf");
        System.out.print("Output: ");
        testClient.display(5);
        System.out.println("___________________________________");
        System.out.println("Input: -5 \nExpected output: Unvalid input.");
        System.out.print("Output: ");
        testClient.display(-5);
        System.out.println("___________________________________");
        System.out.println("Input: 15 \nExpected output: Unvalid input");
        System.out.print("Output: ");
        testClient.display(15);
        System.out.println("___________________________________");
        System.out.println("Input: 0 \nExpected output: Unvalid input");
        System.out.print("Output: ");
        testClient.display(0);
        System.out.println("___________________________________");
    }
}
