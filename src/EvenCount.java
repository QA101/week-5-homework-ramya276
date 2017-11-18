import java.util.ArrayList;

public class EvenCount {
	public int evenCount(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    return evenCountB(numsList);
	}

	public int evenCountB(ArrayList<Integer> numsList) {     
		int count=0;
		for(int i:numsList) {
			if(i%2==0)
			{		
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenCount cnt=new EvenCount();
		int[] arr= {1,2,3,4,5,6,8,9,7,6,4};
		int count1=cnt.evenCount(arr);
		System.out.println("Count of even nos.:"+count1);
	}

}
