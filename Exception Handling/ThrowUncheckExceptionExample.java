import java.io.*;
public class ThrowUncheckExceptionExample {
	public static void validateAge(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validateAge(13);  
        System.out.println("Fin");    
  }    

}
