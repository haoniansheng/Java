import static java.lang.System.out;
 
public class Test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String str="";
		for (int number=0;number<=100;number++) {
			if (number%7==0&&number%3==0) {
				str+=number+",";
			}
		}
		str=str.substring(0, str.length()-1); 
		out.print(str);
	}
}
