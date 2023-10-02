public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        updateTyre();
    }
}
