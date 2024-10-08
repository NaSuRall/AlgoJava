public class Main {
    public static void main(String[] args) {

        int[] scores = new int[7];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;
        scores[5] = 60;
        scores[6] = 70;

        for (int i = 0; i < scores.length; i++) {
            int s = scores[i];
            System.out.println(s);
        }

       int Moyenne =  scores[0] + scores[1] + scores[2] + scores[3] + scores[4] + scores[5] + scores[6];
        System.out.println(Moyenne);
        int div = Moyenne / 7;
        System.out.println(div);
    }

}