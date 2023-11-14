import java.util.*;

import java.io.*;

public class b16953 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		/* 2�� ���ϰų� > ¦��
 		   1�� �ڿ� ���δ� > Ȧ�� */
		
		int cnt = 0;
		
		while(true) {
			cnt ++;			
			String temp = String.valueOf(b);
			
			if(a > b) { // error case 1 : B�� A ���� �۾��� ��
				System.out.println(-1);
				break;
			}
			if(temp.charAt(temp.length()-1) != '1' && b % 2 != 0) {
				//error case 2 : B�� Ȧ���ε� ���ڸ��� 1�� �ƴ� ��
				System.out.println(-1);
				break;
			}
			
			if(b % 2 == 0) {
				// ¦����� 2�� ������
				b /= 2;
			}
			else {
				b = Long.parseLong(temp.substring(0, temp.length() - 1));
			}
			
			if( a == b) {
				System.out.println(cnt + 1);
				break;
			}
		}		
	}
}
