package PizzaProject;// PizzaShop class implementation

import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class PizzaShop extends JFrame implements ActionListener{

    private JLabel nameLabel;

    private JLabel phoneLabel;

    private JLabel addressLabel;


    private JLabel pizzaSizesLebel;

    private JLabel pizzaToppingsLabel;

    private JLabel crustOptionsLabel;

    private JLabel beveragesLabel;

    private JTextField nameTextfield;

    private JTextField phoneTextfield;

    private JTextField addressTextfield;


    private ButtonGroup paymentModeBG;

    private JRadioButton cashJRB;

    private JRadioButton checksJRB;

    private JRadioButton creditCardJRB;

    private ButtonGroup pizzaSizesBG;

    private JRadioButton smallJRB;

    private JRadioButton mediumJRB;

    private JRadioButton largeJRB;

    private JRadioButton extraLargeJRB;

    private JCheckBox pepperoniJCB;

    private JCheckBox sausageJCB;

    private JCheckBox onionJCB;

    private JCheckBox mushroomJCB;

    private JCheckBox hamJCB;

    private JCheckBox greenPepperJCB;

    private JCheckBox tomatoJCB;

    private JCheckBox pineappleJCB;


    private ButtonGroup crustOptionsBG;

    private JRadioButton regularCrustJRB;

    private JRadioButton thinCrustJRB;

    private JRadioButton PanCrustJRB;
    private JLabel pepsiLabel;
    private JLabel dietPepsiLabel;
    private JLabel orangeLabel;
    private JLabel dietOrangeLabel;
    private JLabel rootBeerLabel;
    private JLabel dietRootBeerLabel;
    private JLabel sierraMistLabel;
    private JLabel lemonadeLabel;


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



    private JButton processOrderButton;

    private JTextArea result;

    private JPanel customerPanel;

    public PizzaShop()

    {

        nameLabel = new JLabel("Name: ");

        phoneLabel = new JLabel("Phone: ");

        addressLabel = new JLabel("Address: ");

        pizzaSizesLebel = new JLabel("Pizza size: ");

        pizzaToppingsLabel = new JLabel("Pizza toppings: first free, rest $.50, $.75, $1.00, $1.25");

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
        Vector<Integer> numbers= new Vector<>();
        for (int i=0;i<10;i++){
            numbers.add(i);
        }
        pepsiCombo=new JComboBox(numbers);

        dietPepsiCombo=new JComboBox(numbers);
        sierraMistCombo=new JComboBox(numbers);
        orangeCombo=new JComboBox(numbers);
        dietOrangeCombo=new JComboBox(numbers);
        rootBeerCombo=new JComboBox(numbers);
        dietRootBeerCombo=new JComboBox(numbers);
        lemonadeCombo=new JComboBox(numbers);





        nameTextfield = new JTextField(20);

        phoneTextfield = new JTextField(20);

        addressTextfield = new JTextField(20);




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

        result = new JTextArea(20, 25);

        result.setEditable(false);

        paymentModeBG = new ButtonGroup();

        paymentModeBG.add(cashJRB);

        paymentModeBG.add(checksJRB);

        paymentModeBG.add(creditCardJRB);

        pizzaSizesBG = new ButtonGroup();

        pizzaSizesBG.add(smallJRB);

        pizzaSizesBG.add(mediumJRB);

        pizzaSizesBG.add(largeJRB);

        pizzaSizesBG.add(extraLargeJRB);

        crustOptionsBG = new ButtonGroup();

        crustOptionsBG.add(regularCrustJRB);

        crustOptionsBG.add(thinCrustJRB);

        crustOptionsBG.add(PanCrustJRB);

        customerPanel = new JPanel();

        customerPanel.add(nameLabel);

        customerPanel.add(nameTextfield);

        customerPanel.add(phoneLabel);

        customerPanel.add(phoneTextfield);

        customerPanel.add(addressLabel);

        customerPanel.add(addressTextfield);

        customerPanel.add(pizzaSizesLebel);

        customerPanel.add(smallJRB);

        customerPanel.add(mediumJRB);

        customerPanel.add(largeJRB);

        customerPanel.add(extraLargeJRB);

        smallJRB.setSelected(true);

        customerPanel.add(pizzaToppingsLabel);

        customerPanel.add(pepperoniJCB);

        customerPanel.add(sausageJCB);

        customerPanel.add(onionJCB);

        customerPanel.add(mushroomJCB);

        customerPanel.add(hamJCB);

        customerPanel.add(greenPepperJCB);

        customerPanel.add(tomatoJCB);

        customerPanel.add(pineappleJCB);

        customerPanel.add(crustOptionsLabel);

        customerPanel.add(regularCrustJRB);

        customerPanel.add(thinCrustJRB);

        customerPanel.add(PanCrustJRB);

        customerPanel.add(beveragesLabel);

        customerPanel.add(pepsiLabel);
        customerPanel.add(pepsiCombo);
        customerPanel.add(dietPepsiLabel);
        customerPanel.add(dietPepsiCombo);
        customerPanel.add(orangeLabel);
        customerPanel.add(orangeCombo);
        customerPanel.add(dietOrangeLabel);
        customerPanel.add(dietOrangeCombo);
        customerPanel.add(rootBeerLabel);
        customerPanel.add(rootBeerCombo);
        customerPanel.add(dietRootBeerLabel);
        customerPanel.add(dietRootBeerCombo);
        customerPanel.add(sierraMistLabel);
        customerPanel.add(sierraMistCombo);
        customerPanel.add(lemonadeLabel);
        customerPanel.add(lemonadeCombo);

        customerPanel.add(cashJRB);

        customerPanel.add(checksJRB);

        customerPanel.add(creditCardJRB);

        cashJRB.setSelected(true);

        customerPanel.add(processOrderButton);

        customerPanel.add(result);

        result.setVisible(false);

        processOrderButton.addActionListener(this);

        add(customerPanel);

        setTitle("Mom and Pop Pizzeria");

        setSize(330, 800);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override

    public void actionPerformed(ActionEvent ae)

    {

        double bill = 0;

        int toppings = 0;

        int beverages = 0;

        String report = "";

        try

        {
            double pizzaSizeCost=.5;

            report += "Customer Details" + "\n";

            report += "Name: " + nameTextfield.getText() + "\n";

            report += "Phone: " + phoneTextfield.getText() + "\n";

            report += "Address: " + addressTextfield.getText() + "\n";


            report += "Pizza Details" + "\n";

            if(smallJRB.isSelected())

            {

                report += "Size: Small" + "\n";

                bill += 4;

                pizzaSizeCost=.5;

            }

            else if(mediumJRB.isSelected())

            {

                report += "Size: Medium" + "\n";

                bill += 6;
                pizzaSizeCost=.75;

            }

            else if(largeJRB.isSelected())

            {

                report += "Size: Large" + "\n";

                bill += 8;

                pizzaSizeCost=1;
            }

            else if(extraLargeJRB.isSelected())

            {

                report += "Size: Extra large" + "\n";

                bill += 10;
                pizzaSizeCost=1.25;

            }

            if(pepperoniJCB.isSelected())

            {

                toppings++;

                report += "Topping # " + toppings + ": Pepperoni" + "\n";

            }

            if(sausageJCB.isSelected())

            {

                toppings++;

                report += "Topping # " + toppings + ": Sausage" + "\n";


            }

            if(onionJCB.isSelected())

            {
                toppings++;
                report += "Topping # " + toppings + ": Onion" + "\n";


            }

            if(mushroomJCB.isSelected())

            {
                toppings++;
                report += "Topping # " + toppings + ": Mushroom" + "\n";
            }
            if (greenPepperJCB.isSelected())
            {
                toppings++;
                report += "Topping # " + toppings + ": Green Peppers" + "\n";
            }
            if(pineappleJCB.isSelected()){
                toppings++;
                report += "Topping # " + toppings + ": Pineapple" + "\n";
            }
            if (tomatoJCB.isSelected()){
                toppings++;
                report += "Topping # " + toppings + ": Tomato" + "\n";
            }
            if (hamJCB.isSelected()){
                toppings++;
                report += "Topping # " + toppings + ":Ham" + "\n";
            }


            if(regularCrustJRB.isSelected())
            {
                report += "Crust: " + toppings + ": Regular" + "\n";
            }

            else if(thinCrustJRB.isSelected())
            {
                report += "Crust: " + toppings + ": Thin crust" + "\n";
            }

            else if(PanCrustJRB.isSelected())
            {
                report += "Crust: " + toppings + ": Pan crust" + "\n";
            }
            int pepsiCount=Integer.parseInt(String.valueOf(pepsiCombo.getSelectedItem()));
            if (pepsiCount!=0){
                report+="Pepsi " + pepsiCount+"\n";
                bill+=1*pepsiCount;
            }
            int dietPepsiCount=Integer.parseInt(String.valueOf(dietPepsiCombo.getSelectedItem()));
            if (dietPepsiCount!=0){
                report+="Diet Pepsi " + dietPepsiCount+"\n";
                bill+=1*dietPepsiCount;

            }
            int orangeCount=Integer.parseInt(String.valueOf(orangeCombo.getSelectedItem()));
            if (orangeCount!=0){
                report+="Orange " + orangeCount+"\n";
                bill+=1*orangeCount;
            }
            int dietOrangeCount=Integer.parseInt(String.valueOf(dietOrangeCombo.getSelectedItem()));
            if (dietOrangeCount!=0){
                report+="Diet Orange " + dietOrangeCount+"\n";
                bill+=1*dietOrangeCount;

            }
            int rootBeerCount=Integer.parseInt(String.valueOf(rootBeerCombo.getSelectedItem()));
            if (rootBeerCount!=0){
                report+="Root Beer " + rootBeerCount+"\n";
                bill+=1*rootBeerCount;
            }
            int dietRootBeerCount=Integer.parseInt(String.valueOf(dietRootBeerCombo.getSelectedItem()));
            if (dietRootBeerCount!=0){
                report+="Diet Root Beer " + dietRootBeerCount+"\n";
                bill+=1*dietRootBeerCount;

            }
            int sierraMistCount=Integer.parseInt(String.valueOf(sierraMistCombo.getSelectedItem()));
            if (sierraMistCount!=0){
                report+="Sierra Mist " + sierraMistCount+"\n";
                bill+=1*sierraMistCount;

            }
            int lemonadeCount=Integer.parseInt(String.valueOf(lemonadeCombo.getSelectedItem()));
            if (lemonadeCount!=0){
                report+="Lemonade " + lemonadeCount+"\n";
                bill+=1*lemonadeCount;

            }
            if (toppings>1){
                bill+=(toppings-1)*pizzaSizeCost;
            }
            report+="Total Cost: $"+bill+"\n";


            if(creditCardJRB.isSelected())
            {

                report += "Customer sign: ";

            }

            result.setText(report);

        }

        catch(Exception e)

        {

            result.setText("Error Try again");

        }

        result.setVisible(true);

    }

    public static void main(String[] args)
    {
        new PizzaShop();
    }

}
