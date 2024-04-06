package pe.edu.upao.transaccionales.lab1.example1;

public class Main {
    public static void main(String[] args) {
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Click");
            }
        };
        Button button1 = new Button(listener);

        Button button2 = new Button(() -> System.out.println("Click"));
    }
}