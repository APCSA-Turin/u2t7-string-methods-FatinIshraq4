import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int words = 0;
        System.out.print("Please enter the first word: ");
        String lastStr = scan.nextLine();
        words++;

        while (score<50) {
            System.out.print("Please enter the next word: ");
            String nextStr = scan.nextLine();
            words++;
            int temp = score;
            String str = lastStr.substring(Math.max(lastStr.length() - 2, 0));
            String str2 = (nextStr.substring(0, 2));

            if (nextStr.compareTo(lastStr)>0) {
                score+=2;

            } else if (nextStr.equals(lastStr)) {
                score-=10;

            } else {
                score -=5;
            }

            if (nextStr.contains(lastStr.substring(0,1))) {
                score+=3;
            }

            if (str2.equals(str)) {
                score+=5;
            }

            if (lastStr.length()==nextStr.length()) {
                score+=4;
            }

            int change = score - temp;
            System.out.println("You score has changed by " + change + " and is currently at: " + score);

            lastStr = nextStr;


    }
        
        System.out.println("Congrats you won!");
        System.out.println("It took you " + words + " words to win.");
        System.out.println("Try again to get a lower number of words!");
    
        }
    }

    

