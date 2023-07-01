import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterOccurance {
	// finding occurance of a given character from a file
	
	public static int getCharacterCount(File f, char c) throws IOException, FileNotFoundException {
		FileReader fr = new FileReader(f); // FileReader(File file)
		int ch, charCount = 0;
		while ((ch=fr.read())!=-1) {
//			System.out.println((char)ch+"");
			if(((char)ch + "").toLowerCase().equals((c+"").toLowerCase())) {
				charCount++;
			}
		}
		return charCount;
	}
	public static void main(String[] args) {
		File fileObject = new File("C:\\Users\\SARWASVI\\eclipse-workspace\\FileReadWrite\\src\\output.txt");
		try {
			if(!fileObject.exists()) {
				System.out.println("File does not exist");
			} else {
				char charOccurance = 'a';
				System.out.println("Character count of "+charOccurance+" in the file is: " + getCharacterCount(fileObject, charOccurance));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
