import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer");
        } else {
            System.out.println(str2 + " is longer");
        }

        int lengthStr1 = (str1.length()) / 2;
        System.out.println("First half of " + str1 + " is: " + str1.substring(0,lengthStr1));
        System.out.println("Second half of " + str1 + " is: " + str1.substring(lengthStr1));

        int lengthStr2 = (str2.length()) / 2;
        System.out.println("First half of " + str2 + " is: " + str2.substring(0,lengthStr2));
        System.out.println("Second half of " + str2 + " is: " + str2.substring(lengthStr2));

        if (str1.indexOf(str2) < 0) {
            System.out.println(str2 + " is NOT found in " + str1);
        } else {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        }

        scan.close();


    }
}
