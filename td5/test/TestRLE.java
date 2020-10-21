package test;

import compression.*;
import exceptions.ExceptionFlagPosition;

public class TestRLE{
    public static void main(String[] args) throws ExceptionFlagPosition {
        BasicRLECompression basicRLE = new BasicRLECompression('$');
        RLECompression RLE = new RLECompression('$');

        String test = " aaaaaaaa$$bbbbbbxxxxcccbbbbbbbbbbbeeeeepppppppp$";

        String RLEOut = RLE.compress(test);
        System.out.println(RLEOut);
        System.out.println(RLE.uncompress(RLEOut));

        String basicRLEOut = basicRLE.compress(test);
        System.out.println(basicRLEOut);
    }
}