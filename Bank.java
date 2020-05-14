
import java.util.LinkedList;

/**
 * Vincent Nguyen
 * CS108
 */

class Bank {

    private Account[] accounts;
    private int noOfAccounts;

    public Bank() {
        accounts = new Account[100];
        noOfAccounts = 0;
    }

    public void printResult() {
        LinkedList<Account> acc = new LinkedList<>();

        for (int i = 0; i < noOfAccounts; i++) {
            acc.add(accounts[i]);
        }

        System.out.println("Account Details: ");
        for(Account a : acc) {
            if(a instanceof CurrentAccount)
                System.out.print("Type : Current Account, ");
            else
                System.out.print("Type : Savings Account, ");
            
            System.out.print("Bank Code : " + a.getBankCode() +", Id : " + a.getIdNo() + ", Balance : " + a.getBalance());
            
            if(a instanceof SavingsAccount)
                System.out.print(", Monthly Interest : " + ((SavingsAccount)a).monthlyInterest());    
            
            System.out.println("");
            
        }

    }

    public void addAccount(Account a) {
        if (searchIndex(a) == -1) {
            accounts[noOfAccounts] = a;
            noOfAccounts++;
            selectionSort(accounts);
        }
    }

    public void removeAccount(Account a) {
        int i = searchIndex(a);
        if (i != -1) {
            accounts[i] = accounts[--noOfAccounts];
            selectionSort(accounts);
        }

    }

    private void selectionSort(Account array[]) {

        for (int i = 0; i < noOfAccounts; i++) {
            int min = i;

            for (int j = i + 1; j < noOfAccounts; j++) {
                if (array[j].getBalance() < array[min].getBalance()) {
                    min = j;
                }
            }
            Account temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

    }

    private int searchIndex(Account a) {
        return binarySearch(accounts, 0, noOfAccounts-1, a.getIdNo());
    }

    private int binarySearch(Account arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the 
            // middle itself 
            if (arr[mid].getIdNo() == x) {
                return mid;
            }

            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid].getIdNo() > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present 
        // in array 
        return -1;
    }
}
