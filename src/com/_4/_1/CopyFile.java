package com._4._1;
import java.io.*;
import java.util.*;
public class CopyFile {
   public static void main(String args[]) {
     int i;     
     FileReader fin; 
     FileWriter fout;
     Scanner scan = new Scanner(System.in); 
     System.out.println("请输入需要复制的源文件名（带路径）：");
     String a = scan.next();
     System.out.println("请输入要复制到的目标文件名（带路径）：");
     String b = scan.next();
     scan.close();
     try {       
         fin = new FileReader(a);
         fout = new FileWriter(b); 
         System.out.println("开始复制文件...");
         while((i = fin.read())!= -1) fout.write(i);
         System.out.println("文件复制成功");
         fin.close();         
       } catch(FileNotFoundException e) {
           System.out.println("输入文件未找到！");          
       }catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("用法：CopyFile 源文件 目标文件");           
       }catch(Exception e){
       System.out.println("异常："+e);       
       }  finally{     
       System.out.println("-----程序结束");          }
    }
}

