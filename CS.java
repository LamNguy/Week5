public class CS extends  Orange {
    public CS( String origin     , String date , double price ,  double quantity)
    {
        super(origin ,date,price,quantity) ;
        this.ID = "CS";
    }
    public  void  show ()
    {
            super.show();
           // System.out.printf( this.DateOfImport + "\n" +this.Origin +  "\n" + this.Price +"\n" + this.quantity  );
    }
}
