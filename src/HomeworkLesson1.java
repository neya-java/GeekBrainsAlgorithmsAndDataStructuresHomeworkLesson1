import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkLesson1 {
    public static void main(String[] args) {

        //Поиск элемента массива с известным индексом O(1)
        System.out.println("Поиск элемента массива с известным индексом O(1)");
        int[] arrays0 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(arrays0[5]);

        //Дублирование одномерного массива через foreach O(n)
        System.out.println("Дублирование одномерного массива через foreach");
        int[] arrays1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};    // O(n)
        int x = arrays1.length;                    // O(1)
        int[] arraysCopy = new int[x];                // O(1)
        for (int y : arrays1) {                        // O(n)
            int i = 0;                                // O(1)
            arraysCopy[i] = y;                        // O(1)
            System.out.print(arraysCopy[i] + " ");    // O(1)
        }

        //Удаление элемента массива с известным индексом без сдвига O(1)
        System.out.println("Удаление элемента массива с известным индексом без сдвига");
        int[] arrays2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};    // O(n)
        arrays2[5] = 0;                                // O(1)
        System.out.println();

        //Удаление элемента массива с неизвестным индексом без сдвига O(n)
        System.out.println("Удаление элемента массива с неизвестным индексом без сдвига");
        int[] arrays3 = {1, 3, 3, 2, 5, 7, 6, 8, 9, 0};  	 // O(n)
        for (int i = 0; i < arrays3.length; i++) {   		 // O(n)
            if (arrays3[i] == 5) {                    		 // O(1)
                arrays3[i] = 0;                       		 // O(1)
            }

        }

        //Удаление элемента массива с неизвестным индексом со сдвига O(n)
        System.out.println("Удаление элемента массива с неизвестным индексом со сдвигом");
        int[] arrays4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};          	// O(n)
        int z = 0;
        for (int i = 0; i < arrays3.length; i++) {                	// O(n)
            if (arrays4[i] == 5) {                            		// O(1)
                arrays4[i] = 0;                                		// O(1)
                for (int j = i; j < arrays4.length - 1; j++) {    	// O(n)
                    arrays4[j] = arrays4[j + 1];               		// O(1)
                }
                break;
            }
        }
        for (int a : arrays4) {
            System.out.print(a + " ");
        }

        //a) Определить сложность следующих алгоритмов. Сколько произойдет итераций? O(n)*O(log n), 13000 итераций
        System.out.println("Определить сложность следующих алгоритмов. Сколько произойдет итераций?");
        int n = 10000;
        List<Integer> arrayList0 = new ArrayList<>();
        for (int i = 0; i < n; i++) {                //O(n) , 10000 итераций
            int iter = 0;
            for (int j = 1; j < n; j *= 2) {        //O(log n) , 13 итераций при n = 10000
                arrayList0.add(i * j);
                System.out.println(iter);
                iter++;
            }
        }


        //b) Определить сложность следующих алгоритмов. Сколько произойдет итераций? O(n^2),  25000 итераций
        System.out.println("Определить сложность следующих алгоритмов. Сколько произойдет итераций?");
        int m = 10000;
        List<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < m; i += 2) {              		 //O(n/2), 5000  итераций
            for (int j = i; j < m; j++) {                    //O(n), 5000  итераций
                arrayList1.add(i * j);                       //O(1)
            }
        }

        //c) Определить сложность следующих алгоритмов. Сколько произойдет итераций? O(n),  49990000 итераций
        System.out.println("Определить сложность следующих алгоритмов. Сколько произойдет итераций?");
        int v = 10000;
        List<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < v; i++) {                    //O(n), 10000 итераций
            int p = 0;
            for (int j = 0; j < v; j++) {
                arrayList2.add(i * j);
                v--;									//O(n/2), первая итерация 4999
                System.out.println(p);
                p++;
            }
        }

        //d) Определить сложность следующих алгоритмов. Сколько произойдет итераций? O(n)
        System.out.println("Определить сложность следующих алгоритмов. Сколько произойдет итераций?");
        factorial(BigInteger.valueOf(10000));
        public static BigInteger factorial(BigInteger n) {
            if (n.equals(BigInteger.ONE)) {
                return n;
            }
            return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
        }

        //e) Определить сложность следующих алгоритмов. Сколько произойдет итераций? O(2^n), подсмотрел/
        System.out.println("Определить сложность следующих алгоритмов. Сколько произойдет итераций?");
        fib(BigInteger.valueOf(50));
        public static BigInteger fib (BigInteger n){
            if (n.equals(BigInteger.ONE)) {
                return BigInteger.ZERO;
            }
            if (n.equals(BigInteger.TWO)) {
                return BigInteger.ONE;
            }
            return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
        }
    }
}
