public class Calculator {
    private Reader reader;
    private int calculations;
    
    public Calculator(){
        this.reader = new Reader();
        this.calculations = 0;
    }
    
    public void start(){
       while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }
        }

        statistics(); 
    }
    
    private void sum(){
        int answer = 0;
        
        int[] input = askForInput();
        
        answer = input[0] + input[1];
        
        System.out.println("sum of the values " + answer);
        System.out.println();
    }
    
    private void difference(){
        int answer = 0;
        
        int[] input = askForInput();
        
        answer = input[0] - input[1];
        
        System.out.println("difference of the values " + answer);
        System.out.println();
    }
    
    private void product(){
        int answer = 0;
        
        int[] input = askForInput();
        
        answer = input[0] * input[1];
        
        System.out.println("product of the values " + answer);
        System.out.println();
            
    }
    
    private void statistics(){
        System.out.println("Calculations done " + calculations);
    }
    
    private int[] askForInput(){
        int[] input = new int[2];
        
        System.out.print("value1: ");
        input[0] = reader.readInteger();
        System.out.print("value2: ");
        input[1] = reader.readInteger();
        
        return input;
    }
}
