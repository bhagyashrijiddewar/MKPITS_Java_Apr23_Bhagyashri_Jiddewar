package JavaNewAdditionalConceptInInterface.DataDisplay;

public interface DisplayInterface {
    default void display(){
        System.out.println("blue");
    }
}
