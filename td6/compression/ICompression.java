package compression;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import exceptions.*;

interface ICompression {
    public void compress(Reader in, Writer out) throws IOException, RLEException;
    public void uncompress(Reader in, Writer out) throws IOException, RLEException;
}
