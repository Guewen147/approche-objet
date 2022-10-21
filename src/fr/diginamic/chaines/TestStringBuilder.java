package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long debut= System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();
		
		for ( int i =0; i < 100000; i++ ) {
		builder.append("Chiffre : ").append(i).append("  -  ");
		}
		System.out.println(builder);
		
		long fin= System.currentTimeMillis();
		System.out.println("Temps écouléen millisecondes :"+ (fin-debut));
	
	
		long debut1= System.currentTimeMillis();
		
		String str = new String();
		
		for ( int i =0; i < 100000; i++ ) {
			System.out.println( "Chiffre : " + i + "  -  ");
		}
		System.out.println(str);
		
		long fin1= System.currentTimeMillis();
		System.out.println("Temps écouléen millisecondes :"+ (fin1-debut1));
	
	
	}

}
