package loops;

public class WhileLoopExample {
    public static void main(String[] args) {
        char myConditionVariable = 'A';
        while(myConditionVariable != '[') { //while- rób dopóki, w nawiasie zapisany warunek
            myConditionVariable =  (char)(myConditionVariable + 1);//rzutowanie = zamiana na chara
            System.out.println("Obecna wartość litery -> " + myConditionVariable);
        }
        int sum = 0;
        int i = 0;
        while (i<40) {
            System.out.println("i = " + i);
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("Suma liczb = " + sum);
        int a = 0;
        int j = 0;
        int k = 0;
        while (a<10) {
            j++;
            ++k;
            System.out.println("Wartość j = " + j);
            System.out.println("Wartość k = " + k);
            a++;
        }
        int c = 0;
        int d = 0;
        int e = 0;
        while (c<10) {
            System.out.println("Wartość d = " + d++);
            System.out.println("Wartość e = " + ++e);
            c++;
        }
    }
}
