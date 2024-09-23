public class Main {
    public static void main(String[] args) {
        System.out.println("Enter credit card balance");
        double monthOne;
        double monthTwo;
        double interest1;
        double interest2;

        interest1 = 5000 * .17;
        monthOne = 5000 + interest1;
        monthTwo = monthOne * .17;
        interest2 = 5000 + monthTwo;
        System.out.println("Interest after 1 month is " + monthOne);
        System.out.println("Interest after 2 months is" + interest2);
    }
}