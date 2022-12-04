package arrays;

public class TwoDimensionArrayExample {
    public static void main(String[] args) {
        String[][] myArray = new String[3][3];

        System.out.println(myArray[0]);

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.println("Element [" + i + "][" + j + "] -> " + myArray[i][j]);
            }
        }

        myArray[0] = new String[]{"First String", "Second String", "Third String", null, null, null, null, null, null};
        myArray[1] = new String[]{"Some String", "523", "Ala", "Number!!", "SomeString"};

        System.out.println(myArray[0][1]);
        System.out.println(myArray[0][3]);

        System.out.println(myArray[1][0]);
        System.out.println(myArray[1][2]);
        System.out.println(myArray[1][2]);
        System.out.println(myArray[1][4]);

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.println("Element [" + i + "][" + j + "] -> " + myArray[i][j]);
            }
//            MOJE ĆWICZENIE
            String[][] nowaArray = new String[2][5];
            nowaArray[0] = new String [] {"Daniel", "Iwona", "Wiktoria", "Laura", "Julia"};
            nowaArray[1] = new String [] {"tata", "mama", "córeczki"};
            for (int k = 0; k < nowaArray.length; k++) {
                for (int l = 0; l < nowaArray[k].length; l++) {
                    System.out.println("Element [" + k + "][" + l + "] ->" + nowaArray[k][l]);

                }

            }
        }

        System.out.println(myArray[0]);
        System.out.println(myArray[2][0]);
//        System.out.println(myArray[2][3]);


    }
}
