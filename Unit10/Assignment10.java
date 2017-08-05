package Unit10;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Assignment10 extends Application
{
    // Below are all the labels.
    private Label annualInterestRate = new Label( "Annual Interest Rate:" );
    private Label numberOfYears = new Label( "Number of Years:" );
    private Label loanAmount = new Label( "Loan Amount:" );
    private Label monthlyPayment = new Label( "Monthly Payment:" );
    private Label totalPayment = new Label( "Total Payment:" );

    // Below is the start method, which i annotated '@Override' to ensure that the Assignment10.java class implements the abstract method start in the Application class
    @Override
    public void start( Stage myStage )
    {
        // Below I make the title bar display 'Loan Calculator'
        myStage.setTitle( "Loan Calculator" );
        // Below I instantiate the GridPane class with the object 'rootNode'
        GridPane rootNode = new GridPane();

        // Below is the sizing and orientation of the window and the components.
        rootNode.setPadding( new Insets( 20 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );

        // Below I make the Scene by instantiating the Scene class  with the rootNode, and 450 & 275 which represent the width and the height of the GUI application respectively
        Scene myScene = new Scene( rootNode, 450, 275 );

        // Below I add the labels!
        rootNode.add( annualInterestRate, 0, 0 );
        rootNode.add( numberOfYears, 0, 1 );
        rootNode.add( loanAmount, 0, 2 );
        rootNode.add( monthlyPayment, 0, 3 );
        rootNode.add( totalPayment, 0, 4 );

        // Below I create two TextFields so that they can later be set to be uneditable
        TextField mPTF = new TextField();
        TextField tPTF = new TextField();

        // Below the text fields are added!
        rootNode.add( new TextField(), 1, 0 );
        rootNode.add( new TextField(), 1, 1 );
        rootNode.add( new TextField(), 1, 2 );
        rootNode.add( mPTF, 1, 3 );
        rootNode.add( tPTF, 1, 4 );

        // Below I make the last two text field uneditable
        mPTF.setEditable( false );
        tPTF.setEditable( false );

        // Below the button is created and added! It is also aligned to the right!
        Button calculate = new Button( "Calculate" );
        rootNode.add( calculate, 1, 5 );
        rootNode.setHalignment( calculate, HPos.RIGHT );

        // Below I set the scene and show the stage
        myStage.setScene( myScene );
        myStage.show();
    }
}