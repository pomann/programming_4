public class WordScore
{
    String word;
    int score;
    
    public WordScore(String s){
        this.word = s;
    }
    
    public int score(String s){
        String [] line = s.split(" "); 
        for(int i = 0; i<line.length;i++){
            if(line[i].equals(this.word)){
                return Integer.parseInt(s.substring(1,2));
            }
        }
        return -1;
    }
}