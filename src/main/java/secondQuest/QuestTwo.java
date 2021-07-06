package secondQuest;

public class QuestTwo {
    public static void main(String[] args) {
        final int n = 4;

        double[] mass;
        mass = new double[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random();
        }
        showTheMass(mass);

        double beforeJ;
        for (int i = 0; i <  mass.length; i++) {
            for (int j = 1; j <  mass.length - i; j++) {

                if (mass[j - 1] > mass[j]) {
                    beforeJ = mass[j - 1];
                    mass[j - 1] = mass[j];
                    mass[j] = beforeJ;
                }
            }
        }

        showTheMass(mass);
    }



    private static void showTheMass(double[] mass){
        for (double i : mass) {
            System.out.print(i + " ");    //This is to view the entire array of numbers.
        }
        System.out.println();
    }
}


