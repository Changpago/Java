/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanjoong;
import java.util.Scanner; // Scanner 클래스 불러오기
/**
 *
 * @author eol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String name;
        int kor,eng,math;
        
        Scanner sc = new Scanner(System.in) ;   // Scanner 객체 sc 만들기
        
        
        
         System.out.print("사용자이름을 불러주세요");
         name =sc.next();
         System.out.print("국어점수 불러 씹새야");
         kor =sc.nextInt();
         
         System.out.print("영어점수 불러 씹새야");
         eng =sc.nextInt();
         
         System.out.print("수학점수 불러 씹새야");
         math =sc.nextInt();
         
         
       Student min =new  Student(name,kor,eng,math);
     
 
         System.out.print(" 니평균은 ");
      min.avg2();
         
      
    }
    
}
