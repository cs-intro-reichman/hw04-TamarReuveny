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
         System.out.println(camelCase(" Intro to coMPUter SCIEnce "));
         System.out.println(allIndexOf("Hello world", 'l'));

        
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

            } else if (strNew >= 65 && strNew <= 90) {

                newString = newString + (char)(strNew + 32);

            } else {

                newString = newString + char1;
            }    
            
        }
       
        return newString;
    }



    public static String camelCase (String string) {

        String newString = "";

        for (int i = 0 ; i < string.length() ; i++) {

            char char1 = string.charAt(i);

            int strNew = string.charAt(i);

            int tempNew = 0;

            if (strNew >= 65 && strNew <= 90) { 

               newString = newString + (char)(strNew + 32);

            } else if ((char1 == ' ')) {

                if (i == (string.length()-1)) {

                   break;

                } else if (i == 0) {

                    tempNew = string.charAt(i+1);

                    if (tempNew >= 65 && tempNew <= 90) {

                        tempNew = tempNew + 32;
                    }

                    newString = newString + (char)(tempNew);

                } else { 

                      tempNew = string.charAt(i+1);

                       if (tempNew >= 97 && tempNew <= 122) {

                           newString = newString + (char)(tempNew-32); 

                    } else {

                            newString = newString + (char) (tempNew);
                    }
                }
                  i++;

                } else {

                newString = newString + char1;
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
