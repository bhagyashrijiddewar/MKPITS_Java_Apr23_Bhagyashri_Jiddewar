package JavaNewAdditionalConceptInInterface.InBuildInterfaceAnonimousClass;

public class RunnableInterfaceAnonimousClass {
    public static void main(String[] args){
//        ---------------------(1st type)----------------------
//       new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        }).start();

//-----------------------(2nd type)----------------------------
      Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
      thread.start();
    }
}
