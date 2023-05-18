package Exo2;

;

public class Main {
    public static void main(String[] args) {

        byte b1 = 10, b2 = 20;
        short p = 200;
        int n = 500;
        long q = 100;
        float x = 2.5f;
        double y = 5.25;

        /*float result = conversionsImplicites(b1, b2);
        System.out.println(result);*/

       /* float result2 = conversionsImplicites2(p, b1);
        System.out.println(result2);*/

        /*float result3 = conversionsImplicites3(b1, b2);
        System.out.println(result3);*/

        /*float result4 = conversionsImplicites4(q, p, b1, b2);
        System.out.println(result4);*/

       /* float result5 = conversionsImplicites5(x, q, n);
        System.out.println(result5);*/

        /*float result6 = conversionsImplicites6(b1, q, x);
        System.out.println(result6);*/

        float result7 = conversionsImplicites7(b1, q, x);
        System.out.println(result7);
    }




   /* public static int conversionsImplicites(byte b1, byte b2){

        return b1 + b2;
    }*/

/*    public static int conversionsImplicites2(short p, byte b1){

        return p+b1;
    }*/


  /*  public static int conversionsImplicites3(byte b1, byte b2){

        return b1 * b2;
    }*/

/*    public static int conversionsImplicites4(long q, short p, byte b1, byte b2)
    {
        return (int) (q+p * (b1+b2));
    }*/

   /* public static float conversionsImplicites5(float x, long q, int n){

        return   x+q*n;
    }*/

  /*  public static float conversionsImplicites6(byte b1, long q, float x){
        return b1 * q / x;
    }*/

    public static float conversionsImplicites7(byte b1, long q, float x){
        return b1 * q * 2.f /x;
    }
}
