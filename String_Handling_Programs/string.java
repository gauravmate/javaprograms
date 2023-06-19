public class string {

    
        public static void main(String[] args) {
          // lenght
          String s1 = "hello world";
          int x = s1.length();
          System.out.println(x);
      
          // create a srting object by char array
          char arr[] = { 'A', 'B', 'C', 'D' };
          String s2 = new String(arr);
          System.out.println(s2);
      
          // create string by byte array
          byte arr1[] = { 97, 98, 99, 100 };
          String s3 = new String(arr1);
          System.out.println(s3);
      
          // tocharArray
          char arr2[] = s2.toCharArray();
          for (int i = 0; i < s2.length(); i++) {
            System.out.println(arr[i]);
          }
      
          // getbyte
          String s4 = "gaurav mate";
          byte[] arr3 = s4.getBytes();
          for (byte b : arr3) {
            System.out.println(b);
          }
      
          // indexof
          String s5 = "gaurav mate";
          int y = s5.indexOf('u');
          System.out.println(y);
          y = -1;
          while (true) {
            y = s5.indexOf('u', y + 1);
            System.out.println(y);
            if (y == -1) {
              break;
            }
          }
          // lastindexof
          y = s5.lastIndexOf('e');
          System.out.println(y);
      
          // Equals
          String s6 = new String("Gaurav");
          String s7 = new String("Gaurav");
          if (s6 == s7) {
            System.out.println("Equal");
          } else {
            System.out.println("not equal");
          }
          //concat
          String s8 = "Gaurav";
          String s9 = "Mate";
          String s10 = s8 + s9;
          System.out.println(s10);
      
          //replace
          String s11="Hello java";
          String s12=s11.replace('H','g');
          System.out.println(s12);
      
          //touppercase
          String s13="hello world";
          String s14=s13.toUpperCase();
          System.out.println(s14);
      
          //tolowercase
          String s15="GAURAV MATE";
          String s16=s15.toLowerCase();
          System.out.println(s16);
      
      
          //substring
          String s17="Hello World";
          String s18=s17.substring(2,7);
          System.out.println(s18);
      
      
      
         //trim
         String s19="Hello";
         String s20="Hello";
         if(s19.equals(s20.trim())){
          System.out.println("equal");
         }
         else{
          System.out.println("not equal");
         }
          }
      }
      
    

