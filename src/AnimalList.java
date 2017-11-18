import java.util.ArrayList;
import java.util.Arrays;

public class AnimalList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalList lst=new AnimalList();
		String[] strArr= {"cow", "dog","cat","tabby cat", "lynx cat"};
		String[] catsArr=lst.catty(strArr);
		System.out.println("List with cats:"+Arrays.deepToString(catsArr));
	}
	public String[] catty(String[] animals) { 

	    ArrayList<String> animalsList = new ArrayList<String>();
	    for (int i=0; i<animals.length; i++)
	    {
	       animalsList.add(animals[i]);
	    }
	    
	    ArrayList<String> catsList = cattyB(animalsList);
	    
	    String cats[] = new String[catsList.size()];
	    for (int i=0; i<catsList.size(); i++)
	    {
	       cats[i]=catsList.get(i);
	    }

	    return cats;
	}

	public ArrayList<String> cattyB(ArrayList<String> animalsList) 
	{    
		ArrayList<String> catList=new ArrayList<String>();
		for(int i=0;i<animalsList.size();i++) {
			if(animalsList.get(i).contains("cat")) {
			catList.add(animalsList.get(i));			}
		}
		return catList;
	}

}
