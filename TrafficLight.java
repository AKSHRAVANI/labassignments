import java.util.Scanner;
class TrafficLight{

public static void main(String[]args){
 System.out.println("Red");
 System.out.println("Yellow");
 System.out.println("Green");
 Scanner sc= new Scanner(System.in);
 String name=sc.next();
 if(name.equals("Red")){
    System.out.println("stop");
} 
 else if(name.equals("Green")){
     System.out.println("go");
}
 else{
    System.out.println("ready");
  }
}

}

