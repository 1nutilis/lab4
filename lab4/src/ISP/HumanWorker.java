package ISP;

public class HumanWorker implements IWorker, IEater{

    public void work() {
        System.out.println("Работает");
    }


    public void eat() {
        System.out.println("Ест");
    }
}
