package compression;

import java.io.IOException;
import java.io.Writer;

public interface ICompression {
    public void compress(String data, Writer out) throws IOException;
    public void uncompress(String data, Writer out) throws IOException, RLEException;
}