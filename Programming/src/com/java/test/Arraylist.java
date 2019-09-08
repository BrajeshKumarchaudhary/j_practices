
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=10;
         ArrayList<Integer> list=new ArrayList<Integer>();// pass the size  for makign the capacity of arraylist
               for(int i=0;i<=10;i++)
               {
            	   list.add(i);
               }
               for(int i=0;i<list.size();i++)
               {
            	   System.out.println(""+list.get(i));
               }
	}

}
