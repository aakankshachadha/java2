package class2;

public class complex {
	int real,imag;
	public complex(int a,int b) {
		real=a;
		imag=b;
	
	} 
	public complex() {
		real=0;
		imag=0;
	}
	void display() {
		System.out.println("result is "+real+" + "+imag+"i");
		}
	complex add(complex c) {
		complex d= new complex();
		d.real=this.real+c.real;
		d.imag=this.imag+c.imag;
		return d;
	}
	complex mult(complex c) {
		complex d=new complex();
		d.real=this.real*c.real;
		d.imag=this.imag*c.imag;
		return d;
}
}
