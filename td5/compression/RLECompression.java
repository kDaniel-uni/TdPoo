package compression;

public class RLECompression implements ICompression {

    private char flag;

    public RLECompression(char flag){
        this.flag = flag;
    }

    public String compress(String data){
        String result = "";

        while(data.length() != 0) {
            char current = data.charAt(0);
            if (current == flag) {
                result = result + flag + "0";
                data = data.substring(1);
            } else {
                int t = lengthOfSingleLetterPrefix(data);
                if (t >= 4) {
                    int nb = t / 9;
                    for (int i = 0; i <= nb; i++) {
                        if (i != nb) {
                            result = result + current + flag + "9";
                        } else {
                            result = result + current + flag + (t % 9);
                        }
                    }
                } else {
                    result = result + data.substring(0, t);
                }
                data = data.substring(t);
            }
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