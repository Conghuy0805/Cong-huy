package ss7_abstractClass_interface.thuc_hanh.ClassMayTinh;

public class MayTinhVinacal500 implements MayTinhBoTuiInterface {
    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        if (b != 0) {
            return a / b;
        }

        throw new ArithmeticException("b phải khác 0");
    }
}
