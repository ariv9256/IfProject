package volleyball;

/**
 * Import Section
 * @param Import Section 
 */
import java.util.Scanner;
import model.VolleyballModel;
import javax.swing.JOptionPane;

public class Controller
{
	private VolleyballModel volleyballGame;
	
	private Scanner inputScanner;
	/**
	 * Defines variables 
	 * @param defines variables publicly
	 */
	public Controller()
	{
		volleyballGame = new VolleyballModel();
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		String userInput = JOptionPane.showInputDialog(null, "How many points on your scoreboard?");
		int scoreBoard = 0;
		if(validInt(userInput))
		{
			scoreBoard = Integer.parseInt(userInput);
		}
		
		volleyballGame.setScoreBoard(scoreBoard);
		if(scoreBoard > 15)
		{
			JOptionPane.showMessageDialog(null, "your scoreboard has " + volleyballGame.getScoreBoard() + " points, pick up your game!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "your scoreboard has " + volleyballGame.getScoreBoard() + " points, you're almost there!");
		}
		
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You'll need to type in a whole number :)");
		}
		return isValid;
		
	}

}
