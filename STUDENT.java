package packageproject;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class STUDENT extends PERSON implements Interface {
	
	private String Sname;
	private int Sid;
	private int Scountversionofbook;
	private String IssueDate;

	public STUDENT() {
		Sname = "";
		Sid = 0;
		Scountversionofbook = 0;
		IssueDate = "";
	}

	public void setIssueDate(String issueDate) {
		IssueDate = issueDate;
	}

	public String getIssueDate() {
		return IssueDate;
	}

	public void setSname(String Sname) {
		this.Sname = Sname;
	}

	public String getSname() {
		return Sname;
	}

	public void setSid(int Sid) {
		this.Sid = Sid;
	}

	public int getSid() {
		return Sid;
	}

	public void setScountversionofbook(int Scountversionofbook) {
		this.Scountversionofbook = Scountversionofbook;
	}

	public int getScountversionofbook() {
		return Scountversionofbook;
	}

	Scanner KK = new Scanner(System.in);
	BOOK b = new BOOK();

	@Override
	public void IssueBook() {
		// TODO Auto-generated method stub
		System.out.println("IF YOU WANT TO ISSUE ENTER THE TYPE OF ITEM ?");
		System.out.println("******************************");
		System.out.println("***"+ "-Please enter your type"+"***");
		System.out.println("***"+ "1-ISSUE BOOk.          "+"***");
		System.out.println("***"+ "2-ISSUE Booklet.       "+"***");
		System.out.println("***"+ "3-ISSUE Magazine.      "+"***");
		System.out.println("******************************");
		int typ;
		for (int k = 0;; k++) {
			try {typ = KK.nextInt();
				if (typ == 1) {System.out.println("<<BOOK>>");break;}
				else if (typ == 2) {System.out.println("<<Booklet>>");break;} 
				else if (typ == 3) {System.out.println("<< Magazine>>");break;}
				else {System.out.println("Renter choise your type !");}
			} catch (Exception e) {
				System.out.println("This input is null and void");
				KK.next();
			}
		}
		System.out.println("Please enter your name.");
		String sname = KK.next();
		System.out.println("Please enter the student id..");
		int sid;
		 while(true) {
		    	try {
		    		KK=new Scanner(System.in);
		    		sid= KK.nextInt();
		    	    if(sid<=0){
		    			 System.out.println("Please renter your input");
		    			 continue;}
		    		 break;
		    	   }catch(Exception e) {
		    		System.out.println("This input is null and void");
		    		KK.next();
		    		continue;
		    	    }
		 }
		boolean ff = true;
		for (int j = 0; j < list2.size(); j++) {
			if (list2.get(j).getSid() == sid) {
				ff = false;
				break;
			}
		}
		if (ff) {
			this.AddStudent(sname, sid);
		}
		System.out.println("PLease enter The number of books you want to borrow");
		int numcopy;
		while(true) {
	    	try {
	    		KK=new Scanner(System.in);
	    		numcopy= KK.nextInt();
	    	    if(numcopy<=0){
	    			 System.out.println("Please renter your input");
	    			 continue;}
	    		 break;
	    	   }catch(Exception e) {
	    		System.out.println("This input is null and void");
	    		KK.next();
	    		continue;
	    	    }
	 }
		for (int ti = 1; ti <= numcopy; ti++) {
			System.out.println("Please enter the Book" + "(" + ti + ")" + "name");
			String bname = KK.next();
			boolean ok = false;
			for (int g = 0; g < list1.size(); g++) {
				if (list1.get(g).getBname().equalsIgnoreCase(bname)) {
					ok = true;
					if (list1.get(g).getBumofcopy() == 1 || list1.get(g).isBavBorrows() == false) {
						System.out.println("Sorry , you can not issue book of number " + "(" + ti + ")");
						break;
					} else if (list1.get(g).getBumofcopy() > 1 && list1.get(g).isBavBorrows() == true) {
						Checkstudent(sid, g, bname, typ);
					}
				}
			}
			if (ok == false) {
				System.out.println("Sorry , this book is not found..!");
			}
		}
	}

	public void Checkstudent(int d, int index, String bnam, int typ) {
		// TODO Auto-generated method stub
		for (int hh = 0; hh < list2.size(); hh++) {
			if (list2.get(hh).getSid() == d) {
				if (list2.get(hh).getScountversionofbook() < 7) {
					System.out.println("BOOK issued");
					list1.get(index).setBissueDate(System.currentTimeMillis());
					list1.get(index).setType(typ);
					PAYMENT pay = new PAYMENT();
					pay.setBookname(bnam);
					pay.setStudentid(d);
					pay.setDate(System.currentTimeMillis());
					pay.setType(typ);
					list4.add(pay);
					list1.get(index).setBumofcopy(list1.get(index).getBumofcopy() - 1);
					list2.get(hh).setScountversionofbook(list2.get(hh).getScountversionofbook() + 1);
					list3.add(list1.get(index));
					
				} else {
					System.out.println("sorry , you Skip the specified quantity...");
				}
			}
		}
	}

	public void AddStudent(String sname, int sd) {
		STUDENT s = new STUDENT();
		s.setSname(sname);
		for (int i = 0;; i++) {
			if (cheackSava(sd)) {
				System.out.println("This Student aready exist !      Renter again..");
			} else {
				s.setSid(sd);
				break;
			}
		}
		list2.add(s);
		System.out.println("The Student has been added successfully:");
	}

	public boolean cheackSava(int gh) {
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getSid() == gh) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void ReturnBook() {
		// TODO Auto-generated method stub
		System.out.println("IF YOU WANT TO RETURN ENTER THE TYPE OF ITEM ?");
		System.out.println("******************************");
		System.out.println("***"+ "-Please enter your type"+"***");
		System.out.println("***"+ "1-RETURN BOOk.         "+"***");
		System.out.println("***"+ "2-RETURN Booklet.      "+"***");
		System.out.println("***"+ "3-RETURN Magazine.     "+"***");
		System.out.println("******************************");
		int t = 0;
		System.out.println("Please enter the return type");
		for (int k = 0;; k++) {
			try {t = KK.nextInt();
				if (t == 1) {System.out.println("<<BOOK>>");break;}
				else if (t == 2) {System.out.println("<<Booklet>>");break;} 
				else if (t == 3) {System.out.println("<< Magazine>>");break;}
				else {System.out.println("Renter choise your type !");}
			} catch (Exception e) {
				System.out.println("This input is null and void");
                KK.next();
			}
		}
		System.out.println("Please enter your name. ");
		String str = KK.next();
		System.out.println("Please enter your id");
		int d;
		while(true) {
	    	try {
	    		KK=new Scanner(System.in);
	    		d= KK.nextInt();
	    	    if(d<=0){
	    			 System.out.println("Please renter your input");
	    			 continue;}
	    		 break;
	    	   }catch(Exception e) {
	    		System.out.println("This input is null and void");
	    		KK.next();
	    		continue;
	    	    }
	        }
		System.out.println("Please enter the number of book that you want to return it");
		int numbook;
		while(true) {
	    	try {
	    		KK=new Scanner(System.in);
	    		numbook= KK.nextInt();
	    	    if(numbook<=0){
	    			 System.out.println("Please renter your input");
	    			 continue;}
	    		 break;
	    	   }catch(Exception e) {
	    		System.out.println("This input is null and void");
	    		KK.next();
	    		continue;
	    	    }
	        }
		for (int h = 1; h <= numbook; h++) {
			boolean x=true;
			System.out.println("Please enter the book name of book (" + h + ")");
			String s;
			int df = 0;
			for (int y = 0;; y++) {
				s = KK.next();
				if (returnIndex(s) != -1) {
					df = returnIndex(s);
					break;
				} else {
					System.out.println("you havn't this book ");
					x=false;
					break;
				}
			}
			if(x) {
			for (int i = 0; i < list2.size(); i++) {
				if (list2.get(i).getSid() == d) {
					list1.get(returnIndexx(s)).setBumofcopy(list1.get(returnIndexx(s)).getBumofcopy() + 1);
					list2.get(i).setScountversionofbook(list2.get(i).getScountversionofbook() - 1);
					list3.remove(df);
				}
			}
			System.out.println("The borrowing back process has ended");
			Tax(d, s, t);
			}
		}
	}

	 public int returnIndex(String bnam) {
		for (int m = 0; m < list3.size(); m++) {
			if (list3.get(m).getBname().equalsIgnoreCase(bnam)) {
				return m;
			}
		}
		return -1;
	}

	public int returnIndexx(String bnam) {
		for (int m = 0; m < list1.size(); m++) {
			if (list1.get(m).getBname().equalsIgnoreCase(bnam)) {
				return m;
			}
		}
		return -1;
	}

	public void Tax(int sd, String bn, int ty) {
		long d = 0;
		for (int k = 0; k < list4.size(); k++) {
			if (list4.get(k).getStudentid() == sd && list4.get(k).getBookname().equalsIgnoreCase(bn)) {
				d = (System.currentTimeMillis() - list4.get(k).getDate()); 
				d = d / 60000;
				if (d > 2 && ty == 1){//1,728,000‬s *** //28,800d	
					System.out.println("Unfortunately, you have to pay a fine of 50$.");}
				else if (d > 1 && (ty == 2 || ty == 3)){//1,036,800s *** //17,280‬d
				   System.out.println("Unfortunately, you have to pay a fine of 40$.");}
				else{
				   System.out.println("You are bound by the rules you do not have to fine.");}
			}
	}}
	@Override
	public void Searchavailablebook() {
		// TODO Auto-generated method stub
		boolean ok = false;
		System.out.println("Please enter the book name that you want to search about it..");
		String ss = KK.next();
		System.out.println("Please enter the book id that you want to search about it..");
		int d;
		while(true) {
	    	try {
	    		KK=new Scanner(System.in);
	    		d = KK.nextInt();
	    	    if(d <=0){
	    			 System.out.println("Please renter your input");
	    			 continue;}
	    		 break;
	    	   }catch(Exception e) {
	    		System.out.println("This input is null and void");
	    		KK.next();
	    		continue;
	    	    }
	        }
		for (int y = 0; y < list1.size(); y++) {
			if (list1.get(y).getBid() == d) {
				ok = true;
				break;
			}
		}
		if (ok == true) {
			System.out.println("THE STATUS OF THE BOOk OF ID (" + d + ")");
			System.out.println("******************************");
			System.out.println("* The state |" + "available  *");
			System.out.println("******************************");
		} else {
			System.out.println("THE STATUS OF THE BOOk OF ID (" + d + ")");
			System.out.println("******************************");
			System.out.println("* The state |"+"not available*");
			System.out.println("******************************");
		}
	}

	@Override
	public void DisplayavailableBook() {
		// TODO Auto-generated method stub
		if (list1.size() != 0) {
			for (int i = 0; i < list1.size(); i++) {
				// System.out.println("|"+ "THE BOOK NUMBER ("+(i+1)+") TYPE IS ["+list1.get(i).getType()+ "]"+"|");
				System.out.println("|" + "THE BOOK NUMBER (" + (i + 1) + ")  NAME  IS [" + list1.get(i).getBname()+"]" +   "|");
				System.out.println("|" + "THE BOOK NUMBER (" + (i + 1) + ")  ID    IS [" + list1.get(i).getBid()+"]"+      "|");
				System.out.println("|" + "THE BOOK NUMBER (" + (i + 1) + ") AUTHOR IS [" + list1.get(i).getBauthor()+"]" + "|");
				System.out.println("|" + "THE BOOK NUMBER (" + (i + 1) + ") STATE  IS [" + list1.get(i).isBavBorrows()+"]"+"|");
				System.out.println("|" + "THE BOOK NUMBER (" + (i + 1) + ") COPYS  IS [" + list1.get(i).getBumofcopy()+"]"+"|");
				System.out.println("#*********************************#");
			}
		} else {
			System.out.println("Sorry,THIS ARRAY IS EMPATY !");
		}

	}
}