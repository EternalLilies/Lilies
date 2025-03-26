package homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StrMaxMult {
    static int n=4;
    public static void main(String[] args) throws FileNotFoundException{
        int[] strNumber=charToInt(readAllNumber());
        if(strNumber.length<n)
        throw new ArrayIndexOutOfBoundsException("The length of string is too short!");
        System.out.print(maxNumSum(strNumber,0));
    }

    private static char[] readAllNumber() throws FileNotFoundException{
        Scanner in=new Scanner(new File("C:\\code\\Lilies\\javaproject\\in.txt"));
        String strFinal="",strTemp="";
        while(in.hasNextLine())
        {
            strTemp=in.nextLine();
            strFinal+=strTemp.trim();
        }
        in.close();
        return strFinal.toCharArray();
    }

    private static int[] charToInt(char[] strChar){
        int[] strNumber=new int[strChar.length];
        for(int i=0;i<strChar.length;i++)
        strNumber[i]=strChar[i]-'0';
        return strNumber;
    }

    private static int maxNumSum(int[] strNumber,int flag){
        if(n+flag>strNumber.length)return 0;
        int mul=1,max=0;
        for(int i=flag;i<n+flag;i++)
        if(strNumber[i]>0)mul*=strNumber[i];
        else return maxNumSum(strNumber,i+1);
        max=mul;
        tag:for(int i=n+flag;i<strNumber.length;i++)
        {
            if(strNumber[i]>0)
            {
                mul*=strNumber[i];
                mul/=strNumber[i-n];
                max=(max<mul)?mul:max;
            }
            else
            {
                int tempMax=maxNumSum(strNumber,i+1);
                max=(max<tempMax)?tempMax:max;
                break tag;
            }
        }
        return max;
    }
}
