import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException
    {
        int ch;
 
        FileReader fr=null;
        System.out.println("File Reading");
        try
        {
        	fr = new FileReader("C:\\Users\\SARWASVI\\eclipse-workspace\\FileReadWrite\\src\\output.txt"); // FileReader(String fileName)
            while ((ch=fr.read())!=-1)
                System.out.print((char)ch);
            fr.close(); //file closing
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }        
    }
}
