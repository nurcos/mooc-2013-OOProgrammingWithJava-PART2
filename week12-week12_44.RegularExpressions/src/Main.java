public class Main {

    public static void main(String[] args) {
        
        if(clockTime("05:41:59")){
            System.out.println("The form is fine.");
        }
        else{
            System.out.println("The form is wrong.");
        }
        
    }
    
    public static boolean isAWeekDay(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string){
        return string.matches("(a|e|i|o|u|ä|ö)*");
    }
    
    public static boolean clockTime(String string){
        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
    }
}
