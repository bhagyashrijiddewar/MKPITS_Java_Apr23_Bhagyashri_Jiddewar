class Drinks{
	String Taste; //Sugar,Sugar free
	String Color;
	string Consistancy;
}
class SoftDrinks extends Drinks {
	SoftDrinkType softDrinkType; //soda,normal
	SoftdrinkTempreture softdrinkTempreture; //normal,ice
}
class Juice extends SoftDrinks{
	String JuiceType; //fresh,preserve
    String Ingradients; // sugar, black salt, chat masala---
}
class MangoJuice extends Juice{
	MangoType mangoType; //Alfanso mango,Dashehri mango,Ratnagiri mango,kesar mango,----
	String DrinksFlavour;
	String Ingradients;
    String DrinksFlavour; 
}
class OrangeJuice extends Juice{
	OrangeType orangeType; //Nagpuri Orange,bloodorange,Common Orange,Acidless orange,----
	String DrinksFlavour;
	String Ingradients;
	String DrinksFlavour; 
}
class PinappleJuice extends Juice{
	PinappleType pinappleType; // Smooth Cayenne', 'Red Spanish', 'Queen', 'Abacaxi',----
	String DrinksFlavour;
	String Ingradients;
    String DrinksFlavour; 
}
class SweetlimeJuice extends Juice{
	    SweetlimeType sweetlimeType; // key lime,rangpur,Limequat
		String DrinksFlavour;
		String Ingradients;
	    String DrinksFlavour; 
}
class Tea extends SoftDrinks{
	 TeaType teatype; // Hot,cold,normal
	 List <TeaFlavour> teaFlavour; //green tea,black tea,normal tea
}
class TeaFlavour{
	
}
class Coffee extends SoftDrinks{
	
	
}

class HardDrinks extends Drinks{
	
}