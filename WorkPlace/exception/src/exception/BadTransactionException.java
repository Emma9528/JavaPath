package exception;

public class BadTransactionException extends Exception {

		  public int accountAmount;  // The invalid account number.

		  /**
		   *  Creates an exception object for nonexistent account "badAcctNumber".
		   **/
		  public BadTransactionException(int badAmount) {
		    super("Invalid amount: " + badAmount);

		    accountAmount = badAmount;
		  }
		}

