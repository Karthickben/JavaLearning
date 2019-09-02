package StringTutorial;

import java.io.UnsupportedEncodingException;

public class Practice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//SCP and Heap
		  String S1 = new String("INDIA"); S1.concat("IS MY COUNTRY"); String
		 S2=S1.concat(" IS MY COUNTRY");
		 
		  System.out.println("S1: "+S1); System.out.println("S2: "+S2);
		  
		  StringBuilder SB1= new StringBuilder("INDIA"); SB1.append(" IS MY COUNTRY");
		 
		 StringBuilder SB2= new StringBuilder("INDIA"); SB2.append(" IS MY COUNTRY");
		 
		 System.out.println("SB1:"+SB1);
		 
		 System.out.println(S2.equals(SB1.toString()));
		 System.out.println("VALIDATION: "+SB1.equals(SB2));
		 System.out.println(SB1==SB2);
		 
		 String S3="INDIA IS MY COUNTRY"; String S4="INDIA IS"+" MY COUNTRY"; String
		 S5="INDIA IS"; String S6=S5+" MY COUNTRY"; System.out.println(S4);
		 System.out.println(S2==S3); System.out.println(S4==S3);
		 System.out.println(S4.equals(S6)); System.out.println(S4==S6);
		 

		// Constructors
		String string1 = new String();
		System.out.println(string1.isEmpty());

		String string2 = new String("INFY");
		System.out.println(string2);

		char[] chh = { 'a', 'b', 'c' };
		String s1 = new String(chh);

		byte[] ch = { 97, 98, 99 };
		String s2 = new String(ch);
		System.out.println("\"CHAR \"+" + s1);
		System.out.println("\"BYTE \"+" + s2);

		StringBuilder sBuil = new StringBuilder("String Builder");
		StringBuffer sbuff = new StringBuffer("String Buffer");

		String s3 = new String(sBuil);
		System.out.println(s3);

		String s4 = new String(sbuff);
		System.out.println(s4);
		System.out.println("-------------------------------------------------");
		// METHODS,,,,,,,,,,,,,,,,

		String myName = "karthick";
		String myNickName = "Ben";

		// charAt
		System.out.println("Character at Index 2 is :" + myName.charAt(2));
		// indexOf
		System.out.println("Index of character 'r' :" + myName.indexOf('r'));

		System.out.println("Index of character 'r' :" + myName.indexOf('k'));

		System.out.println("Index of character 'r' :" + myName.lastIndexOf('k'));

		System.out.println("Index of character 'r' :" + myName.concat(myNickName));

		System.out.println("Conct using '+' operator :" + myName + myNickName);

		myName += myNickName;

		System.out.println("Concat using '+=' operator :" + myName);

		String emptyVariable = "";
		System.out.println("Is empty emptyVariable :" + (emptyVariable.isEmpty()));

		String sea = " Pacific Ocean  ";
		System.out.println("Sea :'" + sea + "'");
		System.out.println("Sea.trim() :'" + sea.trim() + "'");
		System.out.println("Replace Space using replace method :" + sea.replace(" ", ""));
		System.out.println("Replace character using replace method :" + sea.replace("n", "a"));
		System.out.println("Replace all method: " + sea.replaceAll("\\s", ""));
		String sea1 = "Pacific Ocean";

		System.out.println("Equals Method :" + sea.trim().equals(sea1));

		String lake = " DalLake";
		String lake1 = "DalLake";
		System.out.println("Compare To Method :" + lake.trim().compareTo(lake1));
		System.out.println("Compare To Method :" + lake.compareTo(lake1));
		System.out.println("Compare To Method :" + lake.compareToIgnoreCase(lake1));
		// (32-68)

		System.out.println("To Upper Case:" + sea.toUpperCase().trim());
		System.out.println("To Lower Case :" + sea.toLowerCase().trim());

		System.out.println(("Length of Name Karthick :") + "Karthick".length());

		System.out.println("----------------------------------------------------------------------");

		// --------------------------------------------------------------------------------------

	}

}
