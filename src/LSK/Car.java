package LSK;

class Car  implements Motor,Matricula{ 
String mat;
	@Override 
	public void startEngine() { 
	} 
	
	@Override 
	public void NumMatricula(String matricula){
		mat=matricula;
	}
	
	
} 