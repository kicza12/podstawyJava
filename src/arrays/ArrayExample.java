package arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        String[] myStringArray = {"SomeString", "Hello", "NewString"};
        String[] myTestStringArray = new String[5];

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);
        System.out.println(myIntArray[4]);

        System.out.println(myTestStringArray[0]);
        System.out.println(myTestStringArray[1]);
        System.out.println(myTestStringArray[2]);
        System.out.println(myTestStringArray[3]);
        System.out.println(myTestStringArray[4]);

        myTestStringArray[0] = "Pierwszy element";
        myTestStringArray[1] = "Drugi element";
        myTestStringArray[2] = "Trzeci element";
        myTestStringArray[0] = "Nowy element";

        System.out.println(myTestStringArray[0]);
        System.out.println(myTestStringArray[1]);
        System.out.println(myTestStringArray[2]);
        System.out.println(myTestStringArray[3]);
        System.out.println(myTestStringArray[4]);

        myTestStringArray = new String[10];

        for(String element: myTestStringArray) {
            System.out.println(element);
        }

        System.out.println("Rozmiar mojej tablicy wynosi length = " + myTestStringArray.length);

        final char bigLetter = 'A';
        final char smallLetter = 'a';
        for (int i = 0; i < myTestStringArray.length; i++) {
            String result = String.valueOf((char) (bigLetter + i)) + String.valueOf((char) (smallLetter + i));
            myTestStringArray[i] =  result;
        }

        for (int i = 0; i < myTestStringArray.length; i++) {
            System.out.println(myTestStringArray[i]);
        }
        }
    }


