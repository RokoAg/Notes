package a09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Rakhuzhuwo Sapruna (A00455075)
 */
public class MolecularWeight extends JFrame {

    /**
     * instance variable for the instruction (label)
     */
    private JTextField symbol1;
    private JTextField symbol2;
    private JTextField atomicWeight1;
    private JTextField atomicWeight2;
    private JTextField atomicCount1;
    private JTextField atomicCount2;
    private JTextField molecularFormula;
    private JTextField molecularWeight;
    
    /**
    *Constructs a MolecularWeight object with the specified width and height.
    *Sets the title of the JFrame and creates and adds components to the root pane.
    *@param w The width of the JFrame
    *@param h The height of the JFrame
    */
    public MolecularWeight(int w, int h) {

        //calling a super class with the title
        super("Molecular Weight Calculator");

        //set the size of the window
        setSize(w, h);

        //exist with the close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create and add components to the root pane of JFrame
        createComponents();

        super.setLocationRelativeTo(null);
    }

    /**
     * This method creates 4 panels and add them to the root JFrame at the right
     * locations.
     */
    private void createComponents() {

        //first create panels with components in them
        JPanel top = createTopPanel();
        JPanel middle = createMiddle();
        JPanel bottom = createBottomPanel();

        //then add them to the proper locations
        this.add(top, BorderLayout.PAGE_START);
        this.add(middle, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);

    }//end createComponents()
    
    /**
    *This method creates the top panel displaying author and course information.
    *@return The top panel with appropriate author and course information.
    */
    private JPanel createTopPanel() {
        JPanel top = new JPanel();

        // format the panel
        top.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel intro1 = new JLabel("by Rakhuzhuwo Sapruna (A00455075)");

        JLabel intro2 = new JLabel("\nCSCI 1226 -- Winter 2023");
        top.add(intro1);
        top.add(intro2);

        intro1.setHorizontalAlignment(JLabel.CENTER);
        intro2.setHorizontalAlignment(JLabel.CENTER);

        top.setLayout(new GridLayout(2, 1));
        return top;
    }
    
    /**
    *This method creates the middle panel for inputting atomic symbol, weight, and count for up to two elements.
    *@return The middle panel with appropriate input fields and labels.
    */
    private JPanel createMiddle() {
        JPanel middle = new JPanel();
        JPanel upperMiddle = new JPanel();
        upperMiddle.setBorder(new EmptyBorder(10, 10, 10, 
                10));
        upperMiddle.setLayout(new GridLayout(3, 3, 20, 5));
        Insets margins = new Insets(10, 10, 10, 10);
   
        

        this.symbol1 = new JTextField("");
        this.symbol1.setHorizontalAlignment(JTextField.RIGHT);
        this.symbol1.setMargin(margins);

        this.symbol2 = new JTextField("");
        this.symbol2.setHorizontalAlignment(JTextField.RIGHT);
        this.symbol2.setMargin(margins);

        this.atomicWeight1 = new JTextField("");
        this.atomicWeight1.setHorizontalAlignment(JTextField.RIGHT);
        this.atomicWeight1.setMargin(margins);

        this.atomicWeight2 = new JTextField("");
        this.atomicWeight2.setHorizontalAlignment(JTextField.RIGHT);
        this.atomicWeight2.setMargin(margins);

        this.atomicCount1 = new JTextField("");
        this.atomicCount1.setHorizontalAlignment(JTextField.RIGHT);
        this.atomicCount1.setMargin(margins);

        this.atomicCount2 = new JTextField("");
        this.atomicCount2.setHorizontalAlignment(JTextField.RIGHT);
        this.atomicCount2.setMargin(margins);

        JLabel sym = new JLabel("Atomic Symbol");
        sym.setHorizontalAlignment(JLabel.RIGHT);
        sym.setVerticalAlignment(JLabel.CENTER);
        JLabel wght = new JLabel("Atomic Weight");
        wght.setHorizontalAlignment(JLabel.CENTER);
        wght.setVerticalAlignment(JLabel.CENTER);
        JLabel cnt = new JLabel("Atomic Count");
        cnt.setHorizontalAlignment(JLabel.LEFT);
        cnt.setVerticalAlignment(JLabel.CENTER);
        
        JPanel lowerMiddle = new JPanel(new GridLayout(3, 3, 20, 
                5));
        lowerMiddle.setBorder(new EmptyBorder(10, 10, 10, 
                10));

        this.molecularFormula = new JTextField("");
        this.molecularFormula.setHorizontalAlignment(JTextField.RIGHT);
        this.molecularFormula.setMargin(margins);

        this.molecularWeight = new JTextField("");
        this.molecularWeight.setHorizontalAlignment(JTextField.RIGHT);
        this.molecularWeight.setMargin(margins);
        
        molecularFormula.setEditable(false);
        molecularWeight.setEditable(false);

        JLabel molFormula = new JLabel("Molecular Formula");
        molFormula.setHorizontalAlignment(JLabel.LEFT);
        molFormula.setVerticalAlignment(JLabel.CENTER);
        

        JLabel molWeight = new JLabel("Molecular Weight");
        molWeight.setHorizontalAlignment(JLabel.LEFT);
        molWeight.setVerticalAlignment(JLabel.CENTER);

        
        upperMiddle.add(sym);
        upperMiddle.add(wght);
        upperMiddle.add(cnt);

        
        upperMiddle.add(symbol1);
        upperMiddle.add(atomicWeight1);
        upperMiddle.add(atomicCount1);
        
        
        upperMiddle.add(symbol2);
        upperMiddle.add(atomicWeight2);
        upperMiddle.add(atomicCount2);
        
        
        
        lowerMiddle.add(molecularFormula);
        lowerMiddle.add(molecularWeight);
        lowerMiddle.add(molWeight);
        lowerMiddle.add(molFormula);
        
        middle.add(upperMiddle, BorderLayout.NORTH);
        middle.add(lowerMiddle, BorderLayout.SOUTH);
        
        return middle;
    }
    

    /**
     * This method creates and returns the bottom panel of the window, which
     * contains a set of buttons.
     *
     * @return a panel with two buttons in it
     */
    private JPanel createBottomPanel() {
        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottom.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        JButton getResult = new JButton("Calculate");
        getResult.setFont(getResult.getFont().deriveFont(18f));
        bottom.add(getResult);

        JButton quit = new JButton("Quit");
        quit.setFont(quit.getFont().deriveFont(18f));
        bottom.add(quit);

        quit.addActionListener(e -> System.exit(0));
        getResult.addActionListener
            (e -> calculation());

        // make the ENTER and Alt-ENTER key strokes do the calculation
        getRootPane().setDefaultButton(getResult);
        getResult.setMnemonic(KeyEvent.VK_ENTER);
        return bottom;
    }
    
    /**
    *Private method to calculate the molecular formula and molecular weight of the compound
    *using the entered values.
    */
    private void calculation() {
        double weight1 = getWeightValue(this.atomicWeight1);
        double weight2 = getWeightValue(this.atomicWeight2);
        int count1 = getCountValue(this.atomicCount1);
        int count2 = getCountValue(this.atomicCount2);
        
        String firstLetter = this.symbol1.getText();
        String secondLetter = this.symbol2.getText();
        
        String num1 = "";
        if (count1 > 1){
            num1 = this.atomicCount1.getText();
        }
        String num2 = "";
        if (count2 > 1){
            num2 = this.atomicCount2.getText();
        }

        double weight = (weight1 * count1 + weight2 * count2);
        
        molecularFormula.setText(firstLetter + num1+ secondLetter + num2);
        molecularWeight.setText(String.format("%.2f", weight));

    }
    /**
    *Parses the user input for atomic weight and returns a double value
    *@param field the text field that contains the atomic weight value
    *@return the atomic weight value as a double, or NaN if the input is invalid
    */
    private static double getWeightValue(JTextField field) {
        try {
            return Double.parseDouble(field.getText());
        } catch (NumberFormatException ex) {
            field.setText("Invalid value");
            return (double) Float.NaN;
        }//end try-catch
    }//end getValue()
    
    /**
    *Parses the user input for atomic count and returns an integer value
    *@param field the text field that contains the atomic count value
    *@return the atomic count value as an integer, or NaN if the input is invalid
    */
    private static int getCountValue(JTextField field) {
        try {
            return Integer.parseInt(field.getText());
        } catch (NumberFormatException ex) {
            field.setText("Invalid value");
            return (int) Float.NaN;
        }//end try-catch
    }//end getValue()
    
    
    /**
    *Entry point of the program, creates an instance of MolecularWeight and displays the JFrame
    *@param args command line arguments
    */
    public static void main(String[] args) {

        MolecularWeight var = new MolecularWeight(500, 420);
        var.setVisible(true);
    }
}
