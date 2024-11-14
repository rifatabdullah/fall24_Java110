// 1
// class p1{
//     public static void main(String [] args){
//         int a = 0;
//         int x = 100;
//         int y = 23;
//         int z = -4;
//         if ( x > y && x > z ){
//             System.out.println("largest number: "+x);
//         }
//         else if (y > x && y > z){
//             System.out.println("largest number: "+y);
//         }
//         else{
//             System.out.println("largest number: "+z);
//         }
//     }
// }

// 2
// class p2{
//     public static void main(String [] args){
//         int x = 56;
//         if ( x < 50 ){
//             System.out.println("Your grade is F");
//         }
//         else if ( x <= 56){
//             System.out.println("Your grade is D");
//         }
//         else if ( x <= 69){
//             System.out.println("Your grade is C");
//         }
//         else if (x <= 84){
//             System.out.println("Your grade is B");
//         }
//         else if ( x <= 89){
//             System.out.println("Your grade is A-");
//         }
//         else if ( x <= 100){
//             System.out.println("Your grade is A");
//         }
//     }
// }

//3
// class p3{
//     public static void main(String[] args){
//         int x = 105;
//         if (x % 5 == 0 && x % 7==0){
//             System.out.println("Divisible by Both");
//         }
//         else if (x % 5 != 0 && x % 7==0 ){
//             System.out.println("Invalid: Divisible by 7 Only");

//         }
//         else if (x % 5 == 0 && x % 7 !=0 ){
//             System.out.println("Invalid: Divisible by 5 Only");

//         }
//         else{
//             System.out.println("No");
//         }
     
//     }
// }


// // 4
// class p4{
//     public static void main(String [] args){
//         int x = 2001;
//         if ( x % 4 == 0){
//             System.out.println(x+" is a leap year");
//             if ( x % 100 ){

//             }

//         }
//         else {
//            if (x  % 100 == 0){
//             if ( x % 400 == 0){
//                 System.out.println(x+" is a leap year");
//             }
//             else{
//                 System.out.println(x+" is not a leap year");
//             }
//            }
//         }
//     }
// }

//4
// class p4{
//     public static void main(String [] args){
//         int x = 2020;
//         if (x % 4 == 0){
//             System.out.println(x+" is a leap year");
//         }
//         else if (x % 400 == 0 && x % 100 == 0 ){
//             System.out.println(x+" is a leap year");
//         }
//         else{
//             System.out.println(x+" is not a leap year");
//         }
//     }
// }

//5
//  class p5{
//     public static void main(String [] args){
//         int x = -2;
//         if ( x % 2)
//     }
//  }

// 10
// class p10{
//     public static void main(String [] args){
//         int a = 5;
//         int b = 2;
//         int c = 4;
//         if ( a != b && a != c && b != c){
//             System.out.println("This is a Scalene triangle");
//         }
//         else if ( a == b && a == c && b == c){
//             System.out.println("This is a Equilateral triangle");
//         }
//         else{
//             System.out.println("This is a Isosceles triangle");
//         }
//     }
// }

// 11
import java.util.Scanner;
class p11 {
   public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.println(" Enter the amount the customer need to pay(Taka) ");
       int a = sc.nextInt();
       System.out.println("Enter the amount, customer gave(Taka) ");
       int b = sc.nextInt();
       int c = b-a;
       if ( b > a ){
           System.out.println("The returned amount is "+c+ "taka.");
           int d,e,f,g,h,i,j = 0;
           d = c / 100; // how many 100 notes i'll need
           c = c % 100; // mod is used for the remaining amount
           e = c / 50;
           c = c % 50;
           f = c / 20;
           c = c % 20;
           g = c / 10;
           c = c % 10;
           h = c / 5;
           c = c % 5;
           i = c / 2;
           j = c % 2;
           System.out.println("100 taka note: "+d);
           System.out.println("50 taka note: "+e);
           System.out.println("20 taka note: "+f);
           System.out.println("10 taka note: "+g);
           System.out.println("5 taka coin: "+h);
           System.out.println("2 taka coin: "+i);
           System.out.println("1 taka coin: "+j);

       } else if ( b < a ) {
           System.out.println("Please pay"+(a-b)+" taka more.");

       }
       else {
           System.out.println("The returned amount is 0 taka.");
       }


   }
}