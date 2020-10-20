package test;

import compression.*;

public class TestRLE{
    public static void main(String[] args) {
        BasicRLECompression basicRLE = new BasicRLECompression('$');
        RLECompression RLE = new RLECompression('$');

        String test = "$aaaaaaaa$$bbbbbbxxxxcccbbbbbbbbbbbeeeeepppppppp$";
        String basicRLEOut = basicRLE.compress(test);
        String RLEOut = RLE.compress(test);

        System.out.println(basicRLEOut);
        System.out.println(RLEOut);

        System.out.println(RLE.uncompress(RLEOut));
    }
}