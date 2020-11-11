package compression;

import exceptions.RLEException;

interface ICompression {
    String compress(String data) throws RLEException;
    String uncompress(String data);
}