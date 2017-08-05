package Unit11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application
{
    // Below I declare 5 text fields and 1 button that will be used throughout this class
    private TextField yearlyInterestRate;
    private TextField numberOfYears;
    private TextField loanAmount;
    private TextField monthlyPayment;
    private TextField totalPayment;
    private Button calculate;

    // Below I override the start method in the Application class
    @Override
    public void start( Stage myStage )
    {
        // Below I set the title bar to display 'Loan Calculator'
        myStage.setTitle( "Loan Calculator" );

        // Below I create a GridPane object 'gridPane'
        GridPane gridPane = new GridPane();
        // Below I set the horizontal gap to 5 pixels
        gridPane.setHgap( 5 );
        // Below I set the vertical gap to 5 pixels
        gridPane.setVgap( 5 );
        // Below I set the position of the grid pane to the center
        gridPane.setAlignment( Pos.CENTER );

        // Below I create a scene with the dimensions 400 & 250 (representing width and height respectively) and place the grid Pane in it
        Scene scene = new Scene( gridPane, 400, 250 );

        // Below I add a Label (a string of text) to the GUI at pos (0, 0) of the grid pane which is directly to the left of the corresponding text field
        gridPane.add( new Label( "Annual Interest Rate:" ), 0, 0 );
        // Below I add a Label (a string of text) to the GUI at pos (0, 1) of the grid pane which is directly to the left of the corresponding text field
        gridPane.add( new Label( "Number of Years:"), 0, 1 );
        // Below I add a Label (a string of text) to the GUI at pos (0, 2) of the grid pane which is directly to the left of the corresponding text field
        gridPane.add( new Label( "Loan Amount:"), 0, 2 );
        // Below I add a Label (a string of text) to the GUI at pos (0, 3) of the grid pane which is directly to the left of the corresponding text field
        gridPane.add( new Label( "Monthly Payment:"), 0, 3 );
        // Below I add a Label (a string of text) to the GUI at pos (0, 4) of the grid pane which is directly to the left of the corresponding text field
        gridPane.add( new Label( "Total Payment:"), 0, 4 );

        // Below I define and add a text field for the yearly interest rate
        yearlyInterestRate = new TextField();
        gridPane.add( yearlyInterestRate, 1, 0 );
        // Below I position the txt field to the bottom right
        yearlyInterestRate.setAlignment( Pos.BOTTOM_RIGHT );

        // Below I define and add a text field for the yearly interest rate
        numberOfYears = new TextField();
        gridPane.add( numberOfYears, 1, 1 );
        // Below I position the txt field to the bottom right
        numberOfYears.setAlignment( Pos.BOTTOM_RIGHT );

        // Below I define and add a text field for the loan amount
        loanAmount = new TextField();
        gridPane.add( loanAmount, 1, 2 );
        // Below I position the txt field to the bottom right
        loanAmount.setAlignment( Pos.BOTTOM_RIGHT );

        // Below I define and add a text field for the monthly payment
        monthlyPayment = new TextField();
        gridPane.add( monthlyPayment, 1, 3 );
        // Below I position the txt field to the bottom right
        monthlyPayment.setAlignment( Pos.BOTTOM_RIGHT );
        // Below I make the monthly payment text field uneditable as it will be used only to display text and should'nt be able to be typed in to
        monthlyPayment.setEditable( false );

        // Below I define and add a text field for the total payment
        totalPayment = new TextField();
        gridPane.add( totalPayment, 1, 4 );
        // Below I position the txt field to the bottom right
        totalPayment.setAlignment( Pos.BOTTOM_RIGHT );
        // Below I make the last field uneditable as it will be used only to display text and should'nt be able to be typed in to
        totalPayment.setEditable( false );

        // Below I define the Button, make it say 'Calculate' and add it to the grid pane
        calculate = new Button( "Calculate" );
        gridPane.add( calculate, 1, 5 );
        // I then position the button to the right
        GridPane.setHalignment( calculate, HPos.RIGHT );

        // Below I process events with an anonymous event handler
        calculate.setOnAction(
        new EventHandler<ActionEvent>()
        {
            @Override
            public void handle( ActionEvent e )
            {
                // When the button is clicked handle the event by calling on the calculateLoanPayment method in this class
                LoanCalculator.this.calculateLoanPayment();
            }
        });

        // Below I set the scene in the stage
        myStage.setScene( scene );
        // Below I show the stage
        myStage.show();
    }

    // This method calculates the monthly payment and total payment and stores the calculated values to their respective text fields
    private void calculateLoanPayment()
    {
        // Below i get the values from the text fields using the 'parseDouble' and 'parseInt' methods, and store them to variables
        double interest = Double.parseDouble( yearlyInterestRate.getText() );
        int year = Integer.parseInt( numberOfYears.getText() );
        double amount = Double.parseDouble( loanAmount.getText() );

        // Below I create a loan object, passing the interest year and amount that the user entered in the text fields.
        Loan loan = new Loan( interest, year, amount );

        // Below I display the monthly payment with '$%.2f' to display a dollar sign followed by the monthly payment itself
        monthlyPayment.setText( String.format( "$%.2f", loan.getMonthlyPayment() ) );
        // Below I display the total payment with '$%.2f' to display a dollar sign formatted as a floating point with the payment
        totalPayment.setText( String.format( "$%.2f", loan.getTotalPayment() ) );
    }
}