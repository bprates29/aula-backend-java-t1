package org.example.sobrecarga;

public class OverloadTest {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();

        ob.ovlDemo();
        ob.ovlDemo(2);
        var restI = ob.ovlDemo(2, 4);
        System.out.println("Int retornado: " + restI);

        var restD = ob.ovlDemo(2.0, 5.0);
        System.out.println("Double retornado: " + restD);
    }
}
