  class Fruit {

    protected   double Price ;
    protected   double quantity ;
    protected   String  Origin ;
    protected  String   DateOfImport ;
    protected  String taste ;
    protected  String color ;

    public Fruit()
    {
        Price = 0 ;
        quantity = 0 ;
        Origin  = "@111" ;
        DateOfImport = "122" ;

    }

    public Fruit ( String _origin , String _Date ,double  _price , double _quantity )
    {
        DateOfImport = _Date ;
        Origin = _origin ;
        quantity = _quantity  ;
        Price = _price ;


    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public void setDateOfImport(String dateOfImport) {
        DateOfImport = dateOfImport;
    }

    public double getPrice() {
        return Price;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getDateOfImport() {
        return DateOfImport;
    }

    public double getQuantity() {
        return quantity;
    }
    public   void show ( ){

        System.out.print(taste + '\n' + color + '\n');
    }
}
