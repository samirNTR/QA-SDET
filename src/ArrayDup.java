import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayDup {

	public static void main(String[] args) {



		int arr[]= new int[] {33,44,55,33,33};


		Map<Integer, Integer>hm = new HashMap<>();

		for(int no:arr)
		{
			Integer count=hm.get(no);
			if(count== null)
			{
				hm.put(no,1);
			}
			else
			{
				//count= count+1;
				hm.put(no, hm.get(no)+1);
			}

		}

	Set<Map.Entry<Integer,Integer>> es= hm.entrySet();

	for(Map.Entry<Integer, Integer> es1:es)
	{

		//if(es1.getValue()>1)


			System.out.println(es1.getKey()+"--> "+ es1.getValue());
			//System.out.println(es1.getKey()+" ");
	}


	}
	}
