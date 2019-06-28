package day15_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		Student s1 = new Student("蜡笔小新",5);
		Student s2 = new Student("美芽",30);
		Student s3 = new Student("小葵",2);
		Student s4 = new Student();
		s4.setName("pika");
		s4.setAge(1);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(new Student("jenny",2));//匿名对象
		
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s.getName()+s.getAge());
		}
	}
}
