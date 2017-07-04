package com.vt.projects.core;

public class Singleton {
	private static int i;
	private int c;
	private static Singleton s;
	public Singleton(){
		++i;
		c=i;
	}
	
	public static Singleton getInstance(){
		if(s==null){
			synchronized(Singleton.class){
				if(s==null){
					s=new Singleton();
				}
			}
		}
		
		return s;
	}

	@Override
	public String toString() {
		return "Singleton [c=" + c + "]";
	}

	
}
