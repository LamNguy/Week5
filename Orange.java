public class Orange extends    Fruit {

        protected  String ID ;
        public Orange( String  origin , String date , double price , double quantity)
        {
            super(origin , date  , price , quantity );
            this.color = "Orange" ;
            this.taste  = "Chua";
        }
        public  void  show ()
        {

            System.out.println("Infomation about Orange");
            super.show();
            System.out.println(ID);
            System.out.printf( this.DateOfImport + "\n" +this.Origin +  "\n" + this.Price +"\n" + this.quantity  );
        }
}
