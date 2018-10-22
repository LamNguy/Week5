public class CCP extends  Orange {


    public CCP( String origin     , String date , double price ,  double quantity)
    {
        super(origin ,date,price,quantity) ;
    }
    public  void  show ()
    {
        System.out.println("Infomation about Orange CCP ");
        super.show();
       // System.out.printf( this.DateOfImport + "\n" +this.Origin +  "\n" + this.Price +"\n" + this.quantity  );
    }
}
