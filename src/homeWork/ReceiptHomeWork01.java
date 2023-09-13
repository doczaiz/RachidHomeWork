package homeWork;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReceiptHomeWork01 {
	
	
	String storeName;
	int storePhoneNumber;
	String storeAddress;
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		LocalDateTime date= LocalDateTime.now();
        DateTimeFormatter myFormat= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatdate= date.format(myFormat);
        System.out.println(formatdate);
		
        
        // format which can help you put text or string in the center 
        String computerName ="Dell";
        String newcomputerName= String.format("%100s",computerName );
        
        System.out.println(newcomputerName);
		
		
		System.out.println(String.format("%50s",computerName));
		System.out.println();
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the store name.");
		String store=input.nextLine();
		System.out.println(String.format("%60s",store));
		
		System.out.println("Please enter the store Phone Number.");
		int storephone=input.nextInt();
		System.out.println("Please enter the store Address.");
		String storeAddress=input.nextLine();
		String storeAddress01=input.nextLine();
		
		
		ReceiptHomeWork01 StoreInfo= new ReceiptHomeWork01();
		
		System.out.println("======================================= "+ store+" =======================================");
		System.out.println("===================================== "+ storephone+" =====================================");
		System.out.println("==================================== "+ storeAddress01+" =====================================");
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
