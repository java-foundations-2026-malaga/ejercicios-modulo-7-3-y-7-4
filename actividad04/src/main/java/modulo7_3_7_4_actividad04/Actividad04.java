package modulo7_3_7_4_actividad04;

public class Actividad04 {
    static class Account {
        String name;
        double balance;

        Account(String name, double balance) {
            name = name;
            balance = balance;
        }
    }

    public static void main(String[] args) {
        Account account = new Account("Ana", 1200);
        System.out.println(account.name + ": " + account.balance);
    }
}
