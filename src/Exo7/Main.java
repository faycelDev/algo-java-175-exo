package Exo7;

public class Main {
    public static void main(String[] args) {

        byte b;
        short p;
        int n;
        long q;
        final int N = 10;
        float x;
        double y;

        /* 1- b = n; La conversion de byte en int n'est pas autorisée par affectation,
        byte est un mot clés ont ne peut pas l'utiliser comme nom de variables et lui affecté un autre type mais on peut lui affecter une valeur compris entre -128 et 127;
         */

        /* 2- b = 25; ceci est correct car on affecte une valeurs a b qui est de type byte est cette valeur est comprise entre -128 et 127

          3- b = 500; ceci n'est pâs correct car la valeur 500 depasse 127 qui le maximum supporté par le type byte

          4- x = 2*q;  ceci est correct car nous pouvons multiplier un int qui est ici 2 par un long mais
          le resultat sera automatiquement converti en long par affectation la variable
          x sera de type long

           5- y = b*b; Ceci est correct mais il y a une subtilitée : les operations arithmétiques sur des
           types plus petit que int tels que byte dans cette exemple ou short sont automatiquement transformés
            en int avant d'être effectués; cela signifie que le résultat sera de type int même si y est de type double.
            Pour obtenir le résultat en double il faut faire une operation explicite (cast) du resultat en double exemple : double y = (double) (b*b);

            6- p = b*b; Ceci n'est pas correct on ne peut pas convertir de int en short sauf en faisant une opérations explicite (cast) comme inqiqué ci-dessus
                        la raison est que : un int est un entier signé de 32 bits et le short de 16 bits donc si on converti unn int en short
                        il y a un risque de perte de données si la valeur de l'int dépasse les 16 bits pouvant être supportés par un type short

            7- b = b +5 ; ceci ets un correcte car java evalue cette opérations comme une opérations entre deux int et si on essaye comme ici d'attribuer le resultat
                          a la variable b qui est de type byte cela provoquera une erreur de compilation cela est dû au fait que le type int ne peut pas être
                          converti en byte sans risque de perte de données; pour resoudre ce problème il faut faire une opérations explicite (cast) comme indiqué plus haut

            8- p = 5*n-3; Ceci est correct car le calcul 5*n est effectué et le resultat sera en int car n est un int don 5*n donne 50; ensuite 50-3 donne 47
                                donc 47 sera affecté a la variable p qui est de type short et comme 47 est dans la plage des valeurs supportées par un short ceci est correct
                                est ne nécessite pas d'opération explicite (cast)


         */

    }
}
