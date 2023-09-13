package homeWork;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReceiptHomeWorkApp {
	

	String prodName;
	int prodId;
	 static double prodPrice= 212.75;
	 static double taxRate= 8.25;
	static double total= prodPrice*taxRate;
	static int prodQuantity;
	static double totalPrice; //prodPrice*prodQuantity;
	static double subtotal;
	static double tax;
//	static int totalPrice=prodPrice*prodQuantity;
	
	public static void main(String[] args) {
		
		
		LocalDateTime date= LocalDateTime.now();
		DateTimeFormatter myFormat= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatdate= date.format(myFormat);
//        System.out.println(formatdate);
		
       
		Scanner input=new Scanner(System.in);
		Scanner inputAddress=new Scanner(System.in);
		Scanner scanProd= new Scanner(System.in);
		// Enter Store information
        System.out.println("Please enter the store name.");
		String storeName=input.nextLine();
		System.out.println("Please enter the store Phone Number.");
		int storephone=input.nextInt();
		System.out.println("Please enter the store Address.");
		//String storeAddress=input.nextLine();
		//String storeAddress01=input.nextLine();
	    
		String address= inputAddress.nextLine();
		//System.out.println(address);
		
		// Enter products name,quantity and price
		System.out.println("Please Enter Your Item Name");
		String scanprodName=scanProd.nextLine();
		String prodName1 = scanprodName;
		System.out.println("Please Enter Item Quantity");
	    int prodQuantity1=input.nextInt(); 
		System.out.println("Please Enter Item Price");
	    double prodPrice1=input.nextDouble(); 
	    double amountprice1=prodQuantity1*prodPrice1;
	    
	   
	    
	    System.out.println("Please Enter Your Item Name");
	    String prodName2= scanProd.nextLine();
	    System.out.println("Please Enter Item Quantity");
	    int prodQuantity2=input.nextInt(); 
	    System.out.println("Please Enter Item Name Price");
	    double prodPrice2=input.nextDouble(); 
	    double amountprice2=prodQuantity2*prodPrice2;
	    
	    
	    System.out.println("Please Enter Your Item Name");
	    String prodName3= scanProd.nextLine();
	    System.out.println("Please Enter Item Quantity");
	    int prodQuantity3=input.nextInt(); 
	    System.out.println("Please Enter Item Price");
	    double prodPrice3=input.nextDouble(); 
	    double amountprice3=prodQuantity3*prodPrice3;
	    
	    System.out.println("Please Enter Your Item Name");
	    String prodName4= scanProd.nextLine();
	    System.out.println("Please Enter Item Quantity");
	    int prodQuantity4=input.nextInt(); 
	    System.out.println("Please Enter Item Price");
	    double prodPrice4=input.nextDouble(); 
	    double amountprice4=prodQuantity4*prodPrice4;
	    
	    System.out.println("Please Enter Your Item Name");
	    String prodName5= scanProd.nextLine();
	    System.out.println("Please Enter Item Quantity");
	    int prodQuantity5=input.nextInt(); 
	    System.out.println("Please Enter Item Price");
	    double prodPrice5=input.nextDouble(); 
	    double amountprice5=prodQuantity5*prodPrice5;
		
	    
		System.out.println(String.format("%60s",storeName));
		System.out.println(String.format("%60s",storephone));
		System.out.println(String.format("%70s",address));
		System.out.println(String.format("%65s",formatdate));
		
		
		
		// 547 Elizabeth Av ,Queens NY 11226

		
		

		
		System.out.println();
		System.out.println();
		
		
		System.out.print(String.format("Item Name"));
		System.out.print(String.format("%50s","Item Quantity"));
		System.out.print(String.format("%50s","Item Price"));
		
		
		System.out.println();
		System.out.println();
		
		System.out.print(String.format(prodName1));
		System.out.print(String.format("%50s",prodQuantity1));
		System.out.print(String.format("%50s",amountprice1));
		
		System.out.println();
		
		System.out.print(String.format(prodName2));
		System.out.print(String.format("%50s",prodQuantity2));
		System.out.print(String.format("%50s",amountprice2));
		
		System.out.println();
		
		System.out.print(String.format(prodName3));
		System.out.print(String.format("%50s",prodQuantity3));
		System.out.print(String.format("%50s",amountprice3));
		
		System.out.println();
		
		System.out.print(String.format(prodName4));
		System.out.print(String.format("%50s",prodQuantity4));
		System.out.print(String.format("%50s",amountprice4));
		
		System.out.println();
		
		System.out.print(String.format(prodName5));
		System.out.print(String.format("%50s",prodQuantity5));
		System.out.print(String.format("%50s",amountprice5));
		
        System.out.println();
		ReceiptHomeWorkApp.subtotal=amountprice1+amountprice2+amountprice3+amountprice4+amountprice5;
		ReceiptHomeWorkApp.tax=taxRate*subtotal/100;
		ReceiptHomeWorkApp.totalPrice=subtotal-tax;
		double newTax=subtotal+tax;
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
//	    System.out.println(String.format("%60s","Subtotal  : %.2f", ReceiptHomeWorkApp.subtotal));	
//	    System.out.println(String.format("%60s","Tax   : %.2f",ReceiptHomeWorkApp.tax));
//	    System.out.println(String.format("%60s","NewTax   : %.2f",newTax));
//	    System.out.println(String.format("%60s","Total   : %.2f",ReceiptHomeWorkApp.totalPrice));
		
		
		
		System.out.printf("Subtotal  :$  %.2f", ReceiptHomeWorkApp.subtotal,tax,totalPrice);	
		System.out.printf("Tax   : %.2f",ReceiptHomeWorkApp.tax);
		System.out.printf("Total   : %.2f",ReceiptHomeWorkApp.totalPrice);
	
		
		
		
		
		
	}

}
