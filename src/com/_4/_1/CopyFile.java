package com._4._1;
import java.io.*;
import java.util.*;
public class CopyFile {
   public static void main(String args[]) {
     int i;     
     FileReader fin; 
     FileWriter fout;
     Scanner scan = new Scanner(System.in); 
     System.out.println("��������Ҫ���Ƶ�Դ�ļ�������·������");
     String a = scan.next();
     System.out.println("������Ҫ���Ƶ���Ŀ���ļ�������·������");
     String b = scan.next();
     scan.close();
     try {       
         fin = new FileReader(a);
         fout = new FileWriter(b); 
         System.out.println("��ʼ�����ļ�...");
         while((i = fin.read())!= -1) fout.write(i);
         System.out.println("�ļ����Ƴɹ�");
         fin.close();         
       } catch(FileNotFoundException e) {
           System.out.println("�����ļ�δ�ҵ���");          
       }catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("�÷���CopyFile Դ�ļ� Ŀ���ļ�");           
       }catch(Exception e){
       System.out.println("�쳣��"+e);       
       }  finally{     
       System.out.println("-----�������");          }
    }
}

