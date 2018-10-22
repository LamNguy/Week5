public class Apple extends  Fruit {

   public Apple( String _origin , String _Date ,double  _price , double _quantity){
       super(_origin, _Date,_price, _quantity);
       this.color = "Red";
       this.taste = "Ngot";
   }

    public  void  show ()
    {

        System.out.println("Infomation about Apple");
        super.show();
        System.out.printf( this.DateOfImport + "\n" +this.Origin +  "\n" + this.Price +"\n" + this.quantity  );
    }
}
