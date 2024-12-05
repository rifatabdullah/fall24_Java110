// 1
//class p1{
//    public static void main(String [] args){
//        for (int i = 18; i <=  63; i = i + 9 ){
//            System.out.print(i+" ");
//
//        }
//    }
//}

// 2

//class p2{
//    public static void main(String [] args){
//        for (int i = 18; i <= 63; i = i+9){
//            if ( i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//            else if(i % 2 != 0) {
//                System.out.print("-"+i+" ");
//            }
//        }
//    }
//}

// 3
//class p3{
//    public static void main(String [] args){
//        int sum = 0;
//        for ( int i = 0; i <= 600; i++){
//            if ( i % 7 == 0 && i % 9 == 0){
//                sum += i;
//            }
//            else{
//                sum += 0;
//            }
//        }
//        System.out.println(sum);
//    }
//}

// 4
//class p4{
//    public static void main(String [] args){
//        int sum = 0;
//        for (int i = 0; i <= 600; i++){
//            if ( i % 7 == 0 || i % 9 == 0 ){
//                sum += i;
//            }
//            else{
//                sum += 0;
//            }
//
//        }
//        System.out.println(sum);
//    }
//}

// 5
//class p5{
//    public static void main(String [] args){
//        int sum = 0;
//        for (int i = 0; i <= 600; i++){
//            if ( i % 7 == 0 || i % 9 == 0 ){
//                sum += i;
//            }
//            if (i % 7 == 0 && i % 9 == 0 ){
//                sum -= i;
//            }
//
//        }
//        System.out.println(sum);
//    }
//}

// 6
//class p6{
//    public static void main(String [] args){
//        int n = 20;
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            if ( i % 2 == 0) {
//                sum -= (i*i);
//            }
//            else if(i % 2 != 0) {
//                sum += (i*i);
//            }
//        }
//        System.out.println(sum);
//    }
//}

// 7
//class p7{
//    public static void main(String [] args){
//        int n = 6;
//        for (int i = 1; i <= n; i ++){
//            if ( n % i == 0){
//                System.out.println(i+" ");
//            }
//      }
//    }
//}

// 8
//class p8{
//    public static void main(String [] args){
//        int sum = 0;
//        int n = 5*2;
//        System.out.println("The odd numbers are: ");
//        for (int i = 0; i <= n; i++){
//           if (i % 2 != 0){
//               sum += i;
//               System.out.println(i);
//           }
//        }
//        System.out.println("TheSum of odd Natural Numbers up to 5 terms is: "+sum);
//    }
//}

// 9
//class p9{
//    public static void main(String [] args){
//        int sum = 0;
//
//        for ( int i = 1; i <= 10; i++){
//            sum += i;
//            System.out.println("Current Number: "+i+", Sum: "+sum);
//        }
//    }
//}

// 10
//class p10{
//    public static void main (String [] args){
//        int n =  40;
//        for ( int i = 1; i <= n; i++){
//            if ( i % 5 == 0 && i % 3 != 0 ){
//                System.out.println(i);
//            }
//        }
//    }
//}

// 11
//class p11{
//    public static void main (String [] args){
//        int count = 0;
//        int n = 5467;
//        for ( int i = n ; i > 0 ; i = i /10){ // This (i=i / 10) will make sure the time it runs equals to the total digits
//            count = count + 1;
//        }
//         System.out.println("Total digits = "+count);
//    }
//}
//
//// 12
//class p12{
//    public static  void main (String [] args){
//        int n = 32768;
//        System.out.println(12345 % 10000);
//
//    }
//}


// 15
/* A perfect number is defined as a positive integer
that is equal to the sum of its proper divisors,
excluding itself. For example, the number 6 is a
perfect number because its proper divisors are 1, 2,
and 3, and their sum is 1+2+3 = 6 1+2+3=6. Other
examples of perfect numbers include 28, 496, and 8128
 */
// class p15{
//     public static void main (String [] args){
//         int n = 6;
//         int x = 0;
//         for ( int i = 1; i <= n; i++ ){
//             if ( n % i == 0 ){
//                 x += i;
//             }
//         }
//         x = x - n;
//         if ( x == n){
//             System.out.println(n+" is a perfect number ");
//         }
//         else{
//             System.out.println(n+" is not a perfect number ");
//         }
//     }
// }
