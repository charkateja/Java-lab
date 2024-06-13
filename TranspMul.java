class Bicycle{
void displayFeatures(){
System.out.println("Features: pedals, Manual power");
}
}
 
class Motorbike extends Bicycle{
void displayFeatures(){
super.displayFeatures();
System.out.println("Added features by motorbike: Engine");
}
}
class ElectricBike extends Motorbike{
void displayFeatures(){
super.displayFeatures();
System.out.print("New features by ElectricBike: Electric motoar and battery");
}
}
class TranspMul{
public static void main(String args[]){
ElectricBike myEbike = new ElectricBike();
myEbike.displayFeatures();
}
}