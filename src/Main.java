//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class RectangleArea {
    double a,b,area;
    void getData()  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("this program will calculate the area of the rectangle");
        System.out.println("Enter the length of the side a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Enter the length of the side b:");
        b =  Double.parseDouble(br.readLine());

    }
    void computeField() { area = a * b;}
    void fieldDisplay(){
        System.out.println("the area of the rectangle with the side a = ");
        System.out.printf("%2.2f",a);
        System.out.println("and side b = ");
        System.out.printf("%2.2f",b);
        System.out.println("is =");
        System.out.printf("%2.2f.\n", area);
    }



}
class RectangleDemo {
    public static void main(String[] args) {
        RectangleArea ar = new RectangleArea();
        try {
            ar.getData();
        } catch (IOException e) {
            throw new RuntimeException (e);
        }
        ar.computeField();
        ar.fieldDisplay();
    }
}