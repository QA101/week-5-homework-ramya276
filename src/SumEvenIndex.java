//1. Return the sum of all the numbers at even positions in the array list.
import java.util.ArrayList;

public class SumEvenIndex {
		
	public static int sumEvenIndexes(int[] nums) { 
	
	ArrayList<Integer> numsList = new ArrayList<Integer>();

	    for (int i=0; i<nums.length; i++)
	    {
	    		numsList.add(nums[i]);
	    }
	    System.out.println(numsList);
		return sumEvenIndexesB(numsList);
	}

	public static int sumEvenIndexesB(ArrayList<Integer> numsList) 
	{
		int sum=0;
		
		for (int i=0;i<numsList.size();i++) {
			if (i%2 == 0)
			{
				int j=numsList.get(i);
			sum+=j;
			}
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] a= {1,2,3,4};

	int sum=sumEvenIndexes(a);
	System.out.println("Sum: "+sum);
	
		
	
	}

}
