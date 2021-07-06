package firstQuest;



public class QuestOne {

    public static void main(String[] args) {

        final int m = 4, n = 4;

        double[][] mass;
        mass = new double[m][n];

        final double c = -1.49, d = 23.4;
        final double valueSinSinC = Math.sin(Math.sin(c)), valueLnLnD_4Times = 4 * Math.log(Math.log(d));
        double y = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                mass[i - 1][j - 1] = Math.sqrt(Math.abs(valueSinSinC - valueLnLnD_4Times / Math.pow(j, i)));

                if (y < mass[i - 1][j - 1]) y = mass[i - 1][j - 1];
//                System.out.print(mass[i - 1][j - 1] + " ");    //This is for view the entire array of numbers.
            }
//            System.out.println();                              //This is for view the entire array of numbers.
        }

        System.out.println(y);

    }
}
