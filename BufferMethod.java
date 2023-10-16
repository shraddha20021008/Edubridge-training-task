package com.edu;

public class BufferMethod {

	public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("My name is riya");
        StringBuffer sb1=new StringBuffer("My name is riya"); 
        System.out.println(sb.append(" patil"));
        System.out.println(sb.insert(0,"red "));
        System.out.println(sb.replace(0, 3, "me "));
        System.out.println(sb.delete(1, 4));
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        sb.ensureCapacity(20)      ;
        System.out.println(sb.charAt(2));
        System.out.println(sb.length());
        System.out.println(sb.substring(0));
        System.out.println(sb.substring(0, 10));
        
        System.out.println(sb==sb1);
	}

}
