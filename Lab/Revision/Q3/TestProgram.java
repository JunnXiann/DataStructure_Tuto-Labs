package Lab.Revision.Q3;

public class TestProgram {
    public static void main(String[] args) {
        Account junxian = new Account(1122, 20000);
        junxian.withdraw(2500);
        junxian.deposit(3000);
        System.out.println(junxian.getBalance());
        System.out.println(junxian.getMonthlyInterest());
        System.out.println(junxian.getDate());
    }
}
