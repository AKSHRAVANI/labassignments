class PowerOfTwo{
  boolean a;
  public static void main(String[] args){
     PowerOfTwo num=new PowerOfTwo();
     boolean c=num.checkNumber(5);
     System.out.println("result: "+c);
  }
   boolean checkNumber(int n){
    if(n%2==0){
      a=true;
    }
   else{
    a=false;
   } 
  return a;
 }
}