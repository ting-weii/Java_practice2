package Java_practice2;
//109360127_電子三甲_許廷維
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page16
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數:");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		char ch1 = str1.charAt(0);
		
		switch(ch1)
		{
			case 'a':
			{
			System.out.println("輸入的是a");
			break;
			}
			case 'b':
			{
			System.out.println("輸入的是b");
			break;
			}
			default:
			{
			System.out.println("請輸入a或b");
			break;
			}
		}
	}
}
