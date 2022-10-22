package observer;

import java.util.Observable;
import java.util.Observer;

interface observer{
    void update(Observable o,Object arg);
}

class buyer implements observer{
    private String name;
    public buyer(String name){
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Float){
            System.out.println(this.name + "观察价格是" + ((Float) arg).floatValue());
        }
    }
}
public class Test extends Observable {
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public Test(float price){
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }

    public static void main(String[] args) {
        Test test = new Test(1000);
        buyer buyer0 = new buyer("A");
        buyer buyer1 = new buyer("B");
        buyer buyer2 = new buyer("C");

        test.addObserver((Observer) buyer0);
        test.addObserver((Observer) buyer1);
        test.addObserver((Observer) buyer2);

        System.out.println(test);
    }
}
