public class ArrayOps {
    public static void main(String[] args) {
      
    }
    
    public static int findMissingInt (int [] array) {

        int x = 0;

        int sum = 0;

        int excpectedSum = 0;

        while (x <= array.length) {

            excpectedSum = excpectedSum + x;

            x++;
        }

        for (int i = 0 ; i < array.length ; i++) {

            sum = sum + array[i];
               
        } 

        return excpectedSum - sum; 
    }


  
public static int secondMaxValue(int [] array) {

        int maxTemp = array[0];

        int max = array[0];

        int moreThanOneMax = 0;

        for (int i = 0 ; i < array.length ; i++) {

            if (array[i] >= maxTemp) {

                max = array[i];
                
                maxTemp = max;

            }     
        }     

        for (int i = 0 ; i < array.length ; i++) {

            if (array[i] == max) {

                moreThanOneMax++;

            }
        }

        int secondTemp = -1;

        int secondMax = -1;

        for (int j = 0 ; j < array.length ; j++) {

             if ((array[j] > secondTemp) && (array[j] < max)) {

                secondMax = array[j];

                secondTemp = secondMax;
             }
         }


        if (moreThanOneMax >= 2) {

            secondMax = max;
        }       
       
        return secondMax;
    }



    public static boolean containsTheSameElements(int [] array1,int [] array2) {

        boolean answer = true;

        int j = 0;

        for (int i = 0 ; i < array1.length ; i++) {

            for (j = 0 ; j < array2.length ; j++) {

                  if (array1[i] == array2[j]) {

                    break;
                  }
                }

                if (j == array2.length) {

                    answer = false;

                }       

        }

         return answer;
    }
                

    public static boolean isSorted(int [] array) {

        boolean answer = true;

          if (array[0] > array[1]) {

             for (int i = 0 ; i < array.length-1 ; i++) {

                if (array[i] < array[i+1]) {

                    answer = false;

                    break;

                }

            }
        }

         if (array[1] > array[0]) {

             for (int i = 0 ; i < array.length-1 ; i++) {

                if (array[i] > array[i+1]) {

                    answer = false;

                    break;

                }


            }
        }

        return answer;
    }

}

