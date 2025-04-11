public class zXq29MainSortz{

public static void runIt(double[] LOLz)
{
    for(int a=0;a<LOLz.length;a++)
{
    for(int b=0;b<LOLz.length-1;b++)
{
if(LOLz[b]<LOLz[b+1]) // BUG: should be > for ascending
{
double tmp=LOLz[b];
LOLz[b]=LOLz[b+1];
LOLz[b+1]=tmp;
}
}
}
System.out.println("sorted??");
for(int x=0;x<=LOLz.length;x++) // BUG: should be x<LOLz.length
System.out.print(LOLz[x]+" "); // BUG: may throw ArrayIndexOutOfBoundsException
}

public static void main(String ARGz[]){
double[] numz={5.5, 1.1, 4.4, 3.3};
runIt(numz);
}
}
