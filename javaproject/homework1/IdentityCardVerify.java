package homework1;

import java.util.Arrays;

public class IdentityCardVerify{
    public static void main(String[] args){
        char[] id=args[0].toCharArray(),
        code={'1','0','X','9','8','7','6','5','4','3','2'};
        int sum=0;
        int[] num={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        outer:for(int i=0;i<18;i++)
        {
            if(id.length!=18)
            {
                System.out.println("Error!");
                break outer;
            }
            if(i<17)
            {
                if(id[i]<'0'||id[i]>'9')
                {
                    System.out.println("Error!");
                    break outer;
                }
                else sum+=(id[i]-'0')*num[i];
            }
            if(i==16)
            {
                int year=(id[6]-'0')*1000+(id[7]-'0')*100+(id[8]-'0')*10+(id[9]-'0');
                if(year>2025)
                {
                    System.out.println("Error!");
                    break outer;
                }
                int month=(id[10]-'0')*10+(id[11]-'0');
                if(month>12)
                {
                    System.out.println("Error!");
                    break outer;
                }
                int day=(id[12]-'0')*10+(id[13]-'0');
                if(!ismonthDay(year,month,day))
                {
                    System.out.println("Error!");
                    break outer;
                }
            }
            if(i==17)
            {
                sum%=11;
                if((code[sum]==id[17]))
                System.out.println("Correct!");
                else System.out.println("Error!");
            }
        }
    }

    private static boolean ismonthDay(int year,int month,int day){
        int[] month31={1,3,5,7,8,10,12},
        month30={4,6,9,11};
        if(Arrays.binarySearch(month31,month)>=0)
            if(day<=31)return true;
            else return false;
        else if(Arrays.binarySearch(month30,month)>=0)
            if(day<=30)return true;
            else return false;
        else if(day<28)
            return true;
        else if(day>29)
            return false;
        else if(isleapyear(year,day))
            return true;
            else return false;
    }

    private static boolean isleapyear(int year,int day){
        if((year%4==0&&year%100!=0)||year%400==0)
            if(day<=29)return true;
            else return false;
        else
            if(day<=28)return true;
            else return false;
    }
}
