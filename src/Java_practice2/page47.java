package Java_practice2;
//109360127_電子三甲_許廷維

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class page47 {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入5個人的分數");
		Integer test[] = new Integer[5];
		
		for(int i=0;i<test.length;i++)
		{
			String str1 = br1.readLine();
			test[i] = Integer.parseInt(str1);
		}
		
		Arrays.sort(test, Collections.reverseOrder());
		
		for(int i=0;i<test.length;i++)
		{
			System.out.println("第" + (i+1) + "名的分數是" + test[i]);
		}
	}
}
A