package com.java.v3_1;
/**
 * 加入
 * 2018-11-22
 * @author Zhangqianzhen
 *
 */
public class CopyOfNoVisibility2 {
	private volatile static boolean ready;
	private volatile static int number;
//	private static synchronized void set(){
//		ready = true;
//		number = 42;
//	}
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
//		set();
		new ReaderThread().start();
//		 Thread.sleep(10*1000);
		number = 42;
		ready = true;
		 System.out.println(number + "___" + ready);
		System.out.println("main线程要退出了。。。");

		
	}

}
