package com.biz.method;

public class Method02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		addVar();
		addVar(20,30);
		addVar(50,100);
		
		addVarReturn(50,20);
	
		System.out.println(addVarReturn(3,4));
		
		int intVas = addVarReturn(5,8);
		System.out.println(intVas);
		
		intVas = addVarReturn(100,200);
		intVas = addVarReturn(50,50);
		intVas = addVarReturn(90,30);
		intVas = addVarReturn(70,60);
		
		
	}
	
	// �Ű������� ���� ��������ü method
	public static void addVar() {
		int intNum1 = 20;
		int intNum2 = 30;
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);
	}

	// �Ű������� �ִ� ������ method
	public static void addVar(int intNum1, int intNum2) {
		int intSum = intNum1 + intNum2 ;
		System.out.println(intSum);
	}
	
	// ���� �����ϰ�, �� ����� �ݵ�� main����
	// �����ϴ� method ����
	// �� method�� ������ console�� ǥ���ϴ�
	// 		����� �����Ѵ�.
	public static int addVarReturn(int intNum1, int intNum2) {
		int intSum = intNum1 + intNum2;
		/*
		 * return ���� 
		 * method�� �ڵ� ������ ��� �����ų�
		 * 	�ߴ����� ���
		 * method�� ȣ��(���)�� ������ �޽�����
		 * �����ϴ� �뵵�� ����� �� �ִ�.
		 *  
		 */
		// return 0 ;
		return intSum ; 
		// �ΰ��� ������ �Ű����� ���� ���� ������
		// ������ ����� ��� intSum ������
		// return ���� �Բ� �ۼ��ϹǷ� �ؼ�
		// intSum�� �����Ǿ� �ִ� 
		// intNum1+intNum2�� �����
		// ȣ���� ������ �޽����� ���� �Ѵ�.
	}
	
	
}