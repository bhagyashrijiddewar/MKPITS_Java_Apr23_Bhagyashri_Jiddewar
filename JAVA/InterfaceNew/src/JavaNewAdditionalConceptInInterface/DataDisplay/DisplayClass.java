package JavaNewAdditionalConceptInInterface.DataDisplay;

public class DisplayClass implements DisplayInterface,DataDisplayInterface{
    private int choice;
    public DisplayClass(int choice) {
        this.choice = choice;
    }
    @Override
    public void display() {
        switch(choice){
            case 1:
                DisplayInterface.super.display();
                break;
            case 2:
                DataDisplayInterface.super.display();
                break;
            default:
                System.out.println("Invalid choice enter.Please enter correct choice.");
        }
    }
}
