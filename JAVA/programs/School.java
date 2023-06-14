class School{
  List<room> rooms;
  Double Area;
  List<Address> address;
  String SchoolName;
  String SchoolRegistrationNumber;
  List<Playground> playground;
  List<Parking> parking;
}
class room{
	RoomType roomtype;
	Double length;
	Double bridth;
	Double height;
}
class Address{
	String line1;
    String line2;
	String line3;
	Long pinCode;
	String CityName;
	StateName stateName;
	CountryName countryName;
}

class Playground{
	Double Area;
	PlaygroundType playgroundType; //indoor,outdoor
	FloorType floorType; // soil suface,Cement,grass
	
}
class Parking{
	Double Area;
    ParkingType parkingType; //2-wheeler,4-wheeler
	FloorNumber floorNumber; // UpperGround,LowerGround,Basement
}
class staff extends School{
	StaffType stafftype; //teacher,principal,peon,Helper,caretaker,securityguard,Librarian
	String StaffId;
	String StaffName;
}
class Teacher extends staff{
	string Subject;
	Long Salary;
}
class Principal extends staff{
	string Subject;
	Long Salary;
}