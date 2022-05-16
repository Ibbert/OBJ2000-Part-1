package lecture04;


public class OverridingVariable{
    
   public static void main(String[] args){
      int aNumberOrig = 10;
      System.out.println("In main(), aNumber is " + aNumberOrig);
      firstMethod();
      System.out.println("Back in main(), aNumber is " + aNumberOrig);
      aNumberOrig = secondMethod(aNumberOrig);
      System.out.println("Back in main() again, aNumber is " + aNumberOrig);
   }
   
   public static void firstMethod(){
      int aNumber = 77;
      System.out.println("In firstMethod(), aNumber is "
         + aNumber);
   }
   
   public static int secondMethod(int aNumber){
      System.out.println("In secondMethod(), at first " +
         "aNumber is " + aNumber);
      aNumber = 862;
      System.out.println("In secondMethod(), after an assignment " +
         "aNumber is " + aNumber);
      return aNumber;
   }
}
