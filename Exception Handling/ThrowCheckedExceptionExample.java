import java.io.*;

public class ThrowCheckedExceptionExample {

	public static void method() throws FileNotFoundException {  // it throw keyword is used to throw checked exception inside the method it is necessary to declare it. this is necessary for unchecked exception  
		  
        FileReader file = new FileReader("D:\\Programs\\input_image.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
  
//        try { 
//        	throw new FileNotFoundException();  
//        }
//        catch(Exception E) {
//        	System.out.println("Exception Caught in method");
//        }
        throw new FileNotFoundException(); 
//        System.out.println("rest of the method"); //exception occurs
        
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
            System.out.println(e);  
            System.out.println("Exception Caught in main");
        }  
        System.out.println("rest of the code...");    
	}

}
