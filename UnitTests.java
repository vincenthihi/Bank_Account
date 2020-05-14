
/**
 * Vincent Nguyen
 * CS108
 */

class UnitTests {

    public static void Test1() {
        System.out.println("Test 1");

        CurrentAccount ca = new CurrentAccount<>(1, 2, "Ab10", 3);
        System.out.println("CurrentAccount Balance : " + ca.getBalance());

        System.out.println("\n");
    }

    public static void Test2() {
        System.out.println("Test 2");

        CurrentAccount ca = new CurrentAccount<>(1, 2111, "Ab10", 3);
        System.out.println("CurrentAccount Id : " + ca.getIdNo());

        System.out.println("\n");
    }

    public static void Test3() {
        System.out.println("Test 3");

        CurrentAccount ca = new CurrentAccount<>(1, 112, "Ab10", 3);
        System.out.println("CurrentAccount Balance beofre Cheque: " + ca.getBalance());
        ca.clearCheque(50);
        System.out.println("CurrentAccount Balance after Cheque: " + ca.getBalance());

        System.out.println("\n");
    }

    public static void Test3_5() {
        System.out.println("Test 3_5");

        CurrentAccount ca = new CurrentAccount<>(1, 112, "Ab10", 3);
        System.out.println("CurrentAccount Bank Code " + ca.getBankCode());

    }

    public static void Test4() {
        System.out.println("Test 4");

        SavingsAccount sa = new SavingsAccount<>(1, 1200, 12, 3, 4);
        System.out.println("SavingsAccount Id : " + sa.getIdNo());

        System.out.println("\n");
    }

    public static void Test5() {
        System.out.println("Test 5");

        SavingsAccount sa = new SavingsAccount<>(1, 1200, 12, 3, 4);
        System.out.println("SavingsAccount Balance : " + sa.getBalance());

        System.out.println("\n");
    }

    public static void Test6() {
        System.out.println("Test 6");

        SavingsAccount sa = new SavingsAccount<>(1, 1200, "A1B2", 3, 4);
        System.out.println("SavingsAccount Monthly Interest : " + sa.monthlyInterest());

        System.out.println("\n");
    }

    public static void Test7() {
        System.out.println("Test 7");

        Bank bank = new Bank();
        SavingsAccount sa = new SavingsAccount<>(1, 1200, "XX1", 3, 4);
        bank.addAccount(sa);

        System.out.println("After Adding an Account");
        bank.printResult();

        System.out.println("\n");
    }

    public static void Test8() {
        System.out.println("Test 8");

        Bank bank = new Bank();
        SavingsAccount sa = new SavingsAccount<>(1, 1200, 12, 3, 4);
        bank.addAccount(sa);

        System.out.println("After Adding an Account");
        bank.printResult();

        bank.removeAccount(sa);

        System.out.println("After Removing the Account");
        bank.printResult();

        System.out.println("\n");
    }

    public static void Test9() {
        System.out.println("Test 9");

        Bank bank = new Bank();
        SavingsAccount sa = new SavingsAccount(1, 1200, "ABC", 3, 4);
        CurrentAccount ca = new CurrentAccount(1, 2, 111, 3);
        bank.addAccount(ca);
        bank.addAccount(sa);
        bank.printResult();

        System.out.println("\n");
    }

    public static void main(String[] args) {
        UnitTests.Test1();
        UnitTests.Test2();
        UnitTests.Test3();
        UnitTests.Test4();
        UnitTests.Test5();
        UnitTests.Test6();
        UnitTests.Test7();
        UnitTests.Test8();
        UnitTests.Test9();
    }
}
