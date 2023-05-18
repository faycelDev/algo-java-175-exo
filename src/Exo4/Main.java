package Exo4;

public class Main {

    public static void main(String[] args) {

        char c = 60;
        byte b = 10;
        char ce = 'e';
        char cg = 'g';

       /* int result = unicodeChar(c);
        System.out.println(result);*/

      /*  int result2 = unicodeChar(c);
        System.out.println(result2);*/

        /*int result3 = unicodeChar(cg, ce);
        System.out.println(result3);*/

        int result4 = unicodeChar(b, c);
        System.out.println(result4);
    }



  /*  public static int unicodeChar(char c){

        return c + 1;
    }*/


   /* public static int unicodeChar(char c){

        return 2 * c;
    }*/

  /*  public static int unicodeChar(char ce, char cg){

        return ce - cg;
    }*/


    public static int unicodeChar(byte b, char c){

        return  b * c;
    }
}
