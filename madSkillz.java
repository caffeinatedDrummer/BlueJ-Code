// an almost totally original program by Erin Fitzpatrick
// vertical print inspired by the IOCCC (international obfuscated C code contest) and the demoscene of the 1980's
import java.io.*;
import java.util.*;
public class madSkillz
{
     public static void main(String[] args)
     {
         Scanner kbReader = new Scanner(System.in);
         System.out.print("Give me a string of whatever: ");
         String silly = kbReader.nextLine();
         
         int x = silly.length(); //This and the FOR loop cause whatever you typed to be printed vertically
                 
         for(int i=0; i<x; i++) 
         {
         
             System.out.println(silly.charAt(i)); //Strings still use index 0!
             
         }
         
         
        }
}