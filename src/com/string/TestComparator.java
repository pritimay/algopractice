package com.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String args[]) {
		TestComparator testComparator = new TestComparator();

		/*
		 * MyBean myBean1 = new MyBean(); myBean1.setTimeInInbox("123"); MyBean myBean2
		 * = new MyBean(); myBean2.setTimeInInbox("421"); MyBean myBean3 = new MyBean();
		 * myBean3.setTimeInInbox("123"); MyBean myBean4 = new MyBean();
		 * myBean4.setTimeInInbox(null); MyBean myBean5 = new MyBean();
		 * myBean5.setTimeInInbox("124"); MyBean myBean6 = new MyBean();
		 * 
		 * List<MyBean> myBeanList = new ArrayList<MyBean>(); myBeanList.add(myBean1);
		 * myBeanList.add(myBean2); myBeanList.add(myBean3); myBeanList.add(myBean4);
		 * myBeanList.add(myBean5); myBeanList.add(myBean6);
		 * 
		 * sortDescending(myBeanList); for (int i = 0; i < myBeanList.size(); i++) {
		 * System.out.println(myBeanList.get(i).getTimeInInbox()); }
		 */
	}

	private static void sortDescending(List<MyBean> myBeanList) {
		// TODO Auto-generated method stub

		Collections.sort(myBeanList, new Comparator<MyBean>() {
			@Override
			public int compare(MyBean o1, MyBean o2) {
				if (o1.getTimeInInbox() == null) {
					return (o2.getTimeInInbox() == null) ? 0 : -1;
				}
				if (o2.getTimeInInbox() == null) {
					return 1;
				}
				return o2.getTimeInInbox().compareTo(o1.getTimeInInbox());
			}

		});
	}

}
