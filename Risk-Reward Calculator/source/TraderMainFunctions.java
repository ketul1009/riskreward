package Trader;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class TraderMainFunctions {

    TraderGUI gui = new TraderGUI();
    TraderCalcFunctions calcFunctions = new TraderCalcFunctions();
    
    public void go(){

        gui.createGUI();
        
        //Registering Action Listeners for Buttons
        gui.targetButton.addActionListener(new TargetButtonListener());
        gui.slossButton.addActionListener(new SlossButtonListener());
        gui.calculate.addActionListener(new calculateButtonListener());
    }

    public class TargetButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            gui.targetBool=true;
            gui.slossBool=false;
        }
    }
    
    public class SlossButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            gui.targetBool=false;
            gui.slossBool=true;
        }
    }
    
    public class calculateButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
    
            try {
                //getting values of available prices
                double cmprice = Double.parseDouble(gui.cmp.getText());
                double targetprice = Double.parseDouble(gui.target.getText());
                double slossprice = Double.parseDouble(gui.sloss.getText());
        
                if(gui.targetBool){
                    targetprice = calcFunctions.calcTarget(cmprice, slossprice);
                    gui.price.setText(String.valueOf(targetprice));
                
                }
                else if(gui.slossBool){
                    slossprice = calcFunctions.calcSloss(cmprice, targetprice);
                    gui.price.setText(String.valueOf(slossprice));
                
                }
            }
            catch (Exception e) {
                
                gui.price.setText("Please Check Input again");
            }
    }
}
}
