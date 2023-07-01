import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) throws IOException {
		String str = "Hello, My name is Sarwasvi";
		FileWriter fw= new FileWriter("C:\\Users\\SARWASVI\\eclipse-workspace\\FileReadWrite\\src\\output.txt", true); // FileWriter(File file)
		fw.write(str+"\n"); // public void write(String str)
		for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i)); // public void write (int c)
		System.out.println("File Writing"); 
		fw.close(); //file closing
	}
}
