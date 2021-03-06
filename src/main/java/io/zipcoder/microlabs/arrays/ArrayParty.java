package io.zipcoder.microlabs.arrays;


public class ArrayParty {


    public String printArray(String[] inputArray){

        String result = "*** Output ***";

        for (int i = 0; i < inputArray.length; i++){


            result = result + "\n" + inputArray[i];
        }

        return result;
    }


    public String lastElement(String[] inputArray){

        String result = "*** Output ***\n";

        int lastOne = inputArray.length - 1;

        return result + inputArray[lastOne];
    }


    public String lastSecondElement(String[] inputArray){

        String result = "*** Output ***\n";

        int lastSecond = inputArray.length - 2;

        return result + inputArray[lastSecond];

    }


    public String reverse(String[] inputArray){

        String result = "*** Output ***";

        for (int i = inputArray.length - 1 ; i >= 0; i --){

            result = result + "\n" + inputArray[i];

        }

        return result;

    }


    public String isPalindrome(String[] inputArray){

        String intro = "*** Output ***\n";

        String result = "True";

        int l = inputArray.length;

        for (int i = 0; i < l; i++){

            if (inputArray[i] != inputArray[l - (i + 1)]){

                result = "False";
                break;
            }

        }

        return intro + result;
    }


    public String compress(int[] inputArray){

        String result = "compressTest()\n*** Output ***";

        int temp = 0;

        for (int i = 0; i < inputArray.length - 2; i++){

            if (inputArray[i] == inputArray[i+1]){

                int flag = inputArray[i];

                if (flag != temp) {

                    temp = flag;
                    result = result + "\n: " + flag;
                }
            }

        }

        return result;
    }


    public String pack(char[] inputArray){

        char firstChar = inputArray[0];

        String result = "pack()\n*** Output ***\n: " + firstChar;

        for (int i = 0; i < inputArray.length - 1; i++){

            if (inputArray[i] == inputArray[i+1]){

                result = result + inputArray[i+1];

            } else {

                result = result + ", " + inputArray[i+1];
            }

        }

        return result;
    }


}
