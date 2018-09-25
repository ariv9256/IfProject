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
			JOptionPane.showMessageDialog(null, "your scoreboard has " + volleyballGame.getScoreBoard() + 
					" points, pick up your game!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "your scoreboard has " + volleyballGame.getScoreBoard() + 
					" points, you're almost there!");
		}
		
		userInput = JOptionPane.showInputDialog(null, "How many points did you earn in the last set?");
		int addPoint = 0;
		if(validInt(userInput))
		{
			addPoint = Integer.parseInt(userInput);
		}
		
		volleyballGame.setAddPoint(addPoint);
		if (addPoint > 10)
		{
			JOptionPane.showMessageDialog(null, "you gained: " + volleyballGame.getAddPoint() +
					" points, pick it up next set!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "you gained: " + volleyballGame.getAddPoint() + 
					" points, good job!");
		}
		
		userInput = JOptionPane.showInputDialog(null, "Did your serve go in the boundaries?");
		boolean inBounds = false;
		inBounds = Boolean.parseBoolean(userInput);
		
		volleyballGame.setInBounds(inBounds);
		
		JOptionPane.showMessageDialog(null, volleyballGame);
		inputScanner.close();
		
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
	private void loopy()
	{
		//Define a variable before the loop
		boolean isFinished = false;
		while (!isFinished)
		{
			JOptionPane.showMessageDialog(null, "HII");
		}
	}

}
