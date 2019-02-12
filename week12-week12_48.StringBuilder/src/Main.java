
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder string = new StringBuilder("{");

        for(int i = 0; i < t.length; i++){
            if(i % 4 == 0){
                string.append("\n ");
            }
            string.append(t[i]);
            
            if(i < t.length-1){
                string.append(", ");
            }
        }
        
        return string.append("\n}").toString();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //StringBuilder string = new StringBuilder();
        
        //int arr = 0;
        //int remainder = t.length % 4;
        //string.append("{ \n ");
        
        //add row 4 numbers
        //for(int i = 0; i < t.length / 4 ; i++){
        //    for(int j = 0; j < 4; j++){
        //        string.append(t[arr]);
        //        arr++;
        //        string.append(", ");
        //    }
        //    string.append("\n");
        //}
        
        //remove final comma if no more numbers after rows
        //if(remainder == 0){
        //    string.deleteCharAt(string.length()-1);
        //}
        
       // for(int j = 0; j < remainder; j++){
        //    string.append(t[arr]);
        //    if(j < remainder-1){
        //        string.append(" , ");
        //    }
        //    arr++;
        //}

        //if(remainder != 0){
        //    string.append("\n");
        //}
        //string.append("}");
            
        //return string.toString();
    }
}
