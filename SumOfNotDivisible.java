class NumberNotDivisible{
  int sum=0;
  int numberNotDivisible(int a){
    for(int i=0;i<=a;i++){
       if(i%3==0||i%5==0){
           sum=sum+i;
     }
     continue;  
   }
   return sum;
 }
}
class SumOfNotDivisible{
    public static void main(String [] args){
       NumberNotDivisible num = new NumberNotDivisible();
       int n = num.numberNotDivisible(5);
       System.out.println("result: "+n);
}
}
