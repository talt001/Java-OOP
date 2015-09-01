abstract class Prob04{
  public static void main(String[] args){
    Random generator = new Random(new Date().getTime());
    int randomNumber = (byte)generator.nextInt();

    Prob04 objRef = new Prob04MyClass(randomNumber);
    System.out.println(objRef);
    System.out.println(objRef.getData());
    System.out.println(randomNumber);
  }//end main

  //Declare the signature of an abstract class.
  public abstract int getData();

}//end class Prob04
//======================================================//