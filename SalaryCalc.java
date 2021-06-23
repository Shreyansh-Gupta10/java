 

public class SalaryCalc {
    int basic_sal;
    double HRA;
    double DA;
    double TA;
    double MA;
    double gross_sal;

    public void calc(int b, double hra, double da, double ta, double ma){
        basic_sal = b;
        HRA =  hra;
        DA =  da;
        TA = ta;
        MA = ma;
        gross_sal = b + hra + da + ta + ma;
    }
    void printsal(){
        System.out.println("Enter basic salary:"+basic_sal);
        System.out.println("Enter HRA: "+HRA);
        System.out.println("Enter DA: "+DA);
        System.out.println("Enter TA: "+TA);
        System.out.println("Enter MA: "+MA);
        System.out.println("Gross salary is: "+gross_sal);
    }
    
        
   

    public static void main(String[] args) {

        SalaryCalc shreyansh = new SalaryCalc();
        shreyansh.calc(6000, 0.3*6000, 0.2*6000, 0.1*6000, 0.15*6000);
        shreyansh.printsal();




    }
    
}
