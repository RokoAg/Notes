package l10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * This class represents a game for guessing a number. It allows the user to
 * enter an integer value and displays if the entered value is lower than,
 * higher than, or equal to the randomly assigned answer.
 *
 * @author Rakhuzhuwo Sapruna (A00455075)
 */
public class GuessTheNumber extends JFrame {

    /**
     * instance variable for input field for the guess
     */
    private JTextField input;

    /**
     * instance variable for the output where the result is displayed
     */
    private JTextField output;

    /**
     * A placeholder for the upper limit of the range
     */
    private int max;

    
    /**
     * instance variable for the instruction (label)
     */
    private JLabel instruction;

    /**
     * A place holder of the answer to be guessed
     */
    private int answer;

    /**
     * The default value for the upper boundary of the range that the answer to
     * be in.
     */
    private final int DEFAULT_MAX = 10;

    /**
     * Constructor, creates a JFrame window with the specified size
     *
     * @param w width of the winter
     * @param h height of the winter
     */
    public GuessTheNumber(int w, int h) {

        //calling a super class with the title
        super("Guess the Number");

        //set the size of the window
        setSize(w, h);

        //exist with the close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setting the max value to the default
        this.max = DEFAULT_MAX;

        //create and add components to the root pane of JFrame
        createComponents();

        //initialize the answer
        setRandomAnswer();

        // centering the window
        super.setLocationRelativeTo(null);

    }//end constructor

    
    /**
     * This method creates 3 panels and add them to the root JFrame at the right
     * locations.
     */
    private void createComponents() {

        //first create panels with components in them
        JPanel top = createTopPanel();
        JPanel middle = createMiddlePanel();
        JPanel bottom = createBottomPanel();

        //then add them to the proper locations
        this.add(top, BorderLayout.PAGE_START);
        this.add(middle, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);

    }//end createComponents()

    
    /**
     * This method creates and returns the top panel of the game window, which
     * contains the instruction label.
     *
     * @return a panel with an instructions label in it
     */
    private JPanel createTopPanel() {
        JPanel top = new JPanel();

        // format the panel
        top.setBorder(new EmptyBorder(10, 10, 10, 10));

        instruction = new JLabel("Enter a number between 1 and " + this.max);


        // format the label
        this.instruction.setFont(this.instruction.getFont().deriveFont(24f));
        top.add(this.instruction);

        return top;
    }//end createTopPanel()

    
    /**
     * This method creates and returns the middle panel of the game window,
     * which contains the main input/output fields.
     *
     * @return a panel with the three rows of labeled text fields
     */
    private JPanel createMiddlePanel() {
        JPanel middle = new JPanel();
        middle.setLayout(new GridLayout(3, 2));//3X2
        middle.setBorder(new EmptyBorder(10, 10, 10, 10));

        // instantiate the input field
        this.input = new JTextField(20);

        // format the field
        this.input.setFont(this.input.getFont().deriveFont(24f));
        this.input.setMargin(new Insets(5, 5, 5, 5));
        this.input.setHorizontalAlignment(JTextField.RIGHT);

        // instantiate the ouput field
        this.output = new JTextField(20);

        // format the field
        this.output.setFont(this.output.getFont().deriveFont(24f));
        this.output.setMargin(new Insets(5, 5, 5, 5));
        this.output.setHorizontalAlignment(JTextField.RIGHT);


        //make the ouput field uneditable
        output.setEditable(false);
        
        // created and format the label for Max value
        

        // created and format the label for guess
        JLabel guessLabel = new JLabel(("Your guess:"));
        guessLabel.setFont(guessLabel.getFont().deriveFont(24f));
        //now add it
        middle.add(guessLabel);
        middle.add(input);

        // created and format the label for result output
        JLabel doneLabel = new JLabel(("Result:"));
        doneLabel.setFont(doneLabel.getFont().deriveFont(24f));
        middle.add(doneLabel);
        middle.add(output);

        return middle;
    }//end createMiddlePanel()

    
    /**
     * This method creates and returns the bottom panel of the window, which
     * contains a set of buttons.
     *
     * @return a panel with two buttons in it
     */
    private JPanel createBottomPanel() {
        JPanel bottom = new JPanel();

        // Create the check button
        JButton check = new JButton("Check");
        //create SetMax button
        // format the button
        check.setFont(check.getFont().deriveFont(24f));
        // add them to the panel
        bottom.add(check);
        check.addActionListener(
                e -> checkResult(input, output)
        );

        // Create the done button
        JButton doneButton = new JButton("Done");
        // format the button
        doneButton.setFont(doneButton.getFont().deriveFont(24f));
        bottom.add(doneButton);
        // add actions to the buttons
        doneButton.addActionListener(e -> System.exit(0));

            // make the ENTER and Alt-ENTER key strokes do the calculation
        getRootPane().setDefaultButton(check);
        check.setMnemonic(KeyEvent.VK_ENTER);

        return bottom;
        
        //create the max button
        //JButton maxButton = new JButton("Set Max");
        // format the button
        //doneButton.setFont(doneButton.getFont().deriveFont(24f));
        //bottom.add(doneButton);
    }//end createBottomPanel()

    
    /**
     * This method creates a random integer between 1 and max value, and assigns
     * the value to be used as the answer.
     *
     */
    private void setRandomAnswer() {
        this.answer = (int) (Math.random() * max + 1);
        System.out.println("The answer is: " + this.answer);//for debugging
    }//end setRandomAnswer()

    
    /**
     * This method basically initializes the game by the following steps:
     *
     * 1)   Sets both the input and output fields to white 
     * 2)   Empties both the input and output fields 
     * 3)   Assigns a new max value specified in the max field 
     * 4)   Calls setRadomAnswer to assign a new value to answer 
     * 5)   Update the instruction label to reflect the new max value
     *
     */
    private void setMaxValue() {
        //to be implemented
        
    }//end setMaxField()

    
    /**
     * This method checks the guessed number against the answer, and displays
     * the result (either: Too Low, Too Hight, or Correct!
     *
     * @param input input field
     * @param output output filed where the result is displayed
     */
    private void checkResult(JTextField input, JTextField output) {

        int number = getValue(input);
        if (number < answer) {
            output.setText("Too Low");
            output.setBackground(Color.yellow);
        } else if (number > answer) {
            output.setText("Too High");
            output.setBackground(Color.red);
        } else {
            output.setText("Correct!");
            output.setBackground(Color.green);
        }
    }//end checkResult()

    
    /**
     * Read the integer value from a text field. If an error occurs, turn the
     * field pink.
     *
     * @param field the field to read the number from
     * @return the value from the field, or zero if an error occurs
     */
    private static int getValue(JTextField field) {
        try {
            field.setBackground(Color.white);
            return Integer.parseInt(field.getText());
        } catch (NumberFormatException ex) {
            field.setBackground(Color.pink);
            field.setText("Invalid value");
            return (int) Float.NaN;
        }//end try-catch
    }//end getValue()

    
    /**
     * Create and show the window.
     *
     * @param args command line arguments cheerfully ignored!
     */
    public static void main(String[] args) {
        GuessTheNumber gtn = new GuessTheNumber(600, 350);
        gtn.setVisible(true);
    }//end main()

}//end class GuessTheNumber
