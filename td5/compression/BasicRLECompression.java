package compression;
import exceptions.*;

import java.io.IOException;
import java.io.Writer;

public class BasicRLECompression implements ICompression {

    private char flag;

    public BasicRLECompression(char flag){
        this.flag = flag;
    }

    public String compress(String data) throws RLEException {
        String result = "";

        while(data.length() != 0){
            char current = data.charAt(0);
            if (current == flag) throw new RLEException("\nFlag at a bad position :\nData compressed : " + result + "\nData uncompressed " + data);

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
    
    public String uncompress(String data){
        String result = "";
        for (int i = 0; i < data.length()-1; i++){
            if (data.charAt(i+1) == '0' && data.charAt(i) == flag){
                result = result + data.charAt(i);
                i++;
            }else if (data.charAt(i+1) != flag){
                result = result + data.charAt(i);
            } else {
                for(int a = 0; a < Integer.parseInt(String.valueOf(data.charAt(i+2))); a++) {
                    result = result + data.charAt(i);
                }
                i++;
                i++;
            }
        }
        return result;
    }

}