import static java.lang.System.out;
 
public class Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		String str="";
		while (number<=100) {
			if (number%7==0&&number%3==0) {
				str+=number+",";
			}
			number++;
		}
		str=str.substring(0, str.length()-1); 
		out.print(str);
	}

}
