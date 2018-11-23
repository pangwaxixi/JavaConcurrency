package com.java.v3_1;



public class NoVisibility3 {
	//变量不能声明为synchronized类型
	 private static boolean ready;
	 private static int number;
	 public static synchronized void set(){
		 ready = true;
		 number = 43;
	 }
	 private static class ReaderThread extends Thread {
			public void run(){
				while(ready){
					Thread.yield();
					System.out.println(number);
				}
			}
			
		}
	 public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//
//			set();
			new ReaderThread().start();
//			 Thread.sleep(10*1000);
//			number = 42;
//			ready = true;
			set();
			 System.out.println(number + "___" + ready);
			System.out.println("main线程要退出了。。。");

			
		}
}
