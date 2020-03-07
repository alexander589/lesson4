package Phone;

public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year){
        super(year);
    }
    @Override
    public void call(int number){
        System.out.println("Вращайте ручку");
        System.out.println("ообщите номер абонента, сэр / мэм");
    }

    @Override
    public void ring(int number){
        System.out.println("Телфон звонит");
    }
}
