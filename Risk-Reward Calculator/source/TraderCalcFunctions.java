package Trader;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class TraderCalcFunctions {

    public double calcTarget(double cmp, double sloss){
        double target = cmp + (cmp - sloss)*1.6;
        return target;
    }

    public double calcSloss(double cmp, double target){
        double sloss = cmp - (target - cmp)/1.6;
        return sloss;
    }

}
