
/**
 * Write a description of class Tester here.
 * 
 * @author Devon
 * @version 0
 */
//chopping off some bits of celebrity names from approximately 33 centuries ago
public class nameThatCelebrity
{
   public static String s1 = "Allan Alda";
   public static String s2  = "John Wayne";
   public static String s3 = "Gregory Peck";
   public static void main(String args[])
   {
       System.out.println(s1.substring(2,s1.length()-3));
       System.out.println(s2.substring(2,s2.length()-3));
       System.out.println(s3.substring(2,s3.length()-3));
   }
}
