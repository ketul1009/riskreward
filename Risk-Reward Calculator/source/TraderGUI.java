package Trader;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class TraderGUI {

    //Declaring all the varibles that will used by inner classes and methods
    public JFrame mainWindow = new JFrame("Trader");
    public JLabel price = new JLabel("---------------");
    public JTextField cmp;
    public JTextField target;
    public JTextField sloss;
    public JButton calculate;
    public JRadioButton targetButton;
    public JRadioButton slossButton;
    public boolean targetBool;
    public boolean slossBool;

    public void createGUI(){

        //Making all the required Panels
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JPanel buttonPanel = new JPanel();
        JPanel pricesPanel = new JPanel();
        JPanel cmpPanel = new JPanel();
        JPanel targetPanel = new JPanel();
        JPanel slossPanel = new JPanel();
        pricesPanel.setLayout(new BoxLayout(pricesPanel, BoxLayout.Y_AXIS));

        //making Labels for price
        JLabel cmpLabel = new JLabel("CMP");
        JLabel targetLabel = new JLabel("Target");
        JLabel slossLabel = new JLabel("Stop Loss");

        //Making all the buttons
        targetButton = new JRadioButton("Target");
        slossButton = new JRadioButton("Stop Loss");
        calculate = new JButton("Calculate");
        ButtonGroup buttons = new ButtonGroup();

        //Making all the Text fiels
        cmp = new JTextField("0", 10);
        target = new JTextField("0", 10);
        sloss = new JTextField("0", 10);

        //Adding buttons to ButtonPanel
        buttons.add(targetButton);
        buttons.add(slossButton);
        buttonPanel.add(targetButton);
        buttonPanel.add(slossButton);

        //Adding prices and text fields to their panels
        cmpPanel.add(cmpLabel);
        cmpPanel.add(cmp);
        targetPanel.add(targetLabel);
        targetPanel.add(target);
        slossPanel.add(slossLabel);
        slossPanel.add(sloss);

        //Adding price panels to price panel
        pricesPanel.add(cmpPanel);
        pricesPanel.add(targetPanel);
        pricesPanel.add(slossPanel);

        //Adding components to main Panel
        mainPanel.add(buttonPanel);
        mainPanel.add(pricesPanel);
        mainPanel.add(price);
        mainPanel.add(calculate);

        mainWindow.getContentPane().add(mainPanel);
        mainWindow.setSize(500, 500);
        mainWindow.setVisible(true);
    }

    
}