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

        System.out.println(camelCase("   tWo    wordS"));
       

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

                newString = newString + (char)(strNew + 32);

            } else {

                newString = newString + char1;
            }    
            
        }
       
        return newString;
    }



    public static String camelCase (String string) {

        String newString = "";

        int i = 0;

        while (i < string.length()) {

            if (string.charAt(i) == ' ') {

                if (i == (string.length()-1)) {

                   break;

                } else if (i == 0) {

                while (string.charAt(i) == ' ') {

                    newString = newString + "";

                    i++;
                }

                int strNew = string.charAt(i);

                if (strNew >= 65 && strNew <= 90) { 

                newString = newString + (char)(strNew + 32);

                } else {

                newString = newString + (char)(strNew);

                }

                } else {

                    while (string.charAt(i) == ' ') {

                    newString = newString + "";

                    i++;

                    }

                    int strNew = string.charAt(i);

                    if (strNew >= 65 && strNew <= 90) {

                    newString = newString + (char)(strNew);

                    } else {

                     newString = newString + (char) (strNew-32);

                    }
                }

            } else {

            int strNew = string.charAt(i);
            
            if (strNew >= 65 && strNew <= 90) {

                newString = newString + (char)(strNew +32);

                } else { 

                    newString = newString +(char)(strNew) ;     
                }
               
            }

            i++;
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
