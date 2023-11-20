import java.time.ZonedDateTime;
import java.util.Scanner;

public class Bank {

    int currentBalance = 0;
    private long bankNum;
    private int balance;
    private int transaction;
//    private
//

    public Bank() {

    }

    public Bank(int balance, int transaction, long bankNum) {
        this.balance = balance;
        this.transaction = transaction;
        this.bankNum = bankNum;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTransaction() {
        return transaction;
    }

    public long getBankNum() {
        return bankNum;
    }

    public void setBankNum(long bankNum) {
        this.bankNum = bankNum;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", transaction=" + transaction +
                '}';
    }

    public static void headWords() {
        boolean isTrue =  true;
        while (true){
        System.out.println("""
                1.Check balance.
                2.Transaction.
                3.Mobile connection.
                4.Exit
                .
                Enter your choice: 
                                
                """);

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1" -> {
                checkBalance();
            }
            case "2" -> {
                transaction();

            }
            case "3"->{
                mobileConnection();
            }
            case "4"->{
                System.out.println(false);
            }
        }
    }}


    public static void checkBalance() {
//        while (true){
//        Scanner scanner = new Scanner(System.in);
//    Scanner scannerLong = new Scanner(System.in);
//
//        new Bank(scanner.nextInt(), scanner.nextInt(), scannerLong.nextLong());

//        while (true) {
//            Scanner scanner1 = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.print("Enter card numbers: ");
        int cardNum = new Scanner(System.in).nextInt();
        bank.setBalance(1000);
        bank.setBankNum(9417l);
        if (cardNum == bank.getBankNum()) {
            System.out.println("Your balance is " + bank.getBalance() + "$");
        } else if (cardNum != bank.getBankNum()) {
            System.out.println("Uncorrect bank num,please try again!!!");


        }
    }
//    int currentBalance=0;

    public static void transaction() {
        transactionLoop:
        while (true) {
            System.out.print("""
                     Kanday kartaga kotorosuz?
                     1.Elkart
                     2.Mbank
                     3.Exit.
                                    
                                   
                    Enter your choice: 
                     """);
            Bank bank = new Bank();
            bank.setBalance(1000);
            bank.setBankNum(9417l);
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            int currentBalance = 0;

            elkartLoop:
            while (true) {
                switch (scanner.nextLine()) {
                    case "1" -> {
                        System.out.println("Elkart starts with '12' !.  " +
                                "Enter elkart number: ");
                        String cardNum = scanner.nextLine();
                        if (cardNum.startsWith("12") && cardNum.length() >= 4) {
                            System.out.println("Kancha kotorosuz?");
                            int transacSum = scanner1.nextInt();
                            if (transacSum <= bank.getBalance()) {
                                bank.setBalance(bank.getBalance() - transacSum);

                                currentBalance = bank.getBalance();


                                System.out.println("****************************" + "\n" +
                                        "Transaction is success✅" + "\n" +
                                        "1.Your balance: " + bank.getBalance() + "\n"
                                        + "2.Kancha kotordunuz " + transacSum + "\n" +
                                        "3.Kaisy cardka: Elkart " + "\n" +
                                        ZonedDateTime.now() + "\n" +
                                        "**********************" + "\n" +
                                        "🏦MURAS BANK🏦" + "\n" +
                                        "***********************");
                                break elkartLoop;

                            }

                        } else {
                            System.out.println("Invalid card num, please try again!!!");

                        }

                    }
                    case "2" -> {
//                        MBankLoop:
//                        while (true){
                        System.out.println("MBank starts with '996' or '4177' !.  " +
                                "Enter MBank number: ");
                        String cardNum = scanner.nextLine();
                        if (cardNum.startsWith("996") || cardNum.startsWith("4177") && cardNum.length() >= 10) {
                            System.out.println("Kancha kotorosuz?");
                            int transacSum = scanner1.nextInt();
                            if (transacSum <= bank.getBalance()) {
                                bank.setBalance(bank.getBalance() - transacSum);

                                System.out.println("****************************" + "\n" +
                                        "Transaction is success✅" + "\n" +
                                        "1.Your balance: " + bank.getBalance() + "\n"
                                        + "Kancha kotordunuz " + transacSum +"\n"+
                                        "Kaisy cardka: MBank " + "\n" +
                                        ZonedDateTime.now() + "\n" +
                                        "**********************" +"\n"+
                                        "🏦MURAS BANK🏦" + "\n" +
                                        "***********************");


                            }


                        } else {
                            System.out.println("Invalid card num, please try again!!!");

                        }
                    }


                    case "3" -> {
                        return;
                    }
                }
            }
        }
    }

    public static void mobileConnection() {
        Bank bank = new Bank();
        mobileLoop:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner scannerForNum = new Scanner(System.in);
            System.out.println("""
                    Kaisy mobildik operaatorgo?
                    1.MegaCom.
                    2.Beeline.
                    3.Exit.
                    Enter your choice: 
                                    
                    """);
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("Enter phone number: ");
                    if (scannerForNum.nextLine().startsWith("055") ) {
                        System.out.println("Kancha salasyz? ");
                        int connectSum = scanner.nextInt();
                        System.out.println("Succes edinitsa!!!");
                        System.out.println("MegaCom\n " +
                                "Kancha saldynyz: " + connectSum + "\n"
                                + "Sizdin balansynyz: " + bank.getBalance() + "\n"
                                + ZonedDateTime.now() + "\n"
                                + "***********************************" + "\n"
                                + "🏦MURAS BANK🏦" + "\n"
                                + "***********************************");
                    }

                }
                case "2" -> {
                    System.out.println("Enter phone number: ");
                    if (scannerForNum.nextLine().startsWith("077") ) {
                        System.out.println("Kancha salasyz? ");
                        int connectSum = scanner.nextInt();
                        System.out.println("Succes edinitsa!!!");
                        System.out.println("Beeline\n " +
                                "Kancha saldynyz: " + connectSum + "\n"
                                + "Sizdin balansynyz: " +bank.getBalance() + "\n"
                                + ZonedDateTime.now() + "\n"
                                + "***********************************" + "\n"
                                + "🏦MURAS BANK🏦" + "\n"
                                + "***********************************");
                    }
                }
                case "3" -> {
                    break mobileLoop;

                }
            }
        }
    }
}
