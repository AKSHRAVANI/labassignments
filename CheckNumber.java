class CheckNumber{
boolean a;
int lastdigit;
int nextlastdigit;
 public static void main(String[] args){
     CheckNumber num=new CheckNumber();
     boolean c=num.checkNumber(4321);
     System.out.println("result: "+c);
   }
 boolean checkNumber(int number){
     while(number>0){
      lastdigit=number%10;
      number=number/10;
      nextlastdigit=number%10;
      if(nextlastdigit<=lastdigit){
        a=true;
        }
      else{
         a=false;
         break;
      }      
    }
     return a;
 }
}
