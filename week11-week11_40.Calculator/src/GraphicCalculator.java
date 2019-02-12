
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import logic.Calculator;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calc;
    private JTextField total;
    private JTextField input;
    private JButton Z;
    
    public GraphicCalculator(){
        calc = new Calculator();
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        this.total = new JTextField("0");
        
        this.input = new JTextField("");
        
        total.setEnabled(false);
        
        container.add(total);
        container.add(input);
        container.add(createPanel());
    }
    
    private JPanel createPanel(){
        JPanel panel = new JPanel(new GridLayout(1,3));
        
        this.Z = new JButton("Z");
        this.Z.setEnabled(false);
        ResetActionListener resetListener = new ResetActionListener(calc, Z, total, input);
        Z.addActionListener(resetListener);
        
        JButton plus = new JButton("+");
        PlusActionListener plusListener = new PlusActionListener(calc, input, total, Z, input);
        plus.addActionListener(plusListener);
        
        JButton subtract = new JButton("-");
        SubtractActionListener subtractListener = new SubtractActionListener(calc, input, total, Z, input);
        subtract.addActionListener(subtractListener);

        
        panel.add(plus);
        panel.add(subtract);
        panel.add(Z);
        
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
