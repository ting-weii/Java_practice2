package Java_practice2;
//109360127_�q�l�T��_�\�ʺ�
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page08 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J���:");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br1.readLine());
		
		if(num1 == 1)
		System.out.println("��J���O" +1);
		System.out.println("��ܪ��O" +1);
				
		System.out.print("�����B�z");
	}
}
