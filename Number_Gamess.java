import java.util.Scanner;

class Range{
    public int generate(int max,int min)
    {
        return (int)(Math.random() * (max - min + 1) +  min);
    }
}

public class Number_Gamess {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Range r = new Range();

        int totalGames = 0;
        int totalWins = 0;

        while (true)
        {
            System.out.println("Enter minimum number:");
            int min = sc.nextInt();

            System.out.println("Enter maximum number:");
            int max = sc.nextInt();

            int number = r.generate(max,min);
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("You have only 5 attempts!");

            while (attempts < maxAttempts)
            {
                System.out.println("Guess the number:");
                int guess = sc.nextInt();
                attempts++;

                if(guess > number)
                {
                    System.out.println("Too high!");
                }else
                    if(guess < number)
                    {
                        System.out.println("Too low!");
                    }else{
                        System.out.println("Correct! You guessed it.");
                        totalWins++;
                        break;
                    }
            }
            
            if(attempts == maxAttempts)
            {
                System.out.println("Out of attempts! The number was: " +number);

            }
            totalGames++;

            System.out.println("Games Played:" + totalGames);
            System.out.println("Wins: "+ totalWins);

            System.out.println("Play again ? (y/n)");
            String choice = sc.next();

            if(!choice.equalsIgnoreCase("y"))
            {
                break;
            }
        }
        sc.close();
    }
}