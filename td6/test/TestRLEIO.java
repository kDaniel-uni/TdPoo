package test;

import compression.BasicRLECompression;
import compression.RLECompression;
import exceptions.RLEException;

import java.io.*;

public class TestRLEIO {
    public static void main(String[] args) throws RLEException, IOException {
        BasicRLECompression basicRLE = new BasicRLECompression('$');
        RLECompression RLE = new RLECompression('$');

        try (BufferedReader in = new BufferedReader(new FileReader("foo.in"));
             PrintWriter out = new PrintWriter(new FileWriter("foo.out"))){

            //RLE.compress(test,out);
            //basicRLE.compress(in,out);
            basicRLE.uncompress(in,out);
        }
    }
}