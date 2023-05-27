package javaAdvance;

public class SamePkgClass {
	
	public String msg;
	
	public void printMsg() {
		System.out.println(msg);
	}
	
//	private void printMsgPrivate() {
//		System.out.println(msg);
//	}
	
	void printMsgDefault() {
		System.out.println(msg);
	}
	
	protected void printMsgProtected() {
		System.out.println(msg);
	}

}
