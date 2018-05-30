package ch03;

import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date =new Date();
		int h= date.getHours();
		
		System.out.println(date+"\n"+h);
	}

}
