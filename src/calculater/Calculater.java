/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculater;
import java.util.Scanner;

/**
 *
 * @author STUDENTS
 */
public class Calculater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("enter the two number");
         Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("1.add,2sup,3.mul,4.div");
      System.out.println("enter the option");
      int r=sc.nextInt();
      Calculater obj= new Calculater();
      switch(r){
          
          case 1: obj.sum(a,b);
                  break;  
          case 2: obj.sup(a, b);
                  break;
          case 3: obj.mul(a,b);
                  break;
          case 4: obj.div(a, b);
                  break;      
      }
        // TODO code application logic here
    }
    void sum(int a,int b){
    int s=0;
    s=a+b;
    System.out.println("sum="+s);
   }
    
            
    
    void sup(int a,int b){
    int s=0;
    s=a-b;
    System.out.println("sup="+s);
   }
    
     void mul(int a,int b){
    int s=0;
    s=a*b;
    System.out.println("prod="+s);
   }
    void div(int a,int b){
    int s=0;
    s=a/b;
    System.out.println("divi="+s);
   }
}

   