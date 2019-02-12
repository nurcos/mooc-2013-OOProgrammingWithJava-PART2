package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ClickListener implements ActionListener {

    private Calculator calc;
    private JLabel label;
    
    public ClickListener(Calculator calculator, JLabel label){
        this.calc = calculator;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        String calcValue = "";
        calcValue += calc.giveValue();
        label.setText(calcValue);
    }
    
}
