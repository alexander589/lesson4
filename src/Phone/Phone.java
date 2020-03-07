package Phone;

public class Phone extends AbstractPhone {

    public Phone(int year){
        super(year);
    }
    @Override
    public void call(int number){
        System.out.println("набираю номер" + number);
    }

    @Override
    public void ring(int number){
        System.out.println("Телфон звонит");
    }
}
