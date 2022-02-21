class DifferenceOfSquares{
    int sum=0;
    int temp=0;
    int temp1=0;
   int calculateDifference(int n){
     for(int i=0;i<=n;i++){
      temp= temp+i*i;
      temp1=temp1+i;        
    }
    sum=temp-temp1; 
   return sum;
   }
}
class DiffOfNum{
    public static void main(String [] args){
       DifferenceOfSquares num = new DifferenceOfSquares();
       int a= num.calculateDifference(5);
       System.out.println("result: "+a);
    }
}
