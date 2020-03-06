package listcomp;

import java.util.*;
import java.lang.*;

public class ListComOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   while(true)
	   {
	 System.out.println("enter your choice:1.Fetching\n 2.adding\n 3.removing\n 4.printing");
	   int choice=sc.nextInt();
	 Operations obj = new Operations();
	 switch(choice) {
	 case 1:
		 System.out.println("enter the position to fetch:");
		 int position=sc.nextInt();
		 int res=obj.fetchElements(position);
		 System.out.println(res);
		 break;
	 case 2:
		 System.out.println("Eneter an element to add into the arraylist: ");
		 int ele=sc.nextInt();
		 obj.AddElement(ele);
		 break;
	 case 3:
		 System.out.println("eneter the element to be removed: ");
		 int rmele=sc.nextInt();
		 obj.removeElement(rmele);
		 break;
	 case 4:
		 obj.printElements();
		 break;
	 case 5:
		 System.exit(0);
	 
		 
	 } 
	 }
		
	}

}
