package ch06;

import javax.swing.plaf.synth.SynthSplitPaneUI;

class BlockTest {
	static {	// Ŭ���� �ʱ�ȭ ��(JDBC Driver �ڵ� ����)
		System.out.println("static{ }");
	}
	
	{		//�ν��Ͻ� �ʱ�ȭ ��(��� ������ ������ ȣ���� ����)
		System.out.println("{ }");
		
		System.out.println("������ ȣ�� ������ ������ ���� �ڵ�");
	}
	
	public BlockTest() {
		System.out.println("������");
	}
	
	public BlockTest(String a) {
		System.out.println("�����ڵ�1");
		System.out.println("������2");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		
		BlockTest bt3 = new BlockTest();			//ù���� ������ ȣ��
		BlockTest bt4 = new BlockTest("Hello");		//�ι��� ������ ȣ��

	}
}

/*
 * ����
 * 0.Ŭ���� �ʱ�ȭ ��
 * 1.�ν��Ͻ� �ʱ�ȭ ��
 * 2.������ 
 */
