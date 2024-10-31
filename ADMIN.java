package packageproject;
import java.util.*;
public class ADMIN extends PERSON{
	BOOK b=new BOOK();
	STUDENT s=new STUDENT();
	Scanner Input=new Scanner(System.in);
	public void addBook()
	{
	    System.out.println("******************************");
	    System.out.println("***"+"-Please enter your type."+"***");
	    System.out.println("***"+"1-Add BOOk.             "+"***");
	    System.out.println("***"+"2-Add Booklet.          "+"***");
	    System.out.println("***"+"3-Add Magazine.         "+"***");
	    System.out.println("******************************");
		for(int ch=0;;ch++) {
		int c;
		 while(true) {
		    	try {
		    		Input=new Scanner(System.in);
		    		c = Input.nextInt();
		    	    if(c!=1&&c!=2&&c!=3){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		Input.next();
		    		continue;}}
		if(c==1)
	    {
		System.out.println("PLease enter number of book that you want to add it...");
		int num;
		while(true) {
	    	try {
	    		Input=new Scanner(System.in);
	    		num= Input.nextInt();
	    	    if(num<=0){
	    			 System.out.println("Please renter your input");
	    			 continue;}
	    		 break;
	    	   }catch(Exception e) {
	    		System.out.println("This input is null and void");
	    		Input.next();
	    		continue;
	    	    }
	        }
			for(int i=1;i<=num;i++) {
				for(int y=1;y<=1;y++) {
				BOOK b=new BOOK();
				System.out.println("Please enter book "+"("+i+")"+" data :-");
				System.out.println("PLease enter book ID");
				int d;
				for(int j=0;;j++) {
				    while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		d= Input.nextInt();
				    	    if(d<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				        }
					if(checkavaliableIdOrNot(d))
					{
					 System.out.println("This book aready exist !      Renter again.."); }
					else{
						b.setBid(d);
						break;}
				}
				System.out.println("Please enter book name");
				String sb;
				for(int k=0;;k++)
				{
					sb=Input.next();
					if(checkavaliablenameOrNot(sb)){
						System.out.println("This book aready exist !      Renter again..");
					}
					else{
						b.setBname(sb);
						break;}
				}
				System.out.println("PLease enter book author");
				b.setBauthor(Input.next());
				System.out.println("PLease enter num of version ");
				int g;
				while(true) {
			    	try {
			    		Input=new Scanner(System.in);
			    		g= Input.nextInt();
			    	    if(g<=0){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    	    break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		Input.next();
			    		continue;
			    	    }
			        }
				b.setBumofcopy(g);
				System.out.println("PLease enter book aviliable borrows");
				boolean fs;
				while(true) {
					 try {
						 Input=new Scanner(System.in);
						 fs=Input.nextBoolean();
					     if(fs!=true&&fs!=false){
					    		System.out.println("Please renter your input");
					    		continue;}
					      break;
					     }catch(Exception e) {
					     System.out.println("This input is null and void");
					     Input.next();
					     continue;
					     }
				   }	
				 b.setBavBorrows(fs);
				 list1.add(b);
				 System.out.println("The book ("+i+") has been added successfully:");
				 }
			 }
			break;
		}
		else if(c==2)
		{
			System.out.println("PLease enter number of booklet that you want to add it...");
			int nu;
			while(true) {
		    	try {
		    		Input=new Scanner(System.in);
		    		nu= Input.nextInt();
		    	    if(nu<=0){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		Input.next();
		    		continue;
		    	    }
		        }
			 for(int j=1;j<=nu;j++) {
				 for(int y=1;y<=1;y++) {
				 BOOK b=new BOOK();
					System.out.println("Please enter book "+"("+j+")"+" data :-");
					System.out.println("PLease enter booklet ID");
					int t;
					for(int jh=0;;jh++) {
					    while(true) {
					    	try {
					    		Input=new Scanner(System.in);
					    		t= Input.nextInt();
					    	    if(t<=0){
					    			 System.out.println("Please renter your input");
					    			 continue;}
					    		 break;
					    	   }catch(Exception e) {
					    		System.out.println("This input is null and void");
					    		Input.next();
					    		continue;
					    	    }
					        }
						if(checkavaliableIdOrNot(t))
						{
						 System.out.println("This book aready exist !      Renter again.."); 
						}
						else
						{
							b.setBid(t);
							break;
						}
					}
					System.out.println("Please enter booklet name");
					String sbok;
					for(int k=0;;k++)
					{
						sbok=Input.next();
						if(checkavaliablenameOrNot(sbok))
						{
							System.out.println("This booklet aready exist !      Renter again..");
						}
						else
						{
							b.setBname(sbok);
							break;
						}
					}
					System.out.println("PLease enter booklet author");
					b.setBauthor(Input.next());
					System.out.println("PLease enter num of version ");
					int w;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		w= Input.nextInt();
				    	    if(w<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    	    break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				        }
					b.setBumofcopy(w);
					System.out.println("PLease enter booklet aviliable borrows");
					boolean cx;
					while(true) {
						 try {
						     Input=new Scanner(System.in);
						     cx=Input.nextBoolean();
						     if(cx!=true&&cx!=false){
						    		System.out.println("Please renter your input");
						    		continue;}
						      break;
						     }catch(Exception e) {
						     System.out.println("This input is null and void");
						     Input.next();
						     continue;
						     }
					   }
					b.setBavBorrows(cx);
					list1.add(b);
					System.out.println("The booklet ("+j+") has been added successfully:");
				 }
			 }
			break; 
		}
		else if(c==3) 
		{
		System.out.println("PLease enter number of magazine that you want to add it...");
		 int nn;
		 while(true) {
		    	try {
		    		Input=new Scanner(System.in);
		    		nn= Input.nextInt();
		    	    if(nn<=0){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		Input.next();
		    		continue;
		    	    }
		    }
			for(int k=1;k<=nn;k++) 
			  {
			    for(int y=1;y<=1;y++) {
			    BOOK b=new BOOK();
			    System.out.println("Please enter book "+"("+k+")"+" data :-");
				System.out.println("PLease enter magazine ID");
				int uu;
				for(int j=0;;j++) {
					 while(true) {
					    	try {
					    		Input=new Scanner(System.in);
					    		uu= Input.nextInt();
					    	    if(uu<=0){
					    			 System.out.println("Please renter your input");
					    			 continue;}
					    		 break;
					    	   }catch(Exception e) {
					    		System.out.println("This input is null and void");
					    		Input.next();
					    		continue;
					    	    }
					        }
					if(checkavaliableIdOrNot(uu))
					{
					 System.out.println("This book aready exist !      Renter again.."); 
					}
					else
					{
						b.setBid(uu);
						break;
					}
				}
			    System.out.println("Please enter magazine name");
				String smag;
				for(int kk=0;;kk++)
				{
					smag=Input.next();
					if(checkavaliablenameOrNot(smag))
					{
						System.out.println("This magazine aready exist !      Renter again..");
					}
					else
					{
						b.setBname(smag);
						break;
					}
				}
				System.out.println("PLease enter magazine author");
			    b.setBauthor(Input.next());
			    System.out.println("PLease enter num of version ");
			    int q;
			    while(true) {
			    	try {
			    		Input=new Scanner(System.in);
			    		q= Input.nextInt();
			    	    if(q<=0){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    	    break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		Input.next();
			    		continue;
			    	    }
			        }
				b.setBumofcopy(q);
				System.out.println("PLease enter magazine aviliable borrows");
				boolean za;
				while(true) {
					 try {
					     Input=new Scanner(System.in);
					     za=Input.nextBoolean();
					     if(za!=true&&za!=false){
					    		System.out.println("Please renter your input");
					    		continue;}
					      break;
					     }catch(Exception e) {
					     System.out.println("This input is null and void");
					     Input.next();
					     continue;
					     }
				   }
				b.setBavBorrows(za);
			    list1.add(b);
				System.out.println("The magazine ("+k+") has been added successfully:");
			    }
		    } 
			break;
	   }
	  else
	  {
		System.out.println("Renter your choise ...");
	  }
  }
}
	//@overlood  *****  //integer value
	public boolean checkavaliableIdOrNot(int h)
	{
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i).getBid()==h)
			{
			return true;	
			}
			
		}
		return false;
	}
	//@overlood  *****  //integer value
	public boolean checkavaliablenameOrNot(String s)
	{
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i).getBname().equalsIgnoreCase(s))
			{
			return true;	
			}
		}
		return false;
	}
	
	public void addStudent()
	{
		System.out.println("PLease enter number of students that you want to add them ...");
		int number; 
		 while(true){
		    	try {
		    		Input=new Scanner(System.in);
		    		number= Input.nextInt();
		    	    if(number<=0){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		Input.next();
		    		continue;
		    	    }
		       }
			for(int p=1;p<=number;p++) 
			{
				for(int r=1;r<=1;r++)
				{
		        STUDENT student=new STUDENT();
		        System.out.println("Please enter student "+"("+p+")"+" data :-");
		        System.out.println("PLease enter student name");
		        student.setSname(Input.next());
		        System.out.println("PLease enter student id");
		        int F;
				for(int j=0;;j++){
				    while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		F= Input.nextInt();
				    	    if(F<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				        }
					if(checkSavailble(F))
					{
					 System.out.println("This Student aready exist !      Renter again.."); 
					}
					else
					{
						student.setSid(F);
						break;
					}
				}
		        list2.add(student);
		        System.out.println("The Student Of Id ("+F+") has been added successfully:");
				}
			}
   }
	public boolean checkSavailble(int g)
	{
		for(int i=0;i<list2.size();i++)
		{
			if(list2.get(i).getSid()==g)
			{
			return true;	
			}
		}
		return false;
	}
	
	// modify list 
			public void modify()
			{
				 //the list that have the choises ... !
			    System.out.println("******************************");
			    System.out.println("***"+"-Please enter your type."+"***");
			    System.out.println("***"+"1-Modify BOOk.          "+"***");
			    System.out.println("***"+"2-Modify Booklet.       "+"***");
			    System.out.println("***"+"3-Modify Magazine.      "+"***");
			    System.out.println("******************************");
			    System.out.println("Please enter your type that you want to modify it....");
			    int  Modtype;
			    while(true) {
			    	try {
			    		Input=new Scanner(System.in);
			    		Modtype = Input.nextInt();
			    	    if(Modtype!=1&&Modtype !=2&&Modtype!=3){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    		 break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		Input.next();
			    		continue;
			    	    }
			    	}              
			    if(Modtype==1) 
			    {
			                   //the list that have the choises of modify in book... !
				System.out.println("**********************************************************");
				System.out.println("***>>"+"Please enter the item that you want to modify it :"+"***");
				System.out.println("***>>"+"1-Modify in book id.                              "+"***");
				System.out.println("***>>"+"2-Modify in book number of version.               "+"***");
				System.out.println("***>>"+"3-Modify in book avaliable borrows.               "+"***");
				System.out.println("**********************************************************");
		
				int item;
				System.out.println("Enter your item :");
				while(true) {
			    	try {
			    		Input=new Scanner(System.in);
			    		item = Input.nextInt();
			    	    if(item!=1&&item !=2&&item!=3){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    		 break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		Input.next();
			    		continue;
			    	    }
			    	}        
			    if(item==1)
				{
					boolean m=true;
					while(m) 
					{
					System.out.println("Please Enter number of book that you want to modify them..");
					int po;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		po= Input.nextInt();
				    	    if(po<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int uy=1;uy<=po;uy++) 
					{
					System.out.println("Please enter id of book number ("+uy+")");
					int idd;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		idd= Input.nextInt();
				    	    if(idd<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int it=0;it<list1.size();it++)
					{
						boolean y=false;
						if(list1.get(it).getBid()==idd)
						{
							System.out.println("Please enter book id that you want to modify to new id..");
							int BBid;
							while(true) {
						    	try {
						    		Input=new Scanner(System.in);
						    		BBid= Input.nextInt();
						    	    if(BBid<=0){
						    			 System.out.println("Please renter your input");
						    			 continue;}
						    		 break;
						    	   }catch(Exception e) {
						    		System.out.println("This input is null and void");
						    		Input.next();
						    		continue;
						    	    }
						    }
							for(int iy=0;iy<list1.size();iy++)
							{
								for(int i=1;i<=1;i++) 
								{
							      if(list1.get(iy).getBid()==BBid)
							       {
								    System.out.println("This id can not modify !");y=true;
								    break;
							       }
								}
							}
							if(y) {m=false;continue;}
							list1.get(it).setBid(BBid);
							System.out.println("The new number has been successfully modified!");
							//m=false;
							break;
							}
						
					}
					}
					if(m==true)
					{
						System.out.println("THE BOOK AlREADY DOES NOT EXIST");
						break;
					}
				    }
				}
			    else if(item==2) {
			    	boolean ok=true;
					while(ok) 
					{
					System.out.println("Please Enter your book id");
					int idd;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		idd= Input.nextInt();
				    	    if(idd<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int iy=0;iy<list1.size();iy++)
					{
						if(list1.get(iy).getBid()==idd)
						{
							System.out.println("Please enter number of new copies ..");
							int bcopy;
							while(true) {
						    	try {
						    		Input=new Scanner(System.in);
						    		bcopy= Input.nextInt();
						    	    if(bcopy<=0){
						    			 System.out.println("Please renter your input");
						    			 continue;}
						    		 break;
						    	   }catch(Exception e) {
						    		System.out.println("This input is null and void");
						    		Input.next();
						    		continue;
						    	    }
						    }
							list1.get(iy).setBumofcopy(bcopy);
							ok=false;
							break;
							
						}
					}
					if(ok==true)
					{
					System.out.println("THE BOOK AlREADY DOES NOT EXIST");
					}
				    }
			    }
				else if(item==3)
				{
					boolean v=true;
					while(v) 
					{
					System.out.println("Please Enter your book id");
					int idd;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		idd= Input.nextInt();
				    	    if(idd<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					    for(int vi=0;vi<list1.size();vi++)
					      {
						      if(list1.get(vi).getBid()==idd)
						         {
							        System.out.println("Enter the book available borrows");
							        boolean booknewstate;
							        while(true) {
										 try {
										     Input=new Scanner(System.in);
										     booknewstate=Input.nextBoolean();
										     if(booknewstate!=true&&booknewstate!=false){
										    		System.out.println("Please renter your input");
										    		continue;}
										      break;
										     }catch(Exception e) {
										     System.out.println("This input is null and void");
										     Input.next();
										     continue;
										     }
									   }
							        list1.get(vi).setBavBorrows(booknewstate);
								    v=false;
									break;
						         }
					      }
					    if(v==true)
						{
						System.out.println("THE BOOK AlREADY DOES NOT EXIST");
						}
				   }
				}
				else
				  {
				    if(item>3||item<1)	
				    {
					 System.out.println("Renter your item choose");
				    }
				  }	
			}
	//**** modify in booklet *****\\		    
		else if(Modtype==2) 
	    {
			                   //the list that have the choises of modify in book... !
				System.out.println("**********************************************************");
				System.out.println("***>>"+"Please enter the item that you want to modify it :"+"***");
				System.out.println("***>>"+"1-Modify in booklet id.                           "+"***");
				System.out.println("***>>"+"2-Modify in booklet number of version.            "+"***");
				System.out.println("***>>"+"3-Modify in booklet avaliable borrows.            "+"***");
				System.out.println("**********************************************************");
				int item;
				System.out.println("Enter your item :");
				while(true) {
			    	try {
			    		Input=new Scanner(System.in);
			    		item = Input.nextInt();
			    	    if(item!=1&&item !=2&&item!=3){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    		 break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		Input.next();
			    		continue;
			    	    }
			    	}
			    if(item==1)
				{
				boolean m=true;
				while(m) 
				{
					System.out.println("Please Enter number of book that you want to modify them..");
					int po;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		po= Input.nextInt();
				    	    if(po<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int uy=1;uy<=po;uy++) 
					{	
					System.out.println("Please enter id of book number ("+uy+")");
					int idd;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		idd= Input.nextInt();
				    	    if(idd<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int ut=0;ut<list1.size();ut++)
					{
						boolean t=false;
						if(list1.get(ut).getBid()==idd)
						{
							System.out.println("Please enter book id that you want to modify to new id..");
							int BBid;
							while(true) {
						    	try {
						    		Input=new Scanner(System.in);
						    		BBid= Input.nextInt();
						    	    if(BBid<=0){
						    			 System.out.println("Please renter your input");
						    			 continue;}
						    		 break;
						    	   }catch(Exception e) {
						    		System.out.println("This input is null and void");
						    		Input.next();
						    		continue;
						    	    }
						    }
							for(int i=0;i<list1.size();i++)
							{
								for(int j=1;j<=1;j++)
								{
									if(list1.get(i).getBid()==BBid)
									{
										System.out.println("This id can not modify !");
										t=true;
										break;
									}
								}
							}
							if(t) {m=false; continue;}
						    list1.get(ut).setBid(BBid);
						    System.out.println("The new number has been successfully modified!");
							//m=false;
							break;
							}
					}
					}
					if(m)
					{
						System.out.println("THE BOOKLET AlREADY DOES NOT EXIST");
						break;
					}
				    }
				}
			    else if(item==2) {
			    	boolean ok=true;
					while(ok) 
					{
					System.out.println("Please Enter your booklet id");
					int idd;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		idd= Input.nextInt();
				    	    if(idd<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int bi=0;bi<list1.size();bi++)
					{
						if(list1.get(bi).getBid()==idd)
						{
							System.out.println("Please enter number of new copies ..");
							int bcopy;
							while(true) {
						    	try {
						    		Input=new Scanner(System.in);
						    		bcopy= Input.nextInt();
						    	    if(bcopy<=0){
						    			 System.out.println("Please renter your input");
						    			 continue;}
						    		 break;
						    	   }catch(Exception e) {
						    		System.out.println("This input is null and void");
						    		Input.next();
						    		continue;
						    	    }
						    }
							list1.get(bi).setBumofcopy(bcopy);
							ok=false;
							break;
						}
					}
				    }
			    }
				else if(item==3)
				{
					boolean v=true;
					while(v) 
					{
					System.out.println("Please Enter your booklet id");
					int idd;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		idd= Input.nextInt();
				    	    if(idd<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int bi=0;bi<list1.size();bi++)
					{
						if(list1.get(bi).getBid()==idd)
						{
							System.out.println("Please enter Book status ..");
							boolean bnewstate;
							while(true) {
								 try {
								     Input=new Scanner(System.in);
								     bnewstate=Input.nextBoolean();
								     if(bnewstate!=true&&bnewstate!=false){
								    		System.out.println("Please renter your input");
								    		continue;}
								      break;
								     }catch(Exception e) {
								     System.out.println("This input is null and void");
								     Input.next();
								     continue;
								     }
							   }
							list1.get(bi).setBavBorrows(bnewstate);
							v=false;
							break;
						}
					}
				    }
				}
				
				else
				{
				if(item>3||item<1)	
				{
					System.out.println("Renter your item choose");
				}
				}	
			}
				                          //**** modify in magazin *****\\
		else if(Modtype==3) 
	    {
			                   //the list that have the choises of modify in book... !
				System.out.println("**********************************************************");
				System.out.println("***>>"+"Please enter the item that you want to modify it :"+"***");
				System.out.println("***>>"+"1-Modify in magazin id.                           "+"***");
				System.out.println("***>>"+"2-Modify in magazin number of version.            "+"***");
				System.out.println("***>>"+"3-Modify in magazin avaliable borrows.            "+"***");
				System.out.println("**********************************************************");
				int item;
				System.out.println("Enter your item :");
				while(true) {
			    	try {
			    		Input=new Scanner(System.in);
			    		item = Input.nextInt();
			    	    if(item!=1&&item !=2&&item!=3){
			    			 System.out.println("Please renter your input");
			    			 continue;}
			    		 break;
			    	   }catch(Exception e) {
			    		System.out.println("This input is null and void");
			    		Input.next();
			    		continue;
			    	    }
			    	}
			    if(item==1)
				{
			    	boolean m=true;
					while(m) 
					{
			    	System.out.println("Please Enter number of book that you want to modify them..");
					int po;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		po= Input.nextInt();
				    	    if(po<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int uy=1;uy<=po;uy++) 
					{	
						System.out.println("Please enter id of book number ("+uy+")");
						int idd;
						while(true) {
					    	try {
					    		Input=new Scanner(System.in);
					    		idd= Input.nextInt();
					    	    if(idd<=0){
					    			 System.out.println("Please renter your input");
					    			 continue;}
					    		 break;
					    	   }catch(Exception e) {
					    		System.out.println("This input is null and void");
					    		Input.next();
					    		continue;
					    	    }
					    }
						for(int ut=0;ut<list1.size();ut++)
						{
							boolean t=false;
							if(list1.get(ut).getBid()==idd)
							{
								System.out.println("Please enter book id that you want to modify to new id..");
								int BBid;
								while(true) {
							    	try {
							    		Input=new Scanner(System.in);
							    		BBid= Input.nextInt();
							    	    if(BBid<=0){
							    			 System.out.println("Please renter your input");
							    			 continue;}
							    		 break;
							    	   }catch(Exception e) {
							    		System.out.println("This input is null and void");
							    		Input.next();
							    		continue;
							    	    }
							    }
								for(int i=0;i<list1.size();i++)
								{
									for(int j=1;j<=1;j++)
									{
										if(list1.get(i).getBid()==BBid)
										{
											System.out.println("This id can not modify !");
											t=true;
											break;
										}
									}
								}
								if(t) {m=false; continue;}
							    list1.get(ut).setBid(BBid);
							    System.out.println("The new number has been successfully modified!");
								break;
								}
						}
						}
						if(m)
						{
							System.out.println("THE MAGAZINE AlREADY DOES NOT EXIST");
							break;
						}
				    }
				}
			    else if(item==2) {
			    	boolean ok=true;
					while(ok) 
					{
					System.out.println("Please Enter your magazin id");
					int idd;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		idd= Input.nextInt();
				    	    if(idd<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					
					for(int bi=0;bi<list1.size();bi++)
					{
						if(list1.get(bi).getBid()==idd)
						{
							System.out.println("Please enter number of new copies ..");
							int mcopy=Input.nextInt();
							while(true) {
						    	try {
						    		Input=new Scanner(System.in);
						    		mcopy= Input.nextInt();
						    	    if(mcopy<=0){
						    			 System.out.println("Please renter your input");
						    			 continue;}
						    		 break;
						    	   }catch(Exception e) {
						    		System.out.println("This input is null and void");
						    		Input.next();
						    		continue;
						    	    }
						    }
							list1.get(bi).setBumofcopy(mcopy);
							ok=false;
							break;	
						}
					}
				    }
			    }
				else if(item==3)
				{
					boolean v=true;
					while(v) 
					{
					System.out.println("Please Enter your magazin id");
					int idd;
					while(true) {
				    	try {
				    		Input=new Scanner(System.in);
				    		idd= Input.nextInt();
				    	    if(idd<=0){
				    			 System.out.println("Please renter your input");
				    			 continue;}
				    		 break;
				    	   }catch(Exception e) {
				    		System.out.println("This input is null and void");
				    		Input.next();
				    		continue;
				    	    }
				    }
					for(int bi=0;bi<list1.size();bi++)
					{
						if(list1.get(bi).getBid()==idd)
						{
							System.out.println("Please enter magazin status ..");
							boolean mnewstate;
							while(true) {
								 try {
								     Input=new Scanner(System.in);
								     mnewstate=Input.nextBoolean();
								     if(mnewstate!=true&&mnewstate!=false){
								    		System.out.println("Please renter your input");
								    		continue;}
								      break;
								     }catch(Exception e) {
								     System.out.println("This input is null and void");
								     Input.next();
								     continue;
								     }
							   }
							list1.get(bi).setBavBorrows(mnewstate);
							v=false;
							break;
						}
					}
				    }
				}
				else
				{
				if(item>3||item<1)	
				{
					System.out.println("Renter your item choose");
				}
				}	
			}     
		}
			                         //*******(Delete book)*******\\
    public void DeletBook()
	{
    	boolean ok=true;
		 System.out.println("Please enter the book id that you want to delet it...");
		 int id;
		 while(true) {
		    	try {
		    		Input=new Scanner(System.in);
		    		id= Input.nextInt();
		    	    if(id<=0){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		Input.next();
		    		continue;
		    	    }
		        }
		 for(int io=0;io<list1.size();io++)
		 {
			 if(list1.get(io).getBid()==id)
			 {
				// int ut=list1.get(io).getBid();
				 list1.remove(io);
				 System.out.println("The request ( delete book )"+" OF ID ("+id+") was successfully executed");
				 ok=false;
				 break;
			 }
		 }
		if(ok==true)
		{
		System.out.println("THE BOOK OF ID ("+id+") AlREADY DOES NOT EXIST");
		}
	}
                            //*******(Serach book)*******\\
    public void searchbook()
    {
    	boolean ok=false;
    	System.out.println("Please enter the book id that you want to search about it..");
    	int ff;
    	
    	 while(true) {
		    	try {
		    		Input=new Scanner(System.in);
		    		ff= Input.nextInt();
		    	    if(ff<=0){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		Input.next();
		    		continue;
		    	    }
		        }
    	
    	for(int ii=0;ii<list1.size();ii++)
    	{
    		if(list1.get(ii).getBid()==ff)
    		{
    			ok=true;
    			break;
    		}
    	}
    	  if(ok==true)
    	  {
    		  System.out.println("THE STATUS OF THE BOOk OF ID (" +ff+")");
    		  System.out.println("******************************");
    		  System.out.println("* The state |"+"available       *");
    		  System.out.println("******************************");
    	  }
    	  else
    	  {
    		  System.out.println("THE STATUS OF THE BOOk OF ID (" +ff+")");
    		  System.out.println("******************************");
    		  System.out.println("* The state |"+" not available  *");
    		  System.out.println("******************************");
    	  }	
    }
                                 //*******(Displayavaliablebook)*******\\
	public void displayavaliablebook() {
		if(list1.size()!=0) 
		{
		  for(int i=0;i<list1.size();i++)
		  { 
		  //System.out.println("|"+ "THE BOOK NUMBER ("+(i+1)+")  TYPE IS ["+list1.get(i).getType()+     "]"+"|");
			System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  NAME  IS ["+list1.get(i).getBname()+"]");
			System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  ID    IS ["+ list1.get(i).getBid()+"]");                  
			System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+") AUTHOR IS ["+list1.get(i).getBauthor()+"]");                        
			System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+") STATE  IS ["+list1.get(i).isBavBorrows()+"]");                     
			System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+") COPYS  IS ["+list1.get(i).getBumofcopy()+"]");                  
			System.out.println("#*****************************************#");
		  }
	    }
		else
		{
		    System.out.println("Sorry,THIS ARRAY IS EMPATY !");
		}
	}
	                                  //*******(Display borowed book)*******\\
	public void displayBborowed()
	{
		if(!list3.isEmpty())
		{
			for(int li=0;li<list3.size();li++)
			{
				System.out.println("|"+"THE BOOK NUMBER ("+(li+1)+")  NAME    IS ["+list3.get(li).getBname()+"]");
				System.out.println("|"+"THE BOOK NUMBER ("+(li+1)+")  Auther  IS ["+list3.get(li).getBauthor()+"]");
				System.out.println("|"+"THE BOOK NUMBER ("+(li+1)+")  ID      IS ["+list3.get(li).getBid()+"]");
				System.out.println("|"+"THE BOOK NUMBER ("+(li+1)+")  state   IS ["+list3.get(li).isBavBorrows()+"]");
				System.out.println("#***************************************#");
			}
		}
		else
		{
			System.out.println("Sorry, In this array is not exist thing to display!");
		}
  }
	
	
	                               //*******(List of borowed book)*******\\
	public void listofBorowedBook() {
		boolean ok =true;
			if(!list3.isEmpty())
			{
				for(int i=0;i<list3.size();i++) {				
					//System.out.println(((System.currentTimeMillis()-list3.get(i).getBissueDate())/(1000*60))+" "+list3.get(i).getType());
					if(((System.currentTimeMillis()-list3.get(i).getBissueDate())/(1000*60))>2&&list3.get(i).getType()==1) {
					System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  NAME    IS ["+list3.get(i).getBname()+"]");
					System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  Auther  IS ["+list3.get(i).getBauthor()+"]");
					System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  ID      IS ["+list3.get(i).getBid()+"]");
					System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  state   IS ["+list3.get(i).isBavBorrows()+"]");
					System.out.println("#***************************************#");ok = false;}
				    else if(((System.currentTimeMillis()-list3.get(i).getBissueDate())/(1000*60))>1&&(list3.get(i).getType()==2||list3.get(i).getType()==3)) 
					{
				    	System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  NAME    IS ["+list3.get(i).getBname()+"]");
						System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  Auther  IS ["+list3.get(i).getBauthor()+"]");
						System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  ID      IS ["+list3.get(i).getBid()+"]");
						System.out.println("|"+"THE BOOK NUMBER ("+(i+1)+")  state   IS ["+list3.get(i).isBavBorrows()+"]");
						System.out.println("#***************************************#");ok = false;}
				    }
			}
			if(ok)
			{
				System.out.println("Sorry, In this array is not exist thing to display!");
			}
		}
		
  public void payment()
   {
	  long Date=0;
	  System.out.println("PLease enter your name..");
	  String stud = Input.next();
	  System.out.println("PLease enter your id..");
	  int stuid = Input.nextInt();
	  System.out.println("PLease enter the book  name..");
	  String bn = Input.next(); 
	  for(int k=0;k<list4.size();k++)
	  {
		if(list4.get(k).getStudentid()==stuid && list4.get(k).getBookname().equalsIgnoreCase(bn))
		{
			Date=(System.currentTimeMillis()-list4.get(k).getDate());
		}
	  }
	  Date/=1000;
	  if(Date>1728000)
	  {
		  System.out.println("Unfortunately, you have to pay a fine of 50$.");
	  }
	  else if(Date>1036800)
	  {
		  System.out.println("Unfortunately, you have to pay a fine of 40$.");
	  }
	  else
	  {
		  System.out.println("You are bound by the rules you do not have to fine."); 
	  }
   }
}