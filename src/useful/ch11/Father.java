package useful.ch11;

public class Father extends Thread{
    BankAccount bankAccount;

    public Father(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // 아버지가 만원 입금한다.
        bankAccount.saveMoney(10_000);
    }
}
