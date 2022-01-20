//Q1

public class Main {

    public static void main(String[] args) {
	int num1 = 100;
    int num2= 200;
    int num3= 300;
    int num4=400;
    int temp1;
    int temp2;
        System.out.println("Numbers before Swapping:" +num1+"\t"+num2+"\t"+num3+"\t"+num4 );
        temp1=num1;
        temp2=num2;
        num1=num4;
        num2=temp1;
        num4=num3;
        num3=temp2;

        System.out.println("Numbers after Swapping:" +num1+"\t"+num2+"\t"+num3+"\t"+num4 );


    }
}
//Output
Numbers before Swapping:100	200	300	400
Numbers after Swapping:400	100	200	300

//Q2
public class Main {

    public static void main(String[] args) {
	int num1 = 100;
    int num2= 200;
    int num3= 300;
    int num4=400;

        System.out.println("Numbers before Swapping:" +num1+"\t"+num2+"\t"+num3+"\t"+num4 );
        num1= num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        num2=num2+num3;
        num3=num2-num3;
        num2=num2-num3;
        num4=num4+num3;
        num3=num4-num3;
        num4=num4-num3;

        System.out.println("Numbers after Swapping:" +num1+"\t"+num2+"\t"+num3+"\t"+num4 );


    }
}
//0utput
Numbers before Swapping:100	200	300	400
Numbers after Swapping:200	300	400	100

//Q3

public class Main {

    public static void main(String[] args) {
	double gst=0.18;
    double amt=699.0;
    double x;

        x= amt*gst;
        double total = amt + x;

        System.out.println("Final plan cost" +total);




    }
}

//output
Final plan cost: 824.8199999999999

//Q4

public class Main {

    public static void main(String[] args) {
	int pno=2;
    double pcost= 399.0;
    double discount;
    double totalprice;

    discount= (2*pcost)*0.2;
    totalprice = (2*pcost)-discount;

    System.out.println("Discount on pizza:  "  +discount);
    System.out.println("Final price after discount: " +totalprice);




    }
}
//0utput
Discount on pizza:  159.60000000000002
Final price after discount: 638.4

//Q5

public class Main {

    public static void main(String[] args) {
	float salary =85000;
    double tax=0.2;
    double taxamnt;
    taxamnt = tax*salary;
    System.out.println("Tax amount :  "  +taxamnt);

    
    }
}

//output

Tax amount :  17000.0

//Q6

public class Main {

    public static void main(String[] args) {
	double p=500000;
    int t= 5;
    double r=0.068;
    double intrestamount;


        intrestamount = p*t*r;
        double finalamount = p + intrestamount;
    System.out.println("Intrest amount :  "  +intrestamount);
    System.out.println("Total amount :  " +finalamount);


    }
}
//output 
Intrest amount :  170000.0
Total amount :  670000.0

//Q7
public class Main {

    public static void main(String[] args) {
	double salary=85000;
    double grossamnt;
    double netamnt;

        double ta = 0.15 * salary;
        double da = 0.2 * salary;
        double hra = 0.18 * salary;
        double pf = 0.2 * salary;
        double tax = 0.25 * salary;
          grossamnt = salary+ta+da+hra;
          netamnt = grossamnt-(pf+tax);

    System.out.println("Gross amount :  "  +grossamnt);
    System.out.println("Net amount :  " +netamnt);


    }
}
//output
Gross amount :  130050.0
Net amount :  91800.0
