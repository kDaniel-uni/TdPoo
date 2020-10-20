package compression;

public class BasicRLECompression implements ICompression {

    private char flag;

    public BasicRLECompression(char flag){
        this.flag = flag;
    }

    public String compress(String data){
        String result = "";

        while(data.length() != 0){
            char current = data.charAt(0);
            if (current == flag) return "Incorrect flag position";

            int t = lengthOfSingleLetterPrefix(data);
            int nb = t/9;
            for (int i = 0; i <= nb; i++){
                if (i != nb) {result = result + current + flag + "9";}
                else {result = result + current + flag + (t % 9);}
            }
            data = data.substring(t);
        }
        return result;
    }

    int lengthOfSingleLetterPrefix(String s){

        char current = s.charAt(0);
        int ite = 1;

        while(ite < s.length() && s.charAt(ite) == current) ite++;

        return ite;
    }
    
    public String uncompress(String data){return null;}
}