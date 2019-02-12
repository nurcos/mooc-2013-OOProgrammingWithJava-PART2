
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import logic.Calculator;

public class PlusActionListener implements ActionListener {
    private Calculator calc;
    private JTextField plusField;
    private JTextField totalField;
    private JButton zButton;
    private JTextField input;
        

    PlusActionListener(Calculator calc, JTextField plusField, JTextField totalField, JButton zButton, JTextField input) {
        this.calc = calc;
        this.plusField = plusField;
        this.totalField = totalField;
        this.zButton = zButton;
        this.input = input;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        try{
            calc.plus(Integer.parseInt(plusField.getText()));
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
