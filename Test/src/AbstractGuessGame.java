
public abstract class AbstractGuessGame {
	 private int number;
	 
	    public void setNumber(int number) {
	        this.number = number;
	    }
	 
	    public void start() {
	        showMessage("Welcome");
	 
	        int guess;
	        do {
	            guess = getUserInput();
	            if(guess > number) {
	                showMessage("bigger than the goal number");
	            }
	            else if(guess < number) {
	                showMessage("smaller than the goal number");
	            }
	            else
	                showMessage("you win");
	        } while(guess != number);
	    }

	    protected abstract void showMessage(String message);
	    protected abstract int getUserInput();
}
