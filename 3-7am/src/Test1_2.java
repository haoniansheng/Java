import static java.lang.System.out;
import java.util.Scanner;
public class Test1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		out.println("Input 分数");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){

			int number1=scan.nextInt();
			if (100>=number1&&number1>85) {
				out.println("优");
			}else if(75>=number1&&number1>50){
				out.println("良");
			}else if(50>=number1&&number1>25){
				out.println("中");
			}else if(25>=number1&&number1>=0){
				out.println("差");
			}else{
				out.println("Error");
			}
		}else{
			out.println("Error");
			//mySquare.main(null);
		}
		scan.close();
	}

}
