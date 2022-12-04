package varargs;

public class VarargsExample {
    static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index = " + i + ", wartość= " + numbers[i]);
        }
    }
}

