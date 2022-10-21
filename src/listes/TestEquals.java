package listes;

import java.util.ArrayList;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Ville v1 = new Ville("Nice",343000);
		Ville v2 = new Ville("Nice",34300);
		
		System.out.println(v1.equals(v2)) ;
		System.out.println(v1==v2) ;
	}

}
