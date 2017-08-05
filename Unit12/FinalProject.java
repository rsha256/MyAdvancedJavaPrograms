package Unit12;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class FinalProject extends Application
{
    // Below is where the song names are defined (chosen by my family members)
    private String songName1 = "Bad Day";
    private String songName2 = "Jailhouse Rock";
    private String songName3 = "Baby";
    private String songName4 = "Dil To Pagal Hai";
    private String songName5 = "Thriller";

    // Below is where the song authors are defined
    private String songAuthor1 = "Daniel Powter";
    private String songAuthor2 = "Elvis Presley";
    private String songAuthor3 = "Justin Bieber";
    private String songAuthor4 = "Lata Mangeshkar";
    private String songAuthor5 = "Michael Jackson";

    // Below is where the song prices are defined
    private double songPrice1 = 0.99;
    private double songPrice2 = 1.99;
    private double songPrice3 = 2.99;
    private double songPrice4 = 3.99;
    private double songPrice5 = 4.99;

    // Below are the labels for the names and email inputs
    private Label firstName = new Label( "First Name: " );
    private Label lastName = new Label( "Last Name: " );
    private Label email = new Label( "Email: " );

    // Below are the text fields for the names and email inputs
    private TextField firstNameInput = new TextField();
    private TextField lastNameInput = new TextField();
    private TextField emailInput = new TextField();

    // Below are the radio buttons for the payment option
    private RadioButton visa = new RadioButton( "Visa" );
    private RadioButton masterCard = new RadioButton( "MasterCard" );
    private RadioButton amex = new RadioButton( "Amex" );
    // Below are labels for the payment options
    private Label paymentOpt = new Label( " " );
    private Label paymentTitle = new Label( "Please select your card" );

    // Below are the labels that prompt the user on what this part of the application is about
    private Label songLabel = new Label( "      Song Title\t\t" + "       Artist\t\t" + "       Price" );
    private Label chooseSong = new Label( "Please select the songs you want to purchase" );
    // Below are the check boxes with the song info written to the right
    private CheckBox song1 = new CheckBox( songName1 + "\t\t\t" + songAuthor1 + "\t\t$" + songPrice1 );
    private CheckBox song2 = new CheckBox( songName2 + "\t\t" + songAuthor2 + "\t\t$" + songPrice2 );
    private CheckBox song3 = new CheckBox( songName3 + "\t\t\t\t" + songAuthor3 + "\t\t$" + songPrice3 );
    private CheckBox song4 = new CheckBox( songName4 + "\t" + songAuthor4 + "\t$" + songPrice4 );
    private CheckBox song5 = new CheckBox( songName5 + "\t\t\t" + songAuthor5 + "\t$" + songPrice5 );
    // Below is a label that that displays 'You've selected no songs'. The conditions for this to be displayed are later specified.
    private Label chosenSongs = new Label( "You've selected no songs" );

    // Below is the buttons for calculating the price of your purchase
    private Button calculate = new Button( "Calculate Price" );
    // Below is the button for exiting the program
    private Button exit = new Button( "Exit" );
    // This is the label that shows the price (the price is added later)
    private Label totalPrice = new Label( " " );

    // Below is the start method which I override from the Application class
    @Override
    public void start( Stage myStage )
    {
        // Below I set the title bar of my application
        myStage.setTitle( "My Online Music Store - shopping cart checkout page" );

        // Below I make an object of the GridPane class (rootNode) which I can use throughout the program to add nodes to the GridPane
        GridPane rootNode = new GridPane();
        // Below I set the horizontal and vertical gap to 5 pixels and then i align the root node to the center
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );

        // Below I create a scene with a width of 600, and a height of 650 along with the root node of the grid pane
        Scene myScene = new Scene( rootNode, 600, 650 );

        // Below I have some prompting text which will be displayed on the text field itself until something is written
        firstNameInput.setPromptText( "Enter first name here" );
        lastNameInput.setPromptText( "Enter last name here" );
        emailInput.setPromptText( "Enter email here" );

        // Below I add the Labels for your 1st and last name and email to the rootNode
        rootNode.add( firstName, 0, 0 );
        rootNode.add( lastName, 0, 1 );
        rootNode.add( email, 0, 2 );
        // Below I add the text fields for your 1st and last name and email to the rootNode
        rootNode.add( firstNameInput, 1, 0 );
        rootNode.add( lastNameInput, 1, 1 );
        rootNode.add( emailInput, 1, 2 );
        // Below I set the horizontal alignment for the "nameInput" and "emailInput" labels
        GridPane.setHalignment( firstNameInput, HPos.RIGHT );
        GridPane.setHalignment( lastNameInput, HPos.RIGHT );
        GridPane.setHalignment( emailInput, HPos.RIGHT );

        // Below I make a ToggleGroup object which will be used later so that only one payment can be selected at a time
        ToggleGroup paymentOption = new ToggleGroup();

        // Below I sync the radio buttons in a Toggle Group
        visa.setToggleGroup( paymentOption );
        masterCard.setToggleGroup( paymentOption );
        amex.setToggleGroup( paymentOption );

        // Below I give a function to each of the radio buttons
        visa.setOnAction( new visaHandler() );
        masterCard.setOnAction( new masterCardHandler() );
        amex.setOnAction( new amexHandler() );

        // Radio buttons and labels for the payment option are added to the rootNode at specified positions
        rootNode.add( paymentTitle, 0, 4);
        rootNode.add( visa, 0, 5);
        rootNode.add( masterCard, 0, 6);
        rootNode.add( amex, 0, 7);
        rootNode.add( paymentOpt, 0, 8);

        // Below I give functions to the check boxes
        song1.setOnAction( new songHandler() );
        song2.setOnAction( new songHandler() );
        song3.setOnAction( new songHandler() );
        song4.setOnAction( new songHandler() );
        song5.setOnAction( new songHandler() );

        // Below labels for the list of songs are added to the rootNode
        rootNode.add( chooseSong, 0, 10 );
        rootNode.add( chosenSongs, 0, 19 );
        rootNode.add( songLabel, 0, 11 );
        // Below I add the check boxes to the rootNode
        rootNode.add( song1, 0, 12 );
        rootNode.add( song2, 0, 13 );
        rootNode.add( song3, 0, 14 );
        rootNode.add( song4, 0, 15 );
        rootNode.add( song5, 0, 16 );
        // Below I set alignment for the 'chosenSongs' label
        GridPane.setValignment( chosenSongs, VPos.BOTTOM );
        GridPane.setHalignment( chosenSongs, HPos.LEFT );
        // Below I vertically stretch the size of the 'chosenSongs' label
        GridPane.setRowSpan( chosenSongs, 2 );
        // Below I set the vertical alignment for the 'chooseSong' label
        GridPane.setValignment( chooseSong, VPos.BOTTOM );
        // Below I set the vertical alignment for the 'songLabel' label
        GridPane.setValignment( songLabel, VPos.BOTTOM );

        // Below I make it so that when the calculate button is clicked, whatever is in the handle method of the 'calculateHandler' class will be executed
        calculate.setOnAction( new calculateHandler() );
        // Below I make it so that when the exit button is clicked, whatever is in the handle method of the 'exitHandler' class will execute
        exit.setOnAction( new exitHandler() );

        // Below I add the calculate and exit buttons to the rootNode (they are horizontally aligned later)
        rootNode.add( calculate, 1, 18 );
        rootNode.add( exit, 1, 18 );
        // Below I add a label that will display the total price to the rootNode
        rootNode.add( totalPrice, 1, 19 );
        // Below I set the Horizontal alignment for the 'calculate' button
        GridPane.setHalignment( calculate, HPos.LEFT );
        // Below I set the horizontal alignment for the 'exit' button
        GridPane.setHalignment( exit, HPos.RIGHT );
        // Below I set the alignment for the 'totalPrice' label
        GridPane.setHalignment( totalPrice, HPos.RIGHT );
        GridPane.setValignment( totalPrice, VPos.TOP );

        // Below I set the scene in the stage and then I show the stage
        myStage.setScene( myScene );
        myStage.show();
    }

    // Below is the class for handling events triggered by the Visa radio button for the payment option
    class visaHandler implements EventHandler< ActionEvent >
    {
        public void handle( ActionEvent visa )
        {
            // If Visa was selected then the 'paymentOpt' label will be set to display a String that informs the user of their choice
            paymentOpt.setText( "You have selected Visa" );
        }
    }

    // Below is the class for handling events triggered by the MasterCard radio button for the payment option
    class masterCardHandler implements EventHandler< ActionEvent >
    {
        public void handle( ActionEvent masterCard )
        {
            // If MasterCard was selected then the 'paymentOpt' label will be set to display a String that informs the user of their choice
            paymentOpt.setText( "You have selected MasterCard" );
        }
    }

    // Below is the class for handling events triggered by the American Express radio button for the payment option
    class amexHandler implements EventHandler< ActionEvent >
    {
        public void handle( ActionEvent visa )
        {
            // If AmEx was selected then the 'paymentOpt' label will be set to display a String that informs the user of their choice
            paymentOpt.setText( "You have selected Amex" );
        }
    }

    // Below is the class for handling events triggered by the check boxes
    class songHandler implements EventHandler< ActionEvent >
    {
        public void handle( ActionEvent song )
        {
            // Whenever any ActionEvent happens with the check boxes, the show selected method is called.
            showSelected();
        }
    }

    // Below is the class for calculating the price when the 'calculate' button is clicked
    class calculateHandler implements EventHandler< ActionEvent >
    {
        public void handle( ActionEvent calculatePrice )
        {
            double songPrice = 0;
            boolean noneSelected = false;

            if ( song1.isSelected() )
            {
                songPrice += songPrice1;
            }
            if ( song2.isSelected() )
            {
                songPrice += songPrice2;
            }
            if ( song3.isSelected() )
            {
                songPrice += songPrice3;
            }
            if ( song4.isSelected() )
            {
                songPrice += songPrice4;
            }
            if ( song5.isSelected() )
            {
                songPrice += songPrice5;
            }
            if ( !( song1.isSelected() | song2.isSelected() | song3.isSelected() | song4.isSelected() | song5.isSelected() ) )
            {
                noneSelected = true;
            }

            DecimalFormat moneyFormat = new DecimalFormat( "#.00" );

            if ( noneSelected )
            {
                totalPrice.setText("Your total purchase amount is $0.00");
            }
            else
            {
                totalPrice.setText("Your total purchase amount is $" + moneyFormat.format( songPrice ));
            }
        }
    }

    // Below is the class for exiting the program
    class exitHandler implements EventHandler< ActionEvent >
    {
        public void handle( ActionEvent exitProgram )
        {
            // Below I call the exit method on the Platform class to exit you out the program
            Platform.exit();
        }
    }

    // Below is the method that changes the 'chosenSongs' label depending on what songs are chosen
    private void showSelected()
    {
        // To make things neater I display the selected songs under each other. To do this I use the string var below which holds a linefeed
        String lnf = "\n";
        // The variable below holds the String which the label will be set to
        String selectedSongs = "You're shopping cart contains: " + lnf;

        if ( song1.isSelected() )
        {
            selectedSongs += songName1 + lnf;
        }
        if ( song2.isSelected() )
        {
            selectedSongs += songName2 + lnf;
        }
        if ( song3.isSelected() )
        {
            selectedSongs += songName3 + lnf;
        }
        if ( song4.isSelected() )
        {
            selectedSongs += songName4 + lnf;
        }
        if ( song5.isSelected() )
        {
            selectedSongs += songName5 + lnf;
        }
        if ( !( song1.isSelected() | song2.isSelected() | song3.isSelected() | song4.isSelected() | song5.isSelected() ) )
        {
            selectedSongs = "You've selected no songs";
        }

        // Below I set the text of the chosenSongs label to that of the String 'selectedSongs'
        chosenSongs.setText( selectedSongs );
    }
}