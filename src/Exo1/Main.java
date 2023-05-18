package Exo1;

public class Main {
    public static void main(String[] args) {

       /* int a = 10;
        int b = 2;
        int c = 4;

      float result = calculArithmetiques(a,b,c);

        System.out.println("le resulat est " + result);*/

//        int x = 2;
//        int y = 3;
//        int z = 10;
//
//        float result2 = calculArithmetiques2(x, y, z);
//        System.out.println("le resultat est " + result2);

    /*      int x = 5;
            int n = 8;
            int p = 10;
             float result3 = calculArithmetiques3(x, n, p);
              System.out.println("le resultat est " + result3);*/


  /*              float a = 5;
                int b = 10;
                int c = 15;
        float result4 = calculArithmetiques4(a, b, c);
        System.out.println("le resultat est " + result4);*/


     /*   int x = 3;
        int y = 20;
        int z = 9;

        float result5 = calculArithmetiques5(x, y, z);
        System.out.println("le resultat est " + result5);*/


        int x = 10;
        int y = 5;
        int z = 8;

        float result5 = calculArithmetiques6(x, y, z);
        System.out.println("le resultat est " + result5);

    }



 /*   public static float calculArithmetiques1(int a, int b, int c){

        return a + b - 2 * c;

    }*/

//    public static float calculArithmetiques2(int x, int y, int z) {
//
//
//        return 2 * x / (y * z);
//    }

 /*   public static float calculArithmetiques3(int x, int n, int p){

        return (x + 3) * (n % p);

    }*/

      /*  public static float calculArithmetiques4(float a, int b, int c) {

            return -a / -(b + c);
        }*/

  /*  public static float calculArithmetiques5(int x, int y, int z){

        return x/y % -z;
    }*/

    public static float calculArithmetiques6(int x, int y, int z){
         return x/(y%-z);
    }

}