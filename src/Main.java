public class Main {

    //function :
    static void AfficherTableau (int[] scores){
        for (int i = 0; i < scores.length; i++) {
            int s = scores[i];
            System.out.println(s);
        }
    }

    // on definie une fonction nommé TableauGrand
    // qui prend 1 parametre Tab de type int[]
    //et qui renvoie un int
    static int TableauGrand (int[] tab ){
        int max = -1;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] > max){
                max = tab[i];
            }
        }
        return max;
    }


    static boolean TableauInf (int[] tab){
        for (int valeur : tab){
            if (valeur < 10){
                return true;
            }
        }
        return false;
    }





    public static void main(String[] args) {
        int[] scores = new int[7];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;
        scores[5] = 60;
        scores[6] = 70;


        AfficherTableau(scores);
        int max = TableauGrand(scores);
        System.out.println("Max = " + max);

        boolean resultat = TableauInf(scores);
        if (resultat) {
            System.out.println("Le tableau contient au moins une valeur inférieure à 10.");
        } else {
            System.out.println("Le tableau ne contient aucune valeur inférieure à 10.");
        }


   }

}