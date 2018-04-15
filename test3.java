/**
 * @author srb
 * 
 * test 容器--list:ArrayList(数组),LinkedList(链表),vector(向量)
 */

package tt;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class test3 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("aaa");
		list.add(new cat());
		list.add(new Date());
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		String str=(String)list.get(0);
		System.out.println(str);
		list.set(2, "srb");
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list.size());
		List list1=new LinkedList();
		for(int i=1;i<10;i++)
		{
			list1.add(i);
		}
		System.out.println(list1.size());
		System.out.println(list1.get(3));
		for(int i=1;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		List list2=new Vector();
		for(int i=0;i<15;i++)
		{
			list2.add(i);
		}
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
	}
		
}
class cat{
	
}
