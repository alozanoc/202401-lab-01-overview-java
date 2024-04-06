package pe.edu.upao.transaccionales.lab1.example1;

public class Button {
    private OnClickListener onClickListener;

    Button(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    void click() {
        this.onClickListener.onClick();
    }
}
