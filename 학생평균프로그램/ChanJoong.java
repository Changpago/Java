/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanjoong;

class Student {     

    private String name;      
    public int kor;
    public int eng ;
    public int math;
    
    Student(String name,int kor,int eng, int math){ //생성자

        this.name =name;
        this.kor =kor;
        this.eng =eng;
        this.math =math;
        
    
    }
    
    int avg(){
        
        int sum = kor + eng + math;
        int avg = sum/3;
        return avg;
        
    }

    void avg2(){
        
        int sum = kor + eng + math;
        int avg = sum/3;
        System.out.print(avg);
        
    }

    
    
 

}


