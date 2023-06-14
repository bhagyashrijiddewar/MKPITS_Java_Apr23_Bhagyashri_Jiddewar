class Laptop{
  String color;
  Double height;
  Double width;
  Double length;
  string OperatingSystem;//windows,mac,Linux,Android
  String processor; //intel,ryzen
}
class HP extends Laptop{
	Double weight;
	int price;
	Double WarrantyPeriod;
    Double garrantyPeriod;
	Long MemmoryStorage;
}
class Dell extends Laptop{
	Double weight;
	int price;
	Double WarrantyPeriod;
    Double garrantyPeriod;
	Long MemmoryStorage;
}
class Lenovo extends Laptop{
	Double weight;
	int price;
    Double WarrantyPeriod;
	Double garrantyPeriod;
    Long MemmoryStorage;
}