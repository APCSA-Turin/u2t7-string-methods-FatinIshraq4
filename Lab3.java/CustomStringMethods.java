
public class CustomStringMethods {
    
    public CustomStringMethods() { }

    public boolean longerThan(String myString, int maxLength) {
        if (myString.length()<=maxLength) {
            return false;
        } else {
            return true;
        }
    
    }

    public String funnyString(String str, int idx) {
        String x = str.substring(idx, idx + 1);
        str = x + str + x;
        return str;
    }

    public String halvesReversed(String myString) {
        String firstHalf = myString.substring(0, myString.length()/2);
        String secondHalf = myString.substring(myString.length()/2);
        String reversedHalves = secondHalf + firstHalf;
        return reversedHalves;
    }

    public String pigLatin(String orig) {
        String x = orig.substring(0,1);
        orig = orig.substring(1) + x + "ay";
        return orig;
    }

    public String removeCharacter(String myString, int removeIdx) {
        if ((removeIdx + 1)>myString.length()) {
            return myString;
        } else {
            String x = myString.substring(removeIdx + 1);
            String y = myString.substring(0,removeIdx);
            myString = y + x;
            return myString;
        }
        
    }

    public String insertAt(String orig, String insertText, String searchStr) {
        if (orig.contains(searchStr)) {
            int x = orig.indexOf(searchStr);
            String y = orig.substring(0, x);
            String z = orig.substring(x);
            orig = y + insertText + z;
            return orig;
        } else {
            orig = orig + insertText;
            return orig;
        }
    }

    public String endUp(String myString, int numToCap){
        if (numToCap<=myString.length()) {
            int z = myString.length() - numToCap;
            String x = myString.substring(z);
            String y = myString.substring(0, z);
            x = x.toUpperCase();
            myString = y + x;
            return myString;
        } else {
            myString = myString.toUpperCase();
            return myString;
        }    
    }
  
    public String yellOrWhisper(String myString) {
        String str = myString.substring(0,1);
        char something = str.charAt(0);
        boolean some = Character.isUpperCase(something);
        if (some) {
            myString = myString.toUpperCase();
            return myString;
        } else {
            myString = myString.toLowerCase();
            return myString;
        }
    }

    public String makeRandomStrings(String myString) {
        int length = myString.length();
        int x = 0;
        while (x<length) {
            String str = myString.substring(x, x+3);
            String z = myString.substring(x, x + (length - 2));
            String y = myString.substring(0,x+1);
            myString = y + z;
            myString = myString + str;
            x++;
        }
        return myString;
    }
  
  
  
  
  
  


    
}
