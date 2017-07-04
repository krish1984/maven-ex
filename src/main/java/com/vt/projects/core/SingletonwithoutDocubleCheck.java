package com.vt.projects.core;

public class SingletonwithoutDocubleCheck {

	public static void main(String[] args) {
		System.out.println("AAAAAAAAAAAAAAA");
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t3 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t4 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t5 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		
		Thread t6 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t7 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t8 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t9 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t10 = new Thread(new Runnable(){
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();

	}

}
