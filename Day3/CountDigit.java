public class CountDigit {
    public static void main(String[] args) {
        int n=5678,count=0;

        while(n!=0)
        {
        //    int rem= n%10;//8//7//6/5
           count++;//1//2//3//4
           n=n/10;//567//56//5/0
        }
        System.out.println(count);
        
        // for(int i=n;i>0;i=i/10)
        // {
        //     count++;
        // }
        // System.out.println(count);
    }
}