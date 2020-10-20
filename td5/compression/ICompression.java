package compression;

interface ICompression {
    String compress(String data);
    String uncompress(String data);
}