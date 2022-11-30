// Group 9 GUI
// Shane Wild
// Sean Tenney
// Ridwan Sultan
// Lukas Zubal-King

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import java.awt.Color;

// PizzaShopGUI inherits JFrame class and ActionListener methods
public class PizzaShopGUI extends JFrame implements ActionListener{

    /// JLable Names
    private JLabel pepsiLabel;
    private JLabel dietPepsiLabel;
    private JLabel orangeLabel;
    private JLabel dietOrangeLabel;
    private JLabel rootBeerLabel;
    private JLabel dietRootBeerLabel;
    private JLabel sierraMistLabel;
    private JLabel lemonadeLabel;
    private JLabel breadSticksLabel;
    private JLabel breadStickBitesLabel;
    private JLabel chocolateCookieLabel;
    private JLabel logo;
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JLabel addressLabel;
    private JLabel zipCodeLabel;

    private JLabel pizzaSizesLabel;
    private JLabel pizzaToppingsLabel;
    private JLabel crustOptionsLabel;
    private JLabel beveragesLabel;

    // Text Field
    private JTextField nameTextfield;
    private JTextField phoneTextfield;
    private JTextField addressTextfield;
    private JTextField zipTextField;

    private JCheckBox pepperoniJCB;
    private JCheckBox sausageJCB;
    private JCheckBox onionJCB;
    private JCheckBox mushroomJCB;
    private JCheckBox hamJCB;
    private JCheckBox greenPepperJCB;
    private JCheckBox tomatoJCB;
    private JCheckBox pineappleJCB;

    // Button Group
    private ButtonGroup crustOptionsBG;
    private ButtonGroup pizzaSizesBG;
    private ButtonGroup paymentModeBG;

    // JButton
    private JButton processOrderButton;


    // Radio Buttons
    private JRadioButton regularCrustJRB;
    private JRadioButton thinCrustJRB;
    private JRadioButton PanCrustJRB;
    private JRadioButton smallJRB;
    private JRadioButton mediumJRB;
    private JRadioButton largeJRB;
    private JRadioButton extraLargeJRB;
    private JRadioButton cashJRB;
    private JRadioButton checksJRB;
    private JRadioButton creditCardJRB;

    /// JComboBoxes
    private JComboBox pepsiCombo;
    private JComboBox dietPepsiCombo;
    private JComboBox orangeCombo;
    private JComboBox dietOrangeCombo;
    private JComboBox rootBeerCombo;
    private JComboBox dietRootBeerCombo;
    private JComboBox sierraMistCombo;
    private JComboBox lemonadeCombo;
    private JComboBox breadSticksCombo;
    private JComboBox breadStickBitesCombo;
    private JComboBox chocolateCookieCombo;

    /// Text Area
    private JTextArea orderSummary;

    /// JPanel
    private JPanel customerPanel;
    private JPanel pizzaPanel;
    private JPanel drinksPanel;
    private JPanel paymentPanel;
    private JPanel sidesPanel;
    private JPanel proccessPanel;
    private JPanel logoPanel;

    public PizzaShopGUI()

    {
        /// Label creation
        nameLabel = new JLabel("Name: ");
        phoneLabel = new JLabel("Phone: ");
        addressLabel = new JLabel("Address: ");
        zipCodeLabel = new JLabel("Zip Code: ");
        pizzaSizesLabel = new JLabel("Pizza Sizes: ");
        pizzaSizesLabel.setFont(new Font("My Boli", Font.PLAIN, 15));
        pizzaToppingsLabel = new JLabel("Pizza toppings: First topping is free. Additional $.50, $.75, $1.00, $1.25");
        pizzaToppingsLabel.setFont(new Font("MV Boli", Font.PLAIN, 10));
        crustOptionsLabel = new JLabel("Crust options: ");
        beveragesLabel = new JLabel("Beverages: ");
        pepsiLabel=new JLabel("Pepsi");
        dietPepsiLabel=new JLabel("Diet Pepsi");
        sierraMistLabel=new JLabel("Sierra Mist");
        orangeLabel=new JLabel("Orange");
        dietOrangeLabel=new JLabel("Diet Orange");
        rootBeerLabel=new JLabel("Root Beer");
        dietRootBeerLabel=new JLabel("Diet Root Beer");
        lemonadeLabel=new JLabel("Lemonade");
        breadSticksLabel=new JLabel("Bread Sticks $4 ");
        breadStickBitesLabel=new JLabel("Bread Stick Bites $2 ");
        chocolateCookieLabel=new JLabel("Big Chocolate Chip Cookie $4");
        logo = new JLabel();

        /// Icon Label
        /*  Label Properties  */

        logo.setText("Welcome to Mom and Pop's Pizza!"); // Setting Heading for the GUI
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setVerticalTextPosition(JLabel.TOP);
        logo.setForeground(Color.BLACK);
        logo.setFont(new Font("MV Boli", Font.PLAIN, 20));
        logo.setVerticalAlignment(JLabel.BOTTOM); // Setting vertical alignment for label
        logo.setHorizontalAlignment(JLabel.CENTER); // Settting horizontal alignment for label
        logo.setBounds(0,0, 250,250); // Moving Label to the top center of the frame

        /* Image Icon Creation */

        ImageIcon pizzaImage = new ImageIcon("/Users/seanjamesontenney/Downloads/pizzaLogo2.png");
        Image image = pizzaImage.getImage();
        Image newIcon = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        pizzaImage = new ImageIcon(newIcon);
        logo.setIcon(pizzaImage);

        Vector<Integer> numbers= new Vector<>();
        for (int i=0;i<10;i++){
            numbers.add(i);
        }

        /// Creation of ComboBox
        pepsiCombo=new JComboBox(numbers);
        dietPepsiCombo=new JComboBox(numbers);
        sierraMistCombo=new JComboBox(numbers);
        orangeCombo=new JComboBox(numbers);
        dietOrangeCombo=new JComboBox(numbers);
        rootBeerCombo=new JComboBox(numbers);
        dietRootBeerCombo=new JComboBox(numbers);
        lemonadeCombo=new JComboBox(numbers);
        breadStickBitesCombo=new JComboBox(numbers);
        breadSticksCombo=new JComboBox(numbers);
        chocolateCookieCombo=new JComboBox(numbers);

        // Creation of Text Boxes
        nameTextfield = new JTextField(28);
        phoneTextfield = new JTextField(28);
        addressTextfield = new JTextField(27);
        zipTextField = new JTextField(20);

        ///Creation of Radio Buttons
        checksJRB = new JRadioButton("Check");
        creditCardJRB = new JRadioButton("Credit card");
        cashJRB = new JRadioButton("Cash");
        smallJRB = new JRadioButton("Small $4");
        mediumJRB = new JRadioButton("Medium $6");
        largeJRB = new JRadioButton("Large $8");
        extraLargeJRB = new JRadioButton("Extra large $10");
        regularCrustJRB = new JRadioButton("Regular");
        thinCrustJRB = new JRadioButton("Thin Crust");
        PanCrustJRB = new JRadioButton("Pan");
        pepperoniJCB = new JCheckBox("Pepperoni");
        sausageJCB = new JCheckBox("Sausage");
        onionJCB = new JCheckBox("Onion");
        mushroomJCB = new JCheckBox("Mushroom");
        greenPepperJCB = new JCheckBox("Green Pepper");
        hamJCB = new JCheckBox("Ham");
        tomatoJCB = new JCheckBox("Tomato");
        pineappleJCB = new JCheckBox("Pineapple");
        processOrderButton = new JButton("Process Order");

        orderSummary = new JTextArea(20, 25);
        orderSummary.setEditable(false);

        // Payment Method Button Group
        paymentModeBG = new ButtonGroup();
        paymentModeBG.add(cashJRB);
        paymentModeBG.add(checksJRB);
        paymentModeBG.add(creditCardJRB);

        // Pizza size button group
        pizzaSizesBG = new ButtonGroup();
        pizzaSizesBG.add(smallJRB);
        pizzaSizesBG.add(mediumJRB);
        pizzaSizesBG.add(largeJRB);
        pizzaSizesBG.add(extraLargeJRB);

        // Crust Option Button Group
        crustOptionsBG = new ButtonGroup();
        crustOptionsBG.add(regularCrustJRB);
        crustOptionsBG.add(thinCrustJRB);
        crustOptionsBG.add(PanCrustJRB);

        /// Creation of Logo Panel
        logoPanel = new JPanel();

        /// Creation of Panel
        customerPanel = new JPanel();
        customerPanel.setBackground(new Color(244,166,166));


        // Creation of pizza Panel
        pizzaPanel = new JPanel();
        pizzaPanel.setBackground(new Color(100,166,166));

        // Creation of drinks panel
        drinksPanel = new JPanel();
        drinksPanel.setBackground(new Color(40,105,255));

        // Creation of sides panel
        sidesPanel = new JPanel();
        sidesPanel.setBackground(new Color(144,77,14));


        // Creation of Payment Panel
        paymentPanel = new JPanel();
        paymentPanel.setBackground(new Color(244,78,155));

        // Creation of Process Button Panel
        proccessPanel = new JPanel();

        //Adding Logo to Panel
        logoPanel.add(logo);

        /// Adding Customer Information to Panel
        customerPanel.add(nameLabel);
        customerPanel.add(nameTextfield);
        customerPanel.add(phoneLabel);
        customerPanel.add(phoneTextfield);
        customerPanel.add(addressLabel);
        customerPanel.add(addressTextfield);
        customerPanel.add(zipCodeLabel);
        customerPanel.add(zipTextField);

        // Adding Pizza Size Labels to Panel
        pizzaPanel.add(pizzaSizesLabel);
        pizzaPanel.add(smallJRB);
        pizzaPanel.add(mediumJRB);
        pizzaPanel.add(largeJRB);
        pizzaPanel.add(extraLargeJRB);

        // Adding Pizza Topping Labels to Panel
        pizzaPanel.add(pizzaToppingsLabel);
        pizzaPanel.add(pepperoniJCB);
        pizzaPanel.add(sausageJCB);
        pizzaPanel.add(onionJCB);
        pizzaPanel.add(mushroomJCB);
        pizzaPanel.add(hamJCB);
        pizzaPanel.add(greenPepperJCB);
        pizzaPanel.add(tomatoJCB);
        pizzaPanel.add(pineappleJCB);
        pizzaPanel.add(crustOptionsLabel);
        pizzaPanel.add(regularCrustJRB);
        pizzaPanel.add(thinCrustJRB);
        pizzaPanel.add(PanCrustJRB);

        /// Adding Beverage Labels to Panel
        drinksPanel.add(beveragesLabel);
        drinksPanel.add(pepsiLabel);
        drinksPanel.add(pepsiCombo);
        drinksPanel.add(dietPepsiLabel);
        drinksPanel.add(dietPepsiCombo);
        drinksPanel.add(orangeLabel);
        drinksPanel.add(orangeCombo);
        drinksPanel.add(dietOrangeLabel);
        drinksPanel.add(dietOrangeCombo);
        drinksPanel.add(rootBeerLabel);
        drinksPanel.add(rootBeerCombo);
        drinksPanel.add(dietRootBeerLabel);
        drinksPanel.add(dietRootBeerCombo);
        drinksPanel.add(sierraMistLabel);
        drinksPanel.add(sierraMistCombo);
        drinksPanel.add(lemonadeLabel);
        drinksPanel.add(lemonadeCombo);

        /// Adding Side Labels to Panel
        sidesPanel.add(breadSticksLabel);
        sidesPanel.add(breadSticksCombo);
        sidesPanel.add(breadStickBitesLabel);
        sidesPanel.add(breadStickBitesCombo);
        sidesPanel.add(chocolateCookieLabel);
        sidesPanel.add(chocolateCookieCombo);

        /// Adding Payment Options to Panel
        paymentPanel.add(cashJRB);
        paymentPanel.add(checksJRB);
        paymentPanel.add(creditCardJRB);
        cashJRB.setSelected(true); // default selection

        /// Adding Processing Order Button
        proccessPanel.add(processOrderButton);

        /// Adding Order Summary to Panel
        proccessPanel.add(orderSummary);
        orderSummary.setVisible(false); // Not visible until Process Button is clicked

        // Action Listener determines when to make result visible
        processOrderButton.addActionListener(this);

        // Adding Panel to Frame
        add(logoPanel);
        add(customerPanel);
        add(pizzaPanel);
        add(drinksPanel);
        add(sidesPanel);
        add(paymentPanel);
        add(proccessPanel);

        // Frame Properites
        // Changing Layout Manager
        setLayout(new GridLayout());
        setTitle("Mom and Pop Pizzeria"); // Title of the window
        setSize(3000, 500);
        setResizable(true); // window not resizable
        setVisible(true); // window is visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits program on close of window

    }

    @Override

    public void actionPerformed(ActionEvent ae)

    {

        double bill = 0;
        int toppings = 0;
        String receipt = "";

        try

        {
            double pizzaSizeCost=.5;

            receipt += "Customer Details" + "\n";
            receipt += "Name: " + nameTextfield.getText() + "\n";
            receipt += "Phone: " + phoneTextfield.getText() + "\n";
            receipt += "Address: " + addressTextfield.getText() + "\n";
            receipt += "Pizza Details" + "\n";

            if(smallJRB.isSelected())

            {
                receipt += "Size: Small" + "\n";
                bill += 4;
                pizzaSizeCost=.5;
            }

            else if(mediumJRB.isSelected())

            {
                receipt += "Size: Medium" + "\n";
                bill += 6;
                pizzaSizeCost=.75;
            }

            else if(largeJRB.isSelected())

            {
                receipt += "Size: Large" + "\n";
                bill += 8;
                pizzaSizeCost=1;
            }

            else if(extraLargeJRB.isSelected())

            {
                receipt += "Size: Extra large" + "\n";
                bill += 10;
                pizzaSizeCost=1.25;
            }

            if(pepperoniJCB.isSelected())

            {
                toppings++;
                receipt += "Topping # " + toppings + ": Pepperoni" + "\n";
            }

            if(sausageJCB.isSelected())

            {
                toppings++;
                receipt += "Topping # " + toppings + ": Sausage" + "\n";
            }

            if(onionJCB.isSelected())

            {
                toppings++;
                receipt += "Topping # " + toppings + ": Onion" + "\n";
            }

            if(mushroomJCB.isSelected())

            {
                toppings++;
                receipt += "Topping # " + toppings + ": Mushroom" + "\n";
            }

            if (greenPepperJCB.isSelected())
            {
                toppings++;
                receipt += "Topping # " + toppings + ": Green Peppers" + "\n";
            }

            if(pineappleJCB.isSelected()){
                toppings++;
                receipt += "Topping # " + toppings + ": Pineapple" + "\n";
            }

            if (tomatoJCB.isSelected()){
                toppings++;
                receipt += "Topping # " + toppings + ": Tomato" + "\n";
            }

            if (hamJCB.isSelected()){
                toppings++;
                receipt += "Topping # " + toppings + ":Ham" + "\n";
            }

            if(regularCrustJRB.isSelected())
            {
                receipt += "Crust: " + toppings + ": Regular" + "\n";
            }

            else if(thinCrustJRB.isSelected())
            {
                receipt += "Crust: " + toppings + ": Thin crust" + "\n";
            }

            else if(PanCrustJRB.isSelected())
            {
                receipt += "Crust: " + toppings + ": Pan crust" + "\n";
            }

            int pepsiCount=Integer.parseInt(String.valueOf(pepsiCombo.getSelectedItem()));

            if (pepsiCount!=0){
                receipt+="Pepsi " + pepsiCount+"\n";
                bill+=1*pepsiCount;
            }

            int dietPepsiCount=Integer.parseInt(String.valueOf(dietPepsiCombo.getSelectedItem()));
            if (dietPepsiCount!=0){
                receipt+="Diet Pepsi " + dietPepsiCount+"\n";
                bill+=1*dietPepsiCount;

            }

            int orangeCount=Integer.parseInt(String.valueOf(orangeCombo.getSelectedItem()));
            if (orangeCount!=0){
                receipt+="Orange " + orangeCount+"\n";
                bill+=1*orangeCount;
            }

            int dietOrangeCount=Integer.parseInt(String.valueOf(dietOrangeCombo.getSelectedItem()));
            if (dietOrangeCount!=0){
                receipt+="Diet Orange " + dietOrangeCount+"\n";
                bill+=1*dietOrangeCount;

            }

            int rootBeerCount=Integer.parseInt(String.valueOf(rootBeerCombo.getSelectedItem()));
            if (rootBeerCount!=0){
                receipt+="Root Beer " + rootBeerCount+"\n";
                bill+=1*rootBeerCount;
            }

            int dietRootBeerCount=Integer.parseInt(String.valueOf(dietRootBeerCombo.getSelectedItem()));
            if (dietRootBeerCount!=0){
                receipt+="Diet Root Beer " + dietRootBeerCount+"\n";
                bill+=1*dietRootBeerCount;

            }

            int sierraMistCount=Integer.parseInt(String.valueOf(sierraMistCombo.getSelectedItem()));
            if (sierraMistCount!=0){
                receipt+="Sierra Mist " + sierraMistCount+"\n";
                bill+=1*sierraMistCount;

            }

            int lemonadeCount=Integer.parseInt(String.valueOf(lemonadeCombo.getSelectedItem()));
            if (lemonadeCount!=0){
                receipt+="Lemonade " + lemonadeCount+"\n";
                bill+=1*lemonadeCount;

            }

            if (toppings>1){
                bill+=(toppings-1)*pizzaSizeCost;
            }

            int breadSticksCounter=Integer.parseInt(String.valueOf(breadSticksCombo.getSelectedItem()));
            if (breadSticksCounter!=0){
                receipt+="Bread Sticks $4 * " + breadSticksCounter+"\n";
                bill+=4*breadSticksCounter;

            }

            receipt+="Total Cost: $"+bill+"\n";

            int breadStickBitesCounter=Integer.parseInt(String.valueOf(breadStickBitesCombo.getSelectedItem()));
            if (breadStickBitesCounter!=0){
                receipt+="Bread Stick Bites $2 * " + breadStickBitesCounter+"\n";
                bill+=4*breadStickBitesCounter;

            }
            int cookieCounter=Integer.parseInt(String.valueOf(chocolateCookieCombo.getSelectedItem()));
            if (cookieCounter!=0){
                receipt+="Chocolate Chip Cookie $4 *" + cookieCounter+"\n";
                bill+=4*cookieCounter;

            }
            receipt+="Total Cost: $"+bill+"\n";

            if(creditCardJRB.isSelected())
            {

                receipt += "Customer sign: ";

            }


            orderSummary.setText(receipt);

        }

        catch(Exception e)

        {
            orderSummary.setText("Error Try again");
        }

        orderSummary.setVisible(true); // printing order summary to screen

    }

    public static void main(String[] args)
    {
        new PizzaShopGUI(); // calling GUI method
    }

}
