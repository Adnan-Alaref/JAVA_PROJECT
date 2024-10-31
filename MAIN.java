package packageproject;
import java.util.*;
import java.util.Scanner;
//***********(2176)************\\
public class MAIN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner IInput=new Scanner(System.in);
		BOOK book=new BOOK();
		ADMIN admin = new ADMIN();
		STUDENT student=new STUDENT();
		while(true) {
			System.out.println("***********************************************");
			System.out.println("***"+"->Please enter Your type for the library."+"***");
		    System.out.println("***"+"->1-USER .                               "+"***");
		    System.out.println("***"+"->2-STUDENT.                             "+"***");
			System.out.println("***"+"->3-Exit program.                        "+"***");
		    System.out.println("***********************************************");
		    int  Kind=0;
		    while(true) {
		    	try {
		    		IInput=new Scanner(System.in);
		    		Kind = IInput.nextInt();
		    	    if(Kind!=1&&Kind !=2&&Kind!=3){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		IInput.next();
		    		continue;
		    	    }
		    	}
		    if(Kind==1) {
			System.out.println("**********************************************************");
			System.out.println("###>>"+"Please click in item that you want :              "+"###");
			System.out.println("###>>"+"1-Add new publication.                            "+"###");
			System.out.println("###>>"+"2-Modify in publication .                         "+"###");
			System.out.println("###>>"+"3-Delete publication details.                     "+"###");
			System.out.println("###>>"+"4-Display list of available publications.         "+"###");
			System.out.println("###>>"+"5-Search for finding book availability.           "+"###");
			System.out.println("###>>"+"6-Add student's records upon issue of book.       "+"###");
			System.out.println("###>>"+"7-Display list of borrowed publications.          "+"###"); 
			System.out.println("###>>"+"8-Display list of over-period borrowed publication"+"###");
			System.out.println("###>>"+"9-Payment system.                                 "+"###");
			System.out.println("###>>"+"10-Exit program.                                  "+"###");
			System.out.println("**********************************************************");	

		for(int i=0;;i++) {
		int x =0;
		 while(true) {
		    	try {
		    		IInput=new Scanner(System.in);
		    		x = IInput.nextInt();
		    	    if(x!=1&&x!=2&&x!=3&&x!=4&&x!=5&&x!=6&&x!=7&&x!=8&&x!=9&&x!=10){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		IInput.next();
		    		continue;
		    	    }
		    	}
		if(x==1)
		{
			System.out.println("<< "+"Add new book."+">>");
		    admin.addBook();
			break;
		}
		
		else if(x==2)
		{
			System.out.println("<< "+"Modify in book."+">>");
			admin.modify();
			break;
		}
		
		else if(x==3)
		{
			System.out.println("<< "+"Delete book details."+">>");
			admin.DeletBook();
			break;
		}
		else if(x==4)
		{
			System.out.println("<< "+"Display list of available publications."+">>");
			  admin.displayavaliablebook();
		      break;
		}
		else if(x==5)
		{
			System.out.println("<< "+"Search for finding book availability."+">>");
			admin.searchbook();
			break;
		}
		
		else if(x==6)
		{
			System.out.println("<< "+"Add student's records upon issue of book. "+">>");
			admin.addStudent();
			break;
		}
		
		else if(x==7)
		{
			System.out.println("<< "+"Display list of borrowed publications."+">>");
			admin.displayBborowed();
			break;
			
		}
		
		else if(x==8)
		{
			System.out.println("<< "+"Display list of over-period borrowed publication."+">>");
			admin.listofBorowedBook();
			break; 
		}
		else if(x==9)
		{
			System.out.println("<< "+"Payment system. "+">>");
			admin.payment();
			break;
		}
		else if(x==10)
		{
			System.out.println("      << "+"Exit program "+">>");
			System.out.println("Do you want to exist program : 1- YES    2-NO  ");
			
			 int exist=0;
			 while(true) {
			    	try {
			    		IInput=new Scanner(System.in);
			    		exist= IInput.nextInt();
			    	    if(exist!=1&&exist!=2){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    		 break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		IInput.next();
			    		continue;
			    	    }
			    	}
             if (exist == 1)
             {
            	 System.out.println("  GOOD_ BY "); 
            	 return;
             }
             break;
		}
	
    else 
        System.out.println("Entern  your choise again : ");
	}
		int i = 1;
		if (i >= 0)
		{

			System.out.println("DO you want to choose again ...?   1-YES   2-NO");
			int again=0;
			 while(true) {
			    	try {
			    		IInput=new Scanner(System.in);
			    		again= IInput.nextInt();
			    	    if(again!=1&&again!=2){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    		 break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		IInput.next();
			    		continue;
			    	    }
			    	}
			if (again == 2)
			{

				System.out.println("         << EXIST >>");
				System.out.println("Do you want to exist program : 1- YES    2-NO  ");
				int exist=0;
				 while(true) {
				    	try {
				    		IInput=new Scanner(System.in);
				    		exist= IInput.nextInt();
				    	    if(exist!=1&&exist!=2){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		IInput.next();
				    		continue;
				    	    }
				 }
				if (exist == 1)
				{
					 System.out.println("  GOOD_ BY "); 
					return ;
				}
			}
			else
				System.out.println( "RE CHOOSE :");
		}
 }

    else if(Kind==2)
	{
    	
    	System.out.println("**********************************************************");
		System.out.println("###>>"+"Please click in item that you want :              "+"###");
		System.out.println("###>>"+"1-Borrow a publication.                           "+"###");
		System.out.println("###>>"+"2-Rewind a book.                                  "+"###");
		System.out.println("###>>"+"3-Search for finding book availability.           "+"###");
		System.out.println("###>>"+"4-Display list of available publications.         "+"###");
		System.out.println("###>>"+"5-Exit program.                                   "+"###");
		System.out.println("**********************************************************");
		
    	for(int pp=0;;pp++) {
    		int xx=0;
			 while(true) {
			    	try {
			    		IInput=new Scanner(System.in);
			    		xx= IInput.nextInt();
			    	    if(xx!=1&&xx!=2&&xx!=3&&xx!=4&&xx!=5){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    		 break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		IInput.next();
			    		continue;
			    	    }
			    	}
    		if(xx==1)
    		{
    		student.IssueBook();
    		break;
    		}
    		else if(xx==2)
    		{
    			student.ReturnBook();
    			break;
    			
    		}
    		else if(xx==3)
    		{
    			student.Searchavailablebook();
    			break;
    		}
    		else if(xx==4)
    		{
    			student.DisplayavailableBook();
    			break;
    		}
    		else if(xx==5)
    		{
    			System.out.println("       << "+"Exit program "+">>");
    			System.out.println("Do you want to exist program : 1- YES    2-NO  ");
    			 int exist=0;
				 while(true) {
				    	try {
				    		IInput=new Scanner(System.in);
				    		exist= IInput.nextInt();
				    	    if(exist!=1&&exist!=2){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		IInput.next();
				    		continue;
				    	    }
				 }
                 if (exist == 1)
                 {
                	 System.out.println("  GOOD_ BY "); 
                	 return;
                 }
                 break;
    		}
        else 
            System.out.println("Entern  your choise again : ");
       }
    		int i = 1;
            if (i >= 0)
     		{
    			System.out.println("DO you want to choose again ...?   1-YES   2-NO");
    			int again=0;
				 while(true) {
				    	try {
				    		IInput=new Scanner(System.in);
				    		again= IInput.nextInt();
				    	    if(again!=1&&again!=2){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		IInput.next();
				    		continue;
				    	    }
				 }
    			if (again == 2)
    			{
    				System.out.println("         << EXIST >>");
    				System.out.println("Do you want to exist program : 1- YES    2-NO  ");
    				 int exist=0;
    				 while(true) {
    				    	try {
    				    		IInput=new Scanner(System.in);
    				    		exist= IInput.nextInt();
    				    	    if(exist!=1&&exist!=2){
    				    			 System.out.println("Please renter your input");
    				    			 continue;}
    				    		 break;
    				    	   }catch(Exception e) {
    				    		System.out.println("This input is null and void");
    				    		IInput.next();
    				    		continue;
    				    	    }
    				 }
    				if (exist == 1)
    				{
    					 System.out.println("  GOOD_ BY "); 
    					return ;
    				}
    			}
    			else
    				System.out.println( "RE CHOOSE :");
    		}
	   }
      else if(Kind==3)
      {
    	  System.out.println("  GOOD_ BY "); 
    	  return;
      }
      else
      {
    	  System.out.println( "Renter your type :");  
      }
      }
  }
}