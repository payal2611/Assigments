package com.yash.string.problem ;


//WAP to demonstrate which is fast in processing StringBuilder or StringBuffer


public class Task5_StringBufferAndStringBuilder {

	public static void main(String[] args) {
		int N = 99999999;
		long t;

		{
			System.out.println("String Buffer timing..");
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}

		{
			System.out.println("String Builder timing..");
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
	}
}
