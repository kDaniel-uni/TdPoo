import java.io.FileWriter;
import java.io.IOException;

public class ExportSVG {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("test.svg");
		out.write("<?xml version='1.0' encoding='utf-8'?>\n");
		out.write("<svg xmlns='http://www.w3.org/2000/svg' version='1.1' width='100' height='100'>");
		out.write("<circle cx='50' cy='50' r='40' />");
		out.write("</svg>");
		out.close();
	}
}
