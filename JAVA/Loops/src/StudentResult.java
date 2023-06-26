public class StudentResult {
    double percentage;
    public boolean student() {

        while (percentage!=0) {
            if (percentage > 80) {
                System.out.println("Your grade is distingsion.");
                return true;
            } else if (percentage > 60 && percentage < 80) {
                System.out.println("Your grade is First Class.");
                return true;
            } else if (percentage > 35 && percentage < 60) {
                System.out.println("Your grade is Second Class.");
                return true;
            } else {
                System.out.println("You are Fail, Better luck next time.");
            }
        }
        return false;
    }
}
