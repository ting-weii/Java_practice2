package Java_practice2;
//109360127_�q�l�T��_�\�ʺ�
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page34
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�n���L�ĴX�����B�z�O?(1~10)");		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num1 = Integer.parseInt(str1);
		
		for(int i=1;i<=10;i++)
		{
			if(i == num1)
			{
				continue;
			}
			System.out.println("��" + i + "�����B�z");
		}
	}
}
