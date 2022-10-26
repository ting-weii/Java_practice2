package Java_practice2;
//109360127_電子三甲_許廷維
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page19
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問你是男生嗎?");
		System.out.println("請輸入Y或N");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		char ch1 = str1.charAt(0);
		
		if(ch1 == 'Y' || ch1 == 'y')
		{
			System.out.println("你是男生啊!");
		}
		else if(ch1 == 'N' || ch1 == 'n')
		{
			System.out.println("你是女生啊!");
		}
		else
		{
			System.out.println("請輸入Y或N");
		}
	}
}
