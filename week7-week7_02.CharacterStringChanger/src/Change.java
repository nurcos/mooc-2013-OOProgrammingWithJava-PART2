public class Change {
    private char fromCharacter;
    private char toCharacter;
    
    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString){
        String word = "";
        for(int i = 0; i < characterString.length(); i++){
            if(characterString.charAt(i) == fromCharacter){
                word += toCharacter;
            }
            else{
                word += characterString.charAt(i);
            }
        }
        
        return word;
    }
    
}
