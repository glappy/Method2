package com.biz.method;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		addVar();
		addVar(intNum1);
		System.out.println("10:"+ intNum1);
		
		// ���� * �� : ������ ��ȭ��Ű�� �ʴ´�
		System.out.println("13:" +(intNum1 * 20));
		System.out.println("14:" + intNum1);

		// ���� *= �� : ������ ��ȭ ��Ų��.
		System.out.println("17:" +(intNum1 *= 20));
		System.out.println("18:" + intNum1);

		
	}
	
	public static void addVar() {
		int intNum1 = 200;
	}
	
	public static void addVar(int intNum1) {
		intNum1 = 300;
	}

}
