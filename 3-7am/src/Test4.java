import static java.lang.System.out;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		for (int y=1;y<=20;y++) {//yellow
			for (int r=1;r<=20;r++) {//red
				if(y*8>r&&y*7<r&&y+r<=20){
					out.println("红色:"+r+"黄色"+y+"蓝色"+(20-r-y));
				}
			}
		}
	}
}
