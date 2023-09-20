package JavaNewAdditionalConceptInInterface.DataDisplay;

public interface DataDisplayInterface {

    default void display(){
        System.out.println("red");
    }
}
