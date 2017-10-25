package com.arthur.gao.javaagent_javassit;
/**
 * 需要被监控的类
 * @author gaopan
 *
 */
public class MethodCostTimeTest {
	
	 public static void main(String[] args) {
	        sayHello();
	        sayHello2("hello world2");
	    }

	    public static void sayHello() {
	        try {
	            Thread.sleep(2000);
	            System.out.println("hello world!!");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void sayHello2(String hello) {
	        try {
	            Thread.sleep(1000);
	            System.out.println(hello);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
