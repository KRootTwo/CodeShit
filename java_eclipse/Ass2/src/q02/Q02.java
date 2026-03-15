package q02;

class Complex {
    float real;
    float imag;
    void setData(float r, float i) {
        real = r;
        imag = i;
    }
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
    public Complex add(Complex c1, Complex c2) {
        Complex x = new Complex();
        x.real = c1.real + c2.real;
        x.imag = c1.imag + c2.imag;
        return x;
    }
}
class Q02 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();
        c1.setData(6, 7);
        c2.setData(6, 9);
        c3 = c3.add(c1, c2);
        c1.display();
        c2.display();
        c3.display();
    }
}