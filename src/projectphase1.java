
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class projectphase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			welcomescreen();
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("press 1 to view the list of existing file in root directory");
			System.out.println("press 2 for view the list of file in existing directory");
			System.out.println("press 3 to create/delete/search/ getting information of file a user file");
			System.out.println("press 4 to exit");
	        System.out.print("please enter a valid option"+ " ");	
			int option = input.nextInt();
			switch(option) {
			case (1):
				viewlist();
			break;
			case (2):
				viewlists();
			break;
			case(3):
			   CDS_file();
			break;
			   
			case(4):
				System.exit(0);
			break;
			
			default:
				System.out.println("please choose a valid option");
			break;
			
			}

		}


			private static void CDS_file() {
				 Scanner CDS = new Scanner(System.in);
				System.out.println("press 1 for create file");
				System.out.println("press 2 for delete file");
				System.out.println("press 3 for search file");
				System.out.println("press 4 for to get the information of file");
				System.out.println("press 5 to go to main menu");
				System.out.print("please enter a valid option");
				  int input= CDS.nextInt();
				  switch(input){
				  case(1):
					  createfile();
				  break;
				  
				  case(2):
					  deletefile();
				  break;
				  
				  case(3):
				   searchfile();
				   break;
				  case(4):
					  Information();
				  break;
				  case(5):
					  Mainmenu();
				   default:
					   System.out.println("please enter a valid option");
					   break;
				  }
				 


			
		}


			private static void welcomescreen() {
		
			// TODO Auto-generated method stub
			 System.out.println("==========================================");
		        System.out.println("*					*");
		        System.out.println("*   Welcome To LockMe.com		*");
		        System.out.println("*   Your Personal Digital Locker	*");
		        System.out.println("*   Developer - Raju    *");
		        System.out.println("*   contact deatils: tiwariraju148@gmail.com    *");
		        System.out.println("*  for any query feel free to write a mail *");
		        System.out.println("*					*");
		        System.out.println("==========================================");
		        System.out.println("Please read all the options carefully and provide input as required");
		        System.out.println();
		        
			
		}
		     private static void createfile() {
		      @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in) ;
			// TODO Auto-generated method stub
		    	 try{
		    		 System.out.println("please enter your file name");
		    		 String create = sc.next();
		    		 
		    		 File myfile = new File("C:\\Users\\X409DA-EK061T\\Desktop\\Project\\Phase1\\" +create+".txt");
		    		if(myfile.createNewFile()) {
		    		System.out.println("file has been created" + " "+myfile.getName());
		    		CDS_file();
		    		}
		    		else {
		    			System.out.println("file already exists");
		    			createfile();
		    		}
		    	 }
		    	 catch (IOException e) {
		    		 System.out.println("file already exists");
		    		 e.printStackTrace();
					// TODO: handle exception
				}
			
		}
		     private static void deletefile() {
		 		// TODO Auto-generated method stub
		    	 
		    
		    		 Scanner sc = new Scanner(System.in);
			    	 System.out.println("Enter the file name that you want to delete ");
			    	 String delete = sc.next();
			    	 File myfileone = new File("C:\\Users\\X409DA-EK061T\\Desktop\\Project\\Phase1\\" +delete+".txt");    	 
			    	 if(myfileone.delete()) {
			    		 System.out.println("file succesfully deleted" +" "+ myfileone.getName());
			    		 CDS_file();
			         }
			    	 else {
			    		 System.out.println(" failed to delete this file");
			    		 
			    	 }
			   
		     }
		    	 
		    	 
		 		

		     private static void searchfile() {
		   
		 		// TODO Auto-generated method stub
		    	 Scanner sc = new Scanner(System.in) ;
		    	 
			
					 System.out.println("please enter your file name");
		    		 String input = sc.next();
		    		 
		    		 File myfile3 = new File("C:\\Users\\X409DA-EK061T\\Desktop\\Project\\Phase1\\" +input+".txt");  
		    		 if(myfile3.exists()) {
		    			 System.out.println("File exist"+ myfile3.getName());
		    		 }
		    		 else {
		    			 System.out.println("file doesn't exists");
		    		 }
		    		CDS_file();	 
		    		 
				
				
		}
		 	private static void viewlist() {
				// TODO Auto-generated method stub
		 		 Scanner sc = new Scanner(System.in) ;
		    	 
				
				 System.out.println("please enter the root directory path");
	    		 String file4 = sc.next();
	    		 
		 		File myfiletwo = new File(file4);
		 		
		 		for(String s : myfiletwo.list()) {
		 			System.out.println(s);
		 		}
		 		main(null);
				
			}
		 	private static void viewlists() {
				// TODO Auto-generated method stub
		 		 
		 		File myfilethree = new File("C:\\\\Users\\\\X409DA-EK061T\\\\Desktop\\\\Project\\\\Phase1\\\\");
		 		
		 		for(String s : myfilethree.list()) {
		 			System.out.println(s);
		 		}
		 		main(null);
				
			}
		 	private static void Information() {
				// TODO Auto-generated method stub
		 		Scanner sc = new Scanner(System.in) ;
				 System.out.println("please enter your file name");
	    		 String inp = sc.next();
	    		File myfile5 = new File("C:\\Users\\X409DA-EK061T\\Desktop\\Project\\Phase1\\" +inp+".txt");  
		 		if (myfile5.exists()) {
		 		 // Returning the file name
		 		System.out.println("File name: " + myfile5.getName());
		 		 
		 		// Returning the path of the file 
		 		System.out.println("Absolute path: " + myfile5.getAbsolutePath());   
		 		 
		 		// Displaying whether the file is writable
		 		System.out.println("Writeable: " + myfile5.canWrite());  
		 		 
		 		// Displaying whether the file is readable or not
		 		System.out.println("Readable " + myfile5.canRead());  
		 		 
		 		// Returning the length of the file in bytes
		 		System.out.println("File size in bytes " + myfile5.length());  
		 		} else {
		 		System.out.println("The file does not exist.");
		 		}
		 		main(null);
		 		}
			

		 	private static void Mainmenu() {
				// TODO Auto-generated method stub
		 		main(null);
			}
 


	}


