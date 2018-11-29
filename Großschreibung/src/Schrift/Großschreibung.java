package Schrift;

public class Groﬂschreibung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitte zeichen kette eingeben");
		
		String g =System.console().readLine();
		for(char c : g.toCharArray()){  
            if(Character.isLowerCase(c)){
            	System.out.print(Character.toUpperCase(c));
            } else {
            	System.out.print(c);
            }  
        }
	}
}
