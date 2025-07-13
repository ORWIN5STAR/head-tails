import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        String head = "Head";
        String tail = "Tails";
        String answer;
        int x = Randomizer.nextInt(1, 2);
        String guess = readLine("Enter Head or Tails: ");



        if(x == 1)
        {
            answer = head;
            if(guess.equals(answer) || guess.equals("head"))
                System.out.println("You win");
            else
                System.out.println("You lose");
        }
            
        else if(x == 2)
        {
            answer = tail;
            if(guess.equals(answer) || guess.equals("tails"))
                System.out.println("You win");
            else
                System.out.println("You lose");
        }
        else
        {
            System.out.println("Error");
        }
    }

    public static String readLine(String scanner) {
        Scanner x = new Scanner(System.in);

        System.out.print(scanner);
        String name = x.nextLine();

        return name;
    }
}
