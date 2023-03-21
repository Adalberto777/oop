package seminarFive;

public class Main {
    public static void main(String[] args) {
        Worker worker000 = WorkerBuilder.getInstance().setName("Ivan").setPhoneNumber("89177950566").setSalary(30000).build();
        Worker worker001 = WorkerBuilder.getInstance().setCabinet((short) 7).setName("Petr").setPhoneNumber("89177950566").build();
        System.out.println(worker000);
        System.out.println(worker001);
    }
}
