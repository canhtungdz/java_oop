package hus.oop.lab5.mycomplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(){}
    public MyComplex(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }
    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }

    public boolean isReal() {
        return imag == 0;
    }
    public boolean isImaginary() {
        return real == 0;
    }
    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }
    public boolean equals(MyComplex another) {
        return (real == another.real && imag == another.imag);
    }
    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }
    public double argument() {
        return Math.sqrt(this.real + this.imag);
    }
    public MyComplex add(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
    public MyComplex subtract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return  this;
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }
    public MyComplex multiply(MyComplex right) {
        real = real * right.real - imag * right.imag;
        imag = real * right.imag + imag * right.real;
        return this;
    }
    public MyComplex divide(MyComplex right) {
        real = (real*right.real + imag*right.imag)/(right.real*right.real + right.imag*right.imag);
        imag = -real*right.imag + imag*right.real;
        return this;
    }
    public MyComplex conjugate() {
        imag = -imag;
        return this;
    }







}
