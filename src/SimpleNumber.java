// Нахождение простого числа под номером N
/* Увеличение функциональности:
1.Использовать многопоточность и определение количества потоков на конкретной маштне
2.Оценка времени вычисления больших значений ПЧ через апроксимацию для конкретной машины.
*/
 */
import java.io.*;
import java.util.Date;

public class SimpleNumber {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите номер простого числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Nsn = Integer.parseInt(reader.readLine());
        //int Nsn = 10001;
        int n=3, N=1;
        Date begin = new Date();
        do {
            if (simpleNumber(n))
                N++;
            n++;
        } while (N != Nsn);
        Date end = new Date();
        System.out.println("Простое число под номером "+Nsn+" : "+(n-1));
        long time = (end.getTime()-begin.getTime())/1000;
        System.out.println("Расчёт производился "+time+" сек.");

    }
    static boolean simpleNumber (int x) {
        int i=2;
        boolean flag=true;
        while (i<x&&flag) {

            if (x%i!=0)
                flag=true;
            else
                flag=false;

            i++;
        }
        return flag;
    }
}
