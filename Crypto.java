public class Crypto
{
    public static String working;
    public static String encrypt(String toEnc)
    {
        working = toEnc.replace("v","ag ',r");
        working = working.replace("V","Ag ',r");
        working = working.replace("m","ssad");
        working = working.replace("M","Ssad");
        working = working.replace("g","jeb..w");
        working = working.replace("G","Jeb..w");
        working = working.replace("b","dug>?/");
        working = working.replace("B","Dug>?/");
        return working;
    }
    public static String decrypt(String toDec)
    {
        working = toDec.replace("ag ',r","v");
        working = working.replace("Ag ',r","V");
        working = working.replace("ssad","m");
        working = working.replace("Ssad","M");
        working = working.replace("jeb..w","g");
        working = working.replace("Jeb..w","G");
        working = working.replace("dug>?/","b");
        working = working.replace("Dug>?/","B");
        working = working.replace("ag ',r","v");
        working = working.replace("Ag ',r","V");
        working = working.replace("ssad","m");
        working = working.replace("Ssad","M");
        working = working.replace("jeb..w","g");
        working = working.replace("Jeb..w","G");
        working = working.replace("dug>?/","b");
        working = working.replace("Dug>?/","B");
        return working;
        //I do this twice over because some things get encrypted twice by accident so this reverses everything
        //(hopefully)
    }
}
//NOW WITH STATICS! NO MORE CREATING OBJECTS!!!
