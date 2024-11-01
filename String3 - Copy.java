public class String3 {
 public static void main(String[] args) {
   String str1="m";
   String str2="a";
   String str3="ab";
   String str4="a";
   String str5="abc";
   var str6="adi65";
   System.out.println(str1.matches("\\W"));
   System.out.println(str5.matches("abc"));
    System.out.println(str1.matches("."));
    System.out.println(str2.matches("[abc]"));
    System.out.println(str3.matches("[abcd]"));
    System.out.println(str4.matches("[a-z][0-9]"));
    System.out.println(str6.matches("[a-z]+[0-9]+"));
    System.out.println(str6.matches("[a-z0-9]+"));
 }
}