package test;

import compression.*;
import exceptions.RLEException;

public class TestRLE{
    public static void main(String[] args) throws RLEException {
        BasicRLECompression basicRLE = new BasicRLECompression('$');
        RLECompression RLE = new RLECompression('$');

        String test = "aaaaaaaabbbbbbxxxxcccbbbbbbbbbbbeeeeepppppppp";

        String RLEOut = RLE.compress(test);
        System.out.println(RLEOut);
        System.out.println(RLE.uncompress(RLEOut));

        String basicRLEOut = basicRLE.compress(test);
        System.out.println(basicRLEOut);
        System.out.println(basicRLE.uncompress(basicRLEOut));
    }
}