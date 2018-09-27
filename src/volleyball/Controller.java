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
		while (!validInt(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "Please give a number for you scoreboard :)");
		}
		if(validInt(userInput))
		{
			scoreBoard = Integer.parseInt(userInput);
		}
		
		volleyballGame.setScoreBoard(scoreBoard);
		if(scoreBoard < 15)
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
		if (addPoint < 10)
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
		if(inBounds == false)
		{
			JOptionPane.showMessageDialog(null, "Serve went in: " + volleyballGame.getInBounds() +
					", darn.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Serve went in: " + volleyballGame.getInBounds() +
					
					", good job!.");
		}
		
		loopy();
		
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
		int someCount = 0;
		while (!isFinished)
		{
			JOptionPane.showMessageDialog(null, "GOOD JOB!");
			
			someCount += 1;
			
			if (someCount > 3)
			{
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "thank.");
			}
			isFinished = true;
		}
	}
	private void askUser()
	{
		VolleyballModel userVolleyball = new VolleyballModel();
		
		String response = JOptionPane.showInputDialog(null, "What is your name fellow volleyball player?");
		userVolleyball.setPlayerName(response);
		
		response = JOptionPane.showInputDialog(null, "Did your serve go in bounds? T/F");
		userVolleyball.setInBounds(Boolean.parseBoolean(response));
		
		response = JOptionPane.showInputDialog(null, "What is your scoreboard number?");
		userVolleyball.setScoreBoard(Integer.parseInt(response));
		
		response = JOptionPane.showInputDialog(null, "How many points in your current/ previous set?");
		userVolleyball.setAddPoint(Integer.parseInt(response));
		
		JOptionPane.showMessageDialog(null, userVolleyball);
		
	}

}
