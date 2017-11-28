package cn.simo.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.Writer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Utils {
	/**
	 * 生成当前订单处于今日订单的位置
	 * @return
	 */
	public static String generateOrderNumber(){
		int num = 0;
		String result="";
		try{
			File file = new File("recode.txt");
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
			String nowDate = df.format(new Date());
			if(!file.exists()){
				file.createNewFile();
				PrintStream ps = new PrintStream(new FileOutputStream(file));
				ps.println(nowDate+"%"+num);
				ps.close();
			}
			else{
				BufferedReader reader = null;
				reader = new BufferedReader(new FileReader(file));
				String readString = reader.readLine();
				String strDate = readString.split("%")[0];
				String strNum = readString.split("%")[1];
				
				//相同的一天
				if(nowDate.equals(strDate)){
					num = Integer.parseInt(strNum)+1;
				}
				else{
					num = 0;
				}
				
				//开始写入
				PrintStream ps = new PrintStream(new FileOutputStream(file));
				ps.println(nowDate+"%"+num);
				
				ps.close();
				reader.close();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		if(num/10==0){
			result = "00" + num;
		}
		else if(num/100>0){
			result = String.valueOf(num) ;
		}
		else{
			result = "0"+num;
		}
		return result;
	}
	
	/**
	 * 生成订单编号
	 * @param ownerPhone
	 * @return
	 */
	public static String generateOrderId(String ownerPhone){
		Calendar now = Calendar.getInstance();  
        String str1 = (now.get(Calendar.YEAR)%100)+formNumber(now.get(Calendar.MONTH) + 1)+formNumber(now.get(Calendar.DAY_OF_MONTH));
        String str2 = ownerPhone.substring(ownerPhone.length()-4, ownerPhone.length());
        String str3 = generateOrderNumber();
		return (str1+str2+str3);
	}
	
	public static String formNumber(int num){
		if(num/10>0){
			return String.valueOf(num);
		}
		else{
			return "0"+num;
		}
	}
}
