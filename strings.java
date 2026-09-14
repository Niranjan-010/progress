// import java.util.*;

// public class strings {
//    public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      int size = sc.nextInt();
//      String array[] = new String[size];
//      int totLength = 0;


//      for(int i=0; i<size; i++) {
//        array[i] = sc.next();
//        totLength += array[i].length();
//      }


//      System.out.println(totLength);
//    }
// }

// import java.util.*;


// public class Strings {
//    public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      String str = sc.next();
//      String result = "";


//      for(int i=0; i<str.length(); i++) {
//        if(str.charAt(i) == 'e') {
//          result += 'i';
//        } else {
//          result += str.charAt(i);
//        }
//      }


//      System.out.println(result);
//    }
// // }
// import java.util.*;


// public class Strings {
//    public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      String email = sc.next();
//      String userName = "";


//      for(int i=0; i<email.length(); i++) {
//        if(email.charAt(i) == '@') {
//         break;
//        } else {
//          userName += email.charAt(i);
//        }
//      }


//      System.out.println(userName);
//    }
// }


// ParseInt Method of Integer class
// public class Strings {
//    public static void main(String args[]) {
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);
      
      
//    }
// }

// ToString Method of String class
// public class Strings {
//    public static void main(String args[]) {
//       int number = 123;
//       String str = Integer.toString(number);
//       System.out.println(str.length());
      
      
//    }
// }
// import java.util.*;

// class Strings {
//     public static void main(String[] args) {

//         StringBuilder sb = new StringBuilder("iranjan");

//         System.out.println(sb);

//         // append
//         sb.append('N');
//         System.out.println(sb);

//         // insert
//         sb.insert(0, 'n');
//         System.out.println(sb);

//         // delete
//         sb.delete(0, 2);
//         System.out.println(sb);

//         // set character
//         sb.setCharAt(0, 'a');
//         System.out.println(sb);

//         // replace
//         sb.delete(0, 7);
//         sb.insert(0, 'a');
//         sb.insert(1, 'a');
//         sb.insert(2, 'y');
//         sb.insert(3, 'u');
//         sb.insert(4, 's');
//         sb.insert(5, 'a');

//         System.out.println(sb);
//     }
// }
