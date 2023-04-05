package Tutorial.Revision.Q5;

public class TestProgram {
    public static void main(String[] args) {
        BankAccount junxian = new BankAccount(5000);
        System.out.println(junxian.deposit(500));
        System.out.println(junxian.withdraw(5600));
        System.out.println(junxian.withdraw(500));
    }
}
