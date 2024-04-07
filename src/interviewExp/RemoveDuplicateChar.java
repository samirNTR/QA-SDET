package interviewExp;

public class RemoveDuplicateChar {   //Duplicate char remover

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder();
		
		String str="AAABCDEEFGGGIHKT";
		
		boolean[] seen= new boolean[256];  //boolean array
		
		
	for(int i=0; i<str.length(); i++) 
	{
		char currentChar=str.charAt(i);
		
		if(!seen[currentChar])
		{
			sb.append(currentChar);
		}
		seen[currentChar]=true;    //Update seen[65] to true.
	}

	System.out.println(sb.toString());
		}
		// TODO Auto-generated method stub

	}


