
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import logic.Calculator;

public class SubtractActionListener implements ActionListener {
    private Calculator calc;
    private JTextField subtractField;
    private JTextField totalField;
    private JButton zButton;
    private JTextField input;

    SubtractActionListener(Calculator calc, JTextField subtractField, JTextField totalField, JButton zButton, JTextField input) {
        this.calc = calc;
        this.subtractField = subtractField;
        this.totalField = totalField;
        this.zButton = zButton;
        this.input = input;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
            calc.subtract(Integer.parseInt(subtractField.getText()));
        }
        catch(Exception ex){
            
        }
        String total = "";
        total += calc.getTotal();
        this.totalField.setText(total);
        
        if(this.calc.getTotal() == 0){
            zButton.setEnabled(false);
        }
        else{
            zButton.setEnabled(true);
        }
        
        this.input.setText("");
    }
    
}
