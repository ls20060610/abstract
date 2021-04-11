import java.util.Scanner;
class ConcreteGuessGame extends AbstractGuessGame{
	Scanner scanner = new Scanner(System.in);
	@Override
	protected void showMessage(String message) {
		System.out.println(message + "!");
	}

	@Override
	protected int getUserInput() {
		 System.out.print("input a number: ");
		 return scanner.nextInt();
	}
	
	protected void showMessage2(String message) {
		System.out.println(message+"2");
	}

	}
public class Test{
	private Scanner scanner;
	 
    protected void showMessage(String message) {
    }
  
    protected int getUserInput() {
        System.out.print("input a number: ");
        return scanner.nextInt();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteGuessGame guessGame = 
                 new ConcreteGuessGame();
	 guessGame.showMessage2("3");
	 guessGame.showMessage("cclemon");
     guessGame.setNumber(50);
     guessGame.start();
	}

}
