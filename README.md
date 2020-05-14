# Bank_Account
CS108 Final Program

* Name: Vincent Nguyen
* RedID: 821606299
* GitHub UserName: vincenthihi
* Project Name: Bank_Account
* Date:5/14/2020

Decription of project:
- My project is basically a Bank Account Management System. This includes a checking and saving account. The bank is also able to pull up any account and check, as well as adding or removing accounts from the bank.  

Description of each file:
-Bank.java: The Bank is able to check (Binary Search) sorted (used SELECTION SORT) account details with their given account IDs. The Bank can also ADD or REMOVE accounts via their IDs as well (Linked List).

-Account.java: The internals within what goes into a bank account. this includes a ID, Bank balace, and bank code. Because this class is abstract is cannot be instantiated, but its methods can be inherited and used within another class.

-CurrentAccount.java: This class inherits from Account which is an abstract class. Current account takes in what ever was from the abstract class and includes a added check cost to it as well. 

-SavingsAccount.java/Interest.java: A savings account includes interest because the bank is holding your money so I created a interface called Interest, with an annual interest of 15 I used double bc you could have cents in there as well. This class includes a check cost, and minimum balance within the savings account. It also inherits everything from Account which is an abstract class.

-UnitTests.java: I basically tested all the methods like you asked for just to see if everything worked. Its pretty straight forward.

Amazing end to an Awesome semester! Thank you for being an AMAZING professor!










