class Hospital{
   String HospitalName;
   List<Address> address;
   Double Area;
}

class Address{
   String Line1;
   String Line2;
   Long PinCode;
   String City;
   String State;
   String Country;
}

class Administration extends Hospital{
   
   
}
class Services extends Hospital{
   List<Package> packages;
   String Ambulance;
   

}
class Facility extends Hospital{

}
class Doctors extends Hospital{
   String DoctorName;
   List<Department> deparment;
   String Gender;
   int Age;
   List<DoctorDesignation> doctorDesignation ;
 
}

class DoctorDesignation{


}
class Pataint extends Hospital{
 
}
class CriticalCare extends Hospital{

}

