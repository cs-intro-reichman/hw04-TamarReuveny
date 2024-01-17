public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        System.out.println(capVowelsLowRest("One two tHRee world"));

        System.out.println(camelCase(" tWo    wordS"));

    }

    public static String capVowelsLowRest (String string) {

        String newString = "";

        for (int i = 0 ; i < string.length() ; i++) {
            char char1 = string.charAt(i);
            int strNew = string.charAt(i);
            if (strNew == 97 || strNew == 101 || strNew == 105 || strNew == 111 || strNew == 117) {
                newString = newString + (char)(strNew - 32); 
               } else if (char1 == ' ') {
                newString = newString + " "; 
               } else if ((strNew >= 65 && strNew <= 90) && strNew != 65 && strNew != 69 && strNew != 73 && strNew != 79 && strNew != 85) {
                newString = newString + (char)(strNew +32);
               } else {
                newString = newString + char1;
               }
         }
               return newString;
        }




    public static String camelCase (String string) {

        String newString = "";

        // Changing the first letter to small letter
        int x = 0;
        char first = string.charAt(x);
        if (first == ' ') {
            while (first == ' ') {
            x++;
            first = string.charAt(x); 
        }
        }   
        int num = (int) string.charAt(x);
     if (num >= 65 && num <= 90) {
        num = num + 32;
        char char1 = (char) num;
        newString = newString + char1;
    } else {
        newString = newString + first;
    }

        // Changing the first letter of each word after the first word to capital letter,
        // erasing all spaces, and converting other letters to small letters

        boolean cap = false;
    for (int i = x+1; i < string.length(); i++) {
        char currentchar = string.charAt(i);
        int num1 = (int) currentchar;
        if (num1 == 32) {
            cap = true;
        } else {
            if (cap) {
                if (num1 >= 97 && num1 <= 122) {
                    num1 = num1 - 32;
                }
                char con = (char) num1;
                newString = newString + con;
                cap = false;
            } else {

                if (num1 >= 65 && num1 <= 90) {
                    num1 = num1 + 32;}
                newString = newString + (char) num1;
            }
        }
    }

    return newString;

    }



    public static int[] allIndexOf (String string, char chr) {

        int count = 0;

        // Count occurrences of chr in the string.
        
        for (int i = 0 ; i < string.length() ; i++) {

            char charFromString = string.charAt(i);

            if (charFromString == chr) {

                count++;
            }
        }

        int currentIndex = 0;

        int[] arr = new int [count];
        
        for (int i = 0 ; i < string.length() ; i++) {

            char charFromString = string.charAt(i);

            if (charFromString == chr) {

                arr[currentIndex] = i;

                currentIndex++;
            }
        }
        
        return arr;
    }
}
