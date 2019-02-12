
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import logic.Calculator;

public class ResetActionListener implements ActionListener {
        private Calculator calc;
        private JTextField totalField;
        private JButton zButton;
        private JTextField input;

    ResetActionListener(Calculator calc, JButton zButton, JTextField totalField, JTextField input) {
        this.calc = calc;
        this.totalField = totalField;
        this.zButton = zButton;
        this.input = input;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        calc.reset();
        String sum = "";
        sum += calc.getTotal();
        totalField.setText(sum);
        
        if(this.calc.getTotal() == 0){
            zButton.setEnabled(false);
        }
        else{
            zButton.setEnabled(true);
        }
        
        this.input.setText("");
        
        
        
    }
    
}
