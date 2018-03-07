import static java.lang.System.out;
import java.util.Scanner;
public class Test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println("Input 分数");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
			
			int number1=scan.nextInt();
			if(number1>100||number1<0){
				out.println("error");
				scan.close();
				return;
			}
			switch (number1/25) {
				case 4:
				case 3:
					out.println("优");
					break;
				case 2:
					out.println("良");
					break;
				case 1:
					out.println("中");
					break;
				case 0:
					out.println("差");
					break;
				default:
					out.println("error");
					break;
			}
		}else{
			out.println("Error");
			//mySquare.main(null);
		}
		scan.close();
	}

}
