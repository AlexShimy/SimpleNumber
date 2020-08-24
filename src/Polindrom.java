// Вычисление маскимального полиндрома от произведения двух трёхзначных чисел
public class Polindrom {
    public static void main(String[] args) {
        int[] result = new int[3];
        result[0]=0;
        result[1]=0;
        result[2]=0;

        for (int i=999;i>=100;i--)
            for (int j=999;j>=100;j--)
                if (Polindrom(i*j))
                    if(i*j>result[0]) {
                    result[0] = i*j;
                    result[1] = i;
                    result[2] = j;
                    }

        System.out.println(result[0]+" "+result[1]+" "+result[2]);
    }
    static int sWitch (int y) {
        int s;
        if (y>=100) {
            s=100*(y%10) + (y-y%100)/100 + (y-y%10-(y-y%100));
            return s;
        }
        else if(y<=99&&y>=10) {
            s=(10*(y%10) + (y-y%10)/10)*10;
            return s;
        }
        else
            return y*100;

    }
    static boolean  Polindrom( int x) {
        int a,b;

        if (x>100000) {
            b=x%1000;
            a=(x-b)/1000;
            b=sWitch(x%1000);

            if (a==b)
                return true;
        }
        if (x<100000&&x>10000) {
            b=sWitch(x%100);
            a=(x-x%1000)/1000;

            if (a==b)
                return true;
        }
        return false;
    }
}

