package com.xust.qcode.util;

import java.io.File;
import java.util.Scanner;


/**
 * @author: yang
 * 
 */

public class Run {
	
	
	//二维码存储文件夹
	private static final String filePath = "D:/QrCode/";		
	
	//服务器地址
	private static final String URL = "http://139.129.93.141:8080/AndroidProduct/findProduct?mid=";
	
	
	 
    public static void main(String[] args) {  
    	Scanner sc = new Scanner(System.in);
    	System.out.println("请输入需要生成的产品ID:");
    	String ID = sc.next();
    	
    	//如果文件夹不存在则创建文件夹
    	File file = new File(filePath);
    	if(!file.exists()){
				file.mkdir();
    	}
    	
    	//二维码生成存储地址
        String imgPath = filePath+ID+".jpg";  
        String encoderContent = URL+ID;
        QRCode.encoderQRCode(encoderContent, imgPath, "png");    
        System.out.println("生成产品二维码成功!!!请到"+imgPath+"下查看二维码");  
    }  

}

