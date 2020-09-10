import java.util.Scanner;

public class GeneratePrimeApp {
    public static void main(String[] args){
        GeneratorBody generatorBody = new GeneratorBody();
        Scanner userInput = new Scanner(System.in);
        boolean gameRun = true;

        while(gameRun){
            System.out.println("Please type in a number range using integers");
            System.out.println("Range Start:");
            int startingRange = userInput.nextInt();
            userInput.nextLine();
            System.out.println("Range End:");
            int endingRange = userInput.nextInt();
            generatorBody.generate(startingRange, endingRange);
            System.out.println("Here is a list of prime numbers within that range.");
            System.out.println(""+ generatorBody.getPrimes());
            gameRun=false;
        }
    }
}
