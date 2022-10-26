package Java_practice2;
//109360127_電子三甲_許廷維
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page21
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要選哪條路線?");
		System.out.println("請輸入整數");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num1 = Integer.parseInt(str1);
		
		char ch1 = (num1 == 1)?'A':'B';
		System.out.println("選擇了" + ch1 + "路線");
	}
}
