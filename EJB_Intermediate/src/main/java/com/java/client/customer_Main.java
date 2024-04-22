package com.java.client;

import com.java.bin.customer;

public class customer_Main {

	public static void main(String[] args) {
customer c=new customer();

c.setCid(1);
c.setCbal(50000);
c.setCname("RAJ");


System.out.println("C id = "+c.getCid());
System.out.println("C Bal = "+c.getCbal());
System.out.println("C nAME = "+c.getCname());



	}

}
