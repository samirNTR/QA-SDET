package stringTutorials;

public class SubString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String mainString="I love jaaava";
		
		String subString= mainString.substring(2,4);
		
		System.out.println(subString);
		
		boolean stringCheck=mainString.contains(subString);
		
		if(stringCheck)
		{
			
			System.out.println("Part of substring");
		}
		
		else
		{
			System.out.println("Not asubstring");
			
		}
	}

}
