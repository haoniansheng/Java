package calendar;
import static java.lang.System.out;
import java.util.*;
import java.text.*;
public class calendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//默认是当前日期
		out.println("输入时间");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		if(scan1.hasNextInt()&&scan.hasNextInt()){  //数字检查
			int month=scan.nextInt();
			int year=scan1.nextInt();
			if(month>=1&&month<=12&&year>1970&&year<2200){  //检查
				c.set(Calendar.YEAR,year);//设置
				c.set(Calendar.MONTH,month-1);//设置月
				c.set(Calendar.DATE,1);//设置日为1
				//int dateNow = c.get(Calendar.DATE);//获得月份当前日期
				//int monthNow=c.get(Calendar.MONTH);
				int weekNow=c.get(Calendar.DAY_OF_WEEK);//当月1日的星期
				
				Calendar c1=Calendar.getInstance();
				c1=c;
				c1.set(Calendar.MONTH,month);//获得下一个月一日
				c1.add(Calendar.DATE, -1); //上月最大天数
				int dateMax=c1.get(Calendar.DATE);//当月最大日期
				int weekNow2=weekNow;
				String str=year+" 年 "+month+" 月 \n";
				str+="周日 周一 周二 周三 周四 周五 周六 \n|";
				while(weekNow2>1){
						weekNow2--;
						str+="**|";	
					}
				for(int i=1;i<=dateMax;i++){
					
					if(weekNow!=1&&weekNow%7==1){
						str+="\n";
					} 
					weekNow++;	
					if(i>=10){
						str+="|"+i;
					}else if(i!=1){
						str+="| "+i;
					}else {
						str+=" 1";
					}
				}
				out.println(str);

			}else{
				out.println("Error");
			}
		}else{
			out.println("Error");
		}
		scan1.close();
		scan.close();
	}
}
