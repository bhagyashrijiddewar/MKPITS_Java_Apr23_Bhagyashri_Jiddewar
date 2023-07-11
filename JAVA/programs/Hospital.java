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
   List<Staff> staff;
   List<Fees> fees; 
}
class Fees{
	int FirstVisitFees;
	int SecondVisitFees;
	int VisitFees;
	double GST;
}
class Staff{
	StaffType staffType;
	String Gender;
    int Age;		
}
class Doctors extends Staff{
   String DoctorName;
   Department deparment;
   DoctorDesignation doctorDesignation; //intern,trainee,surgan,Specialist
}
class Cardiology extends Department{
	List<FirstVisitFees> firstVisitFees;
	
}
class Services extends Hospital{
   List<Package> packages;
   String Ambulance;
}
class Pataint extends Hospital{
 String pataientName;
 String Gender;
 int Age;
 DeseaseType deseaseType;//heart,lungs,brain
}


