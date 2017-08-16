package weekone;

import java.util.ArrayList;

public class CheckTest {

	public static void main(String[] args) {
		ArrayList<String> item = new ArrayList<String>();
		item.add("abitha");
		item.add("bharath");
		item.add("guna");
		item.add(2,"ezhil");
		item.add("abitha");
		item.add("anitha");
		item.add("guna");
		item.add("sujitha");
		System.out.println(item);
		for(int i=0;i<item.size();i++)
		{
			for(int j=i+1;j<item.size();j++)
			{
				if(item.get(i)==item.get(j))
				{
					System.out.println("Duplicate is removed");
					item.remove(j);
				}
				
			}
		}
		ArrayList<String> box=(ArrayList<String>)item.clone();
		System.out.println(box);
	}

}
