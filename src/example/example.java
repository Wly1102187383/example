package example;

import java.util.Scanner;

public class example {
	public static void main(String args[]){
		float length;
		float width;
		int number;
		int choice;
		float regularframe;
		float fancyframe;
		float cardboard;
		float crown;
		float color;
		float glass;
		float price;
		float area;
		float girth;
		
		color = 0.10f;
		regularframe = 0.15f;
		fancyframe = 0.25f;
		cardboard = 0.02f;
		crown = 0.35f;
		glass = 0.07f;
		price=0.0f;

		
		Scanner scan=new Scanner(System.in);
		System.out.println("�����볤�ȺͿ��");
		length = scan.nextFloat();
		width = scan.nextFloat();
		area = length * width;
		girth = (length+width)*2;
		System.out.println("��ѡ��������,choice=00Ϊ��ͨӲֽ�壬choice=01Ϊ��ͨ������choice=10Ϊ����Ӳֽ�壬choice=11Ϊ��������");
		choice = scan.nextInt();
		if(choice==00)
		{
			price=girth * regularframe + area * cardboard;
		}
		if(choice==01)
		{
			price=girth * regularframe + area * glass;
		}
		if(choice==10)
		{
			price=girth * fancyframe + area * cardboard;
		}
		if(choice==11)
		{
			price=girth * fancyframe + area * cardboard;
		}
		System.out.println("��ѡ����ɫ�������ɫ");
		price = price + girth * color;
		System.out.println("ѡ������ڵ�����");
		number = scan.nextInt();
		price = price + number * crown;
		System.out.println("�ɱ�:"+ price);
	}
}
