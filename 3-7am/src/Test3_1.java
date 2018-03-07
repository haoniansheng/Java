import static java.lang.System.out;
import java.util.Scanner;
public class Test3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println("Input 数字 求各个数位的和");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
			
			int number1=scan.nextInt();
			String s = Integer.toString(number1);
			char[] arr=s.toCharArray();
			int sum=0;
			//for循环遍历二维数组。  
			for(int i = 0; i < arr.length; i++){  
				 sum+= Integer.parseInt(String.valueOf(arr[i]));
			}  
			out.println(sum);
		}else{
			out.println("Error");
		}
		scan.close();
	}

}
