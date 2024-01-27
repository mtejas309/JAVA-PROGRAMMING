
/*14. Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.Scanner;

class F{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR BASIC SALARY");
        int a=s.nextInt();
        int hra,da,total;
        if(a>10000){
             hra=(a*20)/100;
             da=(a*80)/100;
             total=hra+da+a;
            System.out.println(da);
        }
        if(a>20000){
             hra=(a*20)/100;
             da=(a*80)/100;
             total=hra+da+a;
            System.out.println(da);
        }
        if(a>30000){
             hra=(a*20)/100;
             da=(a*80)/100;
             total=hra+da+a;
            System.out.println(da);
        }
       
    }
}