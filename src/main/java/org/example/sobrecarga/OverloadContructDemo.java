package org.example.sobrecarga;

public class OverloadContructDemo {
    public static void main(String[] args) {
        OverloadContruct oc1 = new OverloadContruct();
        OverloadContruct oc2 = new OverloadContruct(10);
        OverloadContruct oc3 = new OverloadContruct(3, 4);
        OverloadContruct oc4 = new OverloadContruct(oc2);

        System.out.println(oc1.x);
        System.out.println(oc2.x);
        System.out.println(oc3.x);
        System.out.println(oc4.x);
    }
}
