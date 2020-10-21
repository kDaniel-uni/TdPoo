package compression;

import exceptions.ExceptionFlagPosition;

interface ICompression {
    String compress(String data) throws ExceptionFlagPosition;
    String uncompress(String data);
}