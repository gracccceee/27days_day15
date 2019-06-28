package day15_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratorDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("蜡笔小新");
		c.add("美芽");
		c.add("小葵");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
	}
}
