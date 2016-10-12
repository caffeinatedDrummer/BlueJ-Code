
public class arrayOfHope
{
   public static void main(String[] args)
   {
       char ch[] = new char[26];
       for (int i = 0; i < 26; i++)
           ch[i] = (char)(i+65);
       for (int i = 0; i < 26; i++)
       {
           System.out.print(ch[i]);
           if (i == 25)
           continue;
           System.out.print(", ");
        }
       
   }
}
