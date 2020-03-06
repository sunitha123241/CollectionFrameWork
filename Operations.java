package listcomp;
import java.util.ArrayList;
import java.util.Iterator;
public class Operations {
 static ArrayList a1 = new ArrayList(10);
 int fetchElements(int index)
 {
	
	 return (Integer) a1.get(index);
	 
 }
 void AddElement(int ele)
 {
	 a1.add(ele);
	 System.out.println("Element is successfully added");
	 Iterator i = a1.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }

 }
 void removeElement(int ele)
 {
	 a1.remove(ele);
 }
 void printElements()
 {
	 Iterator i = a1.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
 }
}
