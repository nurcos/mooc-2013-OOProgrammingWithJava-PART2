import java.util.Scanner;

public class UI {
    Scanner reader;
    Airport airport;
    
    public UI(Scanner reader, Airport airport){
        this.reader = reader;
        this.airport = airport;
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        
        String answer = "";
        
        while (!answer.equals("x")){
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
        
        answer = reader.nextLine();
        
            if(answer.equals("1")){
                System.out.print("Give plane ID: ");
                String planeName = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int planeCapacity = Integer.parseInt(reader.nextLine());
                airport.addPlane(planeName, planeCapacity);
            }
            else if(answer.equals("2")){
                System.out.print("Give plane ID: ");
                String planeName = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departure = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destination = reader.nextLine();
                airport.addFlight(planeName, departure, destination);
            }
        }
        System.out.println();
        
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        answer = "";
        
        while(!answer.equals("x")){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            answer = reader.nextLine();
            
            if(answer.equals("1")){
                airport.printPlanes();
            }
            else if(answer.equals("2")){
                airport.printFlights();
            }
            else if (answer.equals("3")){
                System.out.print("Give plane ID: ");
                String search = reader.nextLine();
                airport.printInfo(search);
            }
        }
    }
}
