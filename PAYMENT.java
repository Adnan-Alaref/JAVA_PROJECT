package packageproject;

public class PAYMENT {

	private String bookname;
	private int studentid;
	private long date;
	private int type;
	private int bid;
	
	
//	public String getStudentname() {
//		return studentname;
//	}
//	public void setStudentname(String studentname) {
//		this.studentname = studentname;
//	}
	public long getDate() {
		return date;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public int getStudentid() {
		return studentid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}	
}
