package FinalClass;
//--------------java: cannot inherit from final FinalClass.FinalClass----------------
public class Main extends FinalClass {
    @Override
    public void finalMethod(){
        int number=30;
        number=number+50;
        System.out.println(number);
    }
    public static void main(String[] args){
        FinalMethod.Main main=new FinalMethod.Main();
        main.finalMethod();
    }
}
