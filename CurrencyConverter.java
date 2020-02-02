public class CurrencyConverter{

     public static void main(String []args){
        
        Double CAD;      
        Double USD;
        Double EURO;
        CAD=400.01;
        
        USD=CAD*0.76;
        
        EURO=CAD*0.68;
        
        System.out.println ("If we have:" + CAD + "Canadien $ then we have:"+ USD + "USA dollars and If converted to Euros we get:" + EURO +"Euros");
     }
}