package day15_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratorDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("����С��");
		c.add("��ѿ");
		c.add("С��");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
	}
}
