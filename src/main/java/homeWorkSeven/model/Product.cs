using (homeWorkSeven.model);

public abstract class Product {
    protected string name;
    public Product(){

    }

    @Override
    public string toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }
}
