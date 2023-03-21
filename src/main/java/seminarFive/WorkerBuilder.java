package seminarFive;

public class WorkerBuilder {
    private static WorkerBuilder instance;
    Worker obj;
    private WorkerBuilder(){

    }

    public static WorkerBuilder getInstance(){
        if (instance == null)
            instance = new WorkerBuilder();
        instance.obj = new Worker();

        return instance;
    }

    public WorkerBuilder setName(String name){
        obj.setName(name);
        return this;
    }

    public WorkerBuilder setSalary(int salary){
        obj.setSalary(salary);
        return this;
    }

    public WorkerBuilder setVacation(boolean vacation){
        obj.setVacation(vacation);
        return this;
    }

    public WorkerBuilder setCabinet(short cabinet){
        obj.setCabinet(cabinet);
        return this;
    }

    public WorkerBuilder setPhoneNumber(String phoneNumber){
        obj.setPhoneNumber(phoneNumber);
        return this;
    }

    public Worker build() {
        return obj;
    }

    @Override
    public String toString() {
        return "WorkerBuilder{" +
                "obj=" + obj +
                '}';
    }
}
