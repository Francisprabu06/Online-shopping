package com.onlineShopping.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineShopping {
	public static double  amount;
		public static void main(String[] args){
			System.out.println("       *** WELCOME TO ONLINE SHOPPING SYSTEM ***");
			System.out.println(" ");
			Map<Integer,String> mobileList = new HashMap<Integer,String>();			
			mobileList.put(1,"iphone 5s");
			mobileList.put(2,"Moto G5");
			mobileList.put(3,"Lenovo k3 Note");
			mobileList.put(4,"Lenovo k4 Note");
			mobileList.put(5,"Lenovo k5 Note");
			mobileList.put(6,"Samsung s7");
			mobileList.put(7,"Nokia 3310");
			mobileList.put(8,"Sony Xperia Z3");
			mobileList.put(9,"Coolpad Note");
			mobileList.put(10,"Micromax Canvas 2");
			System.out.println("          *****The Mobile List*****    ");
			System.out.println("");
			for(Map.Entry mList:mobileList.entrySet()){
			  	System.out.println("          "+mList.getKey()+" "+mList.getValue());
				}
			System.out.println(" ");
			ArrayList<String> priceList = new ArrayList<String>();
			priceList.add("1.iphone 5s price---Rs-25000");
			priceList.add("2.Moto G5 price---Rs-20000");
			priceList.add("3.Lenovo k3 Note price---Rs-10000");
			priceList.add("4.Lenovo k4 Note price---Rs-12000");
			priceList.add("5.Lenovo k5 Note price---Rs-13000");
			priceList.add("6.Samsung s7 price---Rs-18000");
			priceList.add("7.Nokia 3310 price---Rs-20000");
			priceList.add("8.Sony Xperia Z3 price---Rs-17000");
			priceList.add("9.Coolpad Note price---Rs-9000");
			priceList.add("10.Micromax Canvas 2 price---Rs-6000");
			System.out.println("          *****Today's Price List*****");
			System.out.println(" ");
			for(String str1:priceList){
				System.out.println("          "+str1);
			}
			System.out.println(" ");
			ArrayList<String> description = new ArrayList<String>();
			description.add("1.Apple iPhone 5s 16GB comes with stunning 4 inch Retina display.");
			description.add("2.The Motorola Moto G5 is powered by 1.4GHz octa-core Qualcomm Snapdragon 430 processor and it comes with 3GB of RAM.");
			description.add("3.Lenovo K3 Note smartphone with 5.5 inch 1080x1920 display powered by 1.7GHz octa-core processor 2GB RAM and 13 MP rear camera.");
			description.add("4.Lenovo K4 Note flaunts a 5.5-inch full HD display with 178 degree wide angle 3GB of LPDDR3 RAM. Also on offer is 16GB internal storage.");
			description.add("5.The Lenovo  K5 Note is powered by 1.8GHz octa-core MediaTek Helio P10 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage that can be expanded up to 128GB via a microSD card.");
			description.add("6.Samsung's Galaxy S7 retains much of the design. It is also more powerful thanks to Exynos 8890 64-bit chipset, has much better photographic capabilities with a 12-megapixel f/1.7 camera, a microSD card slot to expand internal storage.");
			description.add("7.Nokia 3310 feature phone comes with new features a 2.4 inch QVGA display,and 16GB internal storage, which can further be expanded up to 32GB using a microSD card, 1,200 mAh removable battery. On the software front, it runs on Nokia Series 30+.");
			description.add("8.The Sony Xperia Z3 is powered by 2.5GHz quad-core Qualcomm Snapdragon 801 processor 3GB of RAM. The phone packs 16GB of internal storage that can be expanded up to 128GB  microSD card. Sony Xperia Z3 packs a 20.7-megapixel primary camera on the rear and a 2.2-megapixel.");
			description.add("9.Coolpad Note 5 phone comes with a 5.50-inch touchscreen display with a resolution of 1080 pixels by 1920 pixels.The Coolpad Note 5 is powered by 1.5GHz octa-core Qualcomm Snapdragon 4GB of RAM. The phone packs 32GB of internal storage that can be expanded up to 64GB microSD card.  ");
			description.add("10.The Micromax Canvas 2 (2017) is powered by 1.3GHz quad-core Mediatek MT6737 processor 3GB of RAM. The phone packs 16GB of internal storage that can be expanded up to 64GB via a microSD card. the Micromax Canvas 2 (2017) packs a 13-megapixel primary camera on the rear and a 5-megapixel.");
			System.out.println("          *****Mobile phone Descriptions*****");
			System.out.println(" ");
			for(String str2:description){
				System.out.println("          "+str2);
			}
			System.out.println(" ");
			boolean valid;
			int in=0;
			do{
				Scanner input = new Scanner(System.in);
				System.out.println("          Choose your phone");
				try{
					in=input.nextInt();
					valid=true;
					if(in==1){
						System.out.println("          You have choosen iphone 5s price---Rs-25000" );
					}else if(in==2){
						System.out.println("          You have choosen Moto G5 price---Rs-20000" );
					}else if(in==3){
						System.out.println("          You have choosen Lenovo k3 Note price---Rs-10000" );
					}else if(in==4){
						System.out.println("          You have choosen Lenovo k4 Note price---Rs-12000" );
					}else if(in==5){
						System.out.println("          You have choosen Lenovo k5 Note price---Rs-13000" );
					}else if(in==6){
						System.out.println("          You have choosen Samsung s7 price---Rs-18000" );
					}else if(in==7){
						System.out.println("          You have choosen Nokia 3310 price---Rs-20000" );
					}else if(in==8){
						System.out.println("          You have choosen Sony Xperia Z3 price---Rs-17000" );
					}else if(in==9){
						System.out.println("          You have choosen Coolpad Note price---Rs-9000" );
					}else if(in==10){
						System.out.println("          You have choosen Micromax Canvas 2 price---Rs-6000" );
					}else{
						System.out.println("          Please choose correct Number");
					}
				}catch(Exception e){
					valid=false;
					System.out.println("          Please choose correct number");
				}
			}while(!valid);
			
			double in1=0;
			
			do{
				Scanner input1 = new Scanner(System.in);
				System.out.println("          How many mobile phones you want?");
				try{
					in1=input1.nextDouble();
					valid=true;
					if(in1==in1){
						if(in==1){
							amount=(in1*25000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==2){
							amount=(in1*20000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==3){
							amount=(in1*10000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==4){
							amount=(in1*12000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==5){
							amount=(in1*13000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==6){
							amount=(in1*18000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==7){
							amount=(in1*20000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==8){
							amount=(in1*17000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==9){
							amount=(in1*9000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else if(in==10){
							amount=(in1*6000);
							System.out.println("          Please Pay the Amount Rs-"+amount);
						}else{
							System.out.println("          Please Enter correct number");
						}
					}
				}catch(Exception e){
					valid=false;
					System.out.println("          Please Enter correct number");
				}
			}while(!valid);
				
			System.out.println("          "+"Enter your payment option :1.Cash on Delivery  2.Add to Cart  3.Wallet" );	
		
			
			int in2=0;
			
			do{
				Scanner input2 = new Scanner(System.in);
				System.out.println("          Enter your choice");
				try{
					in2=input2.nextInt();
					valid=true;
					if(in2==1){
						System.out.println("          "+"Thank you,please enter your Address. ");
						}else if(in2==2){
						System.out.println("          "+"Thank you,please enter your Cart details. ");
					}else if(in2==3){
						System.out.println("          "+"Thank you for choosing your Wallet. ");
					}else{
						System.out.println("          Please choose any one of above three");
					}
				}catch(Exception e){
					valid=false;
					System.out.println("          Please choose any one of above three");
				}
			}while(!valid);
		
				
			if(in2==1){
					Scanner input3 = new Scanner(System.in);
					System.out.println("          Enter your Address");
					String	addrs=input3.nextLine();
					System.out.println("          Enter your MobileNo");
					long	mobNo=input3.nextLong();
					System.out.println("          If conform your Address :");
					System.out.println("          "+addrs );
					System.out.println("          "+ mobNo );
					System.out.println("          1.conform  2.Exit");
					int in4=0;		
					do{		
						Scanner input4 = new Scanner(System.in);
						System.out.println("          Enter your choice");
						try{
							in4=input4.nextInt();
							valid=true;
							if(in4==1){
								System.out.println("          "+"Thank you for Purchasing.Your order delivered in two days.Have a Nice Day... ");
							}else if(in4==2){
								System.out.println("          "+"Your Order has been Cancelled...... ");
							}else{
								System.out.println("          Please choose correct Number");
							}
						}catch(Exception e){
							valid=false;
							System.out.println("          Please choose any one of above Two");
						}
					}while(!valid);
			}
			double balance, wallet=10000;
			if(in2==3){
				System.out.println("          Thank u for using wallet,Your Wallet Balance is Rs-"+wallet);
				if(wallet==amount){
					balance=wallet-amount;
							System.out.println("          "+"your order has been conformed, and your wallet Balance is Rs-"+balance);
							}else if(wallet>amount){
							balance=wallet-amount;
							System.out.println("          "+"your order has been conformed, and your wallet Balance is Rs-"+balance);
						}else if(wallet<amount){
							balance=amount-wallet;
							System.out.println("          "+"Your wallet Amount is low and you have pay Blance Amount Rs-"+balance+" Please Add Money your wallet.");
						}else{
							System.out.println("          Please choose any one of above three");
						}
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
}
