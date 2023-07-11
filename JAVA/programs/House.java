/* House is a parant class*/

class House{
List<room> rooms;
Double area;
HouseType houseType;
}

/*Apartment is a child class of house class*/
class Apartment extends house{
String buildingNo;
String apartmentName;
String floorNo;

}
/*Bunglow is a child class of house class */
class Bunglow extends house{
String bunglowName;
String bunglowNo;
List<Address> address;

}
/*villa is a child class of house class */
class Villa extends house{
String villaName;
String villaNo;
List<Address> address;
}
/* */


