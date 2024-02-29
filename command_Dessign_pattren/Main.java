public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Onlight on = new Onlight();
        light.turnOn();
        on.On();
        System.out.println(light.isOn());
        light.turnOff();
        on.On();
        System.out.println(light.isOn());
    }
}
