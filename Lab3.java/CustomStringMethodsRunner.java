public class CustomStringMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();

        boolean bool = methods.longerThan("apple", 4);
        System.out.println(bool);

        String str5 = methods.funnyString("computer", 3);
        System.out.println(str5);

        String str6 = methods.halvesReversed("computer");  //even # of letters
        System.out.println(str6);

        String str = methods.pigLatin("computer");
        System.out.println(str);

        String str1 = methods.removeCharacter("Halloween", 5);
        System.out.println(str1);

        String str2 = methods.insertAt("ghost", "BOO!", "o");
        System.out.println(str2);

        String str3 = methods.endUp("It's Thursday", 3);
        System.out.println(str3);

        String str4 = methods.yellOrWhisper("Hello James!");
        System.out.println(str4);







        
    }
}
