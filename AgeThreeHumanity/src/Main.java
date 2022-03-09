public class Main {

    public static int maxAge;
    public static int midAge;
    public static int minAge;

    public static void main(String[] args) {

        int ageOne = 0;
        int ageTwo = 300;
        int ageThree = 200;

        if (validation(ageOne, ageTwo, ageThree)) {
            ageRound(ageOne, ageTwo, ageThree);
            System.out.println("Самому взрослому: " + maxAge + " лет");
            System.out.println("Среднему взрослому: " + midAge + " лет");
            System.out.println("Самому младшему: " + minAge + " лет");
        } else {
            System.out.println("Не корректный возраст");
        }
    }

    public static boolean validation(int one, int two, int three) {
        return one > 0 && two > 0 && three > 0;
    }

    public static void ageRound(int one, int two, int three) {
        if (one >= two && one >= three) {
            maxAge = one;
            if (two >= three) {
                midAge = two;
                minAge = three;
            } else {
                midAge = three;
                minAge = two;
            }
        }

        if (two >= one && two >= three) {
            maxAge = two;
            if (one >= three) {
                midAge = one;
                minAge = three;
            } else {
                midAge = three;
                minAge = one;
            }
        }

        if (three >= two && three >= one) {
            maxAge = three;
            if (two >= one) {
                midAge = two;
                minAge = one;
            } else {
                midAge = one;
                minAge = two;
            }
        }
    }
}
