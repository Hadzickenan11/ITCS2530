import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class Test extends JFrame
{
	private int Guesses = 1;
	private int GuessOld = 0;
	private int number;
	private JTextField guessInputJTextField;
	private JLabel prompt1JLabel;
	private JLabel prompt2JLabel;
	private JLabel messageJLabel;
	private JLabel message2JLabel;
	private JLabel random1 = new JLabel("");
	private JButton newGameJButton; 
	private Color background;
	
	public Test()
	{
		super("Guessing Game");
		
		setLayout(new FlowLayout());
		background = Color.LIGHT_GRAY;
		prompt1JLabel = new JLabel("I have a number between 1 and 1000.");
		add(prompt1JLabel);
		prompt2JLabel = new JLabel("Can you guess my number? Enter your Guess:");
		add(prompt2JLabel);
		guessInputJTextField = new JTextField(5);
		guessInputJTextField.addActionListener(new GuessHandler());
		add(guessInputJTextField);
		messageJLabel = new JLabel("");
		add(messageJLabel);
		message2JLabel = new JLabel("");
		add(message2JLabel);
		newGameJButton = new JButton("New Game");
		add(newGameJButton);
		
		Random generator = new Random();
		number = generator.nextInt(1001);
		
		newGameJButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						guessInputJTextField.setText("");
						Random generator = new Random();
						number = generator.nextInt(1001);
						random1.setText("" + number);
						SwingUtilities.updateComponentTreeUI(random1);
						messageJLabel.setText("");
						guessInputJTextField.setEditable(true);
						Guesses = 0;
						message2JLabel.setText("Number of Guesses: " + Guesses);
						Guesses++;
						}
					}
				);
		theGame();
		}
	
	public void theGame()
	{
		}
	
	class GuessHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int Guess;
			Guess = Integer.parseInt(guessInputJTextField.getText());
			if (Math.abs(number - Guess) < Math.abs(number - GuessOld))
			{
				getContentPane().setBackground(Color.YELLOW);
				}
			else
			{
				getContentPane().setBackground(Color.GREEN);
				}
			GuessOld = Guess;
			if (Guess > number)
			{
				messageJLabel.setText("Too High.");
				SwingUtilities.updateComponentTreeUI(messageJLabel);
				}
			if (Guess < number)
			{
				messageJLabel.setText("Too Low.");
				SwingUtilities.updateComponentTreeUI(messageJLabel);
				}
			if (Guess == number)
			{
				messageJLabel.setText("Correct!");
				SwingUtilities.updateComponentTreeUI(messageJLabel);
				guessInputJTextField.setEditable(false);
				}
			message2JLabel.setText("Number of Guesses: " + Guesses++);
			}
		}
	}