import java.util.Scanner;
class CubingNum{
int sum=0,temp;
int cubeOfnumber(int k){
while(k>0){
 temp=k%10;
 sum = sum+temp*temp*temp;
 k =k/10; 
 } 
return sum;  
}

}
class CubingOfNumber{
    public static void main(String[] args){
    Scanner num=new Scanner(System.in);
    System.out.println("enter a number: ");
    int a= num.nextInt();
    CubingNum c= new CubingNum();
    int b=c.cubeOfnumber(a);
    System.out.println("cubing of a number is "+b);
}

}
