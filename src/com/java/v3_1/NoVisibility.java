package com.java.v3_1;
/**
 * 
 * 2018-11-22
 * @author Zhangqianzhen
 *
 */
public class NoVisibility {
	private static boolean ready;
	private static int number;
	private static class ReaderThread extends Thread {
		public void run(){
			while(!ready){
				Thread.yield();
				System.out.println(number);
			}
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//
		new ReaderThread().start();
		 Thread.sleep(10*1000);
		number = 42;
		ready = true;
		System.out.println("main线程要退出了。。。");

		
	}

}
