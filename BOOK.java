package packageproject;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class BOOK {
		private String Bname;
		private String Bauthor;
		private boolean Bavilable;
		private boolean Bavborrows;
		private int Bcountofbook=0;
		private int Bumofcopy=0;
		private int Type;
		private int Bid;
		private long BissueDate;

		public BOOK() 
		{
			String Bname = "";
			String Bauthor = "";
			boolean Bavilable = false;
			boolean Bavborrows = false;
			int Bcountofbook=0;
			int Bumofcopy = 0;
			int Bid = 0;
			int price=0;
		}
		
		public void setBname(String bname) {
			Bname = bname;
		}

		public String getBname() {
			return Bname;
		}

		public void setBauthor(String bauthor) {
			Bauthor = bauthor;
		}

		public String getBauthor() {
			return Bauthor;
		}

		public void setBavBorrows(boolean bavBorrows) {
			Bavborrows = bavBorrows;
		}
		
		public boolean isBavBorrows() {
			return Bavborrows;
		}
		
		public void setBumofcopy(int bcount) {
			Bumofcopy = bcount;
		}
		
		public void setType(int Type) {
			this.Type=Type;
		}
		
        public int  getType() {
			return Type;
		}
		public int getBumofcopy() {
			return Bumofcopy;
		}

		public void setBid(int bid) {
			Bid = bid;
		}
		
		public int getBid() {
			return Bid;
		}
		
		public long getBissueDate() {
			return BissueDate;
		}

		public void setBissueDate(long bissueDate) {
			BissueDate = bissueDate;
		}
	}
