public class Rectangle{

     public static void main(String []args){
       int L;
       int L2;
       int W;
       int W2;
       int area;
       int perimeter;
       
       L = 10;
       L2=L;
       W=5;
       W2=W;
       area = L * W;
       perimeter = L + L2 + W + W2;
       System.out.println("If a rectangle has a length of:" + L + "cm with a width of:" + W + "cm. Then it will have an area of:" + area + "cm^2 and a perimeter of:" + perimeter + "cm.");
     }
}