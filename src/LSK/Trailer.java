package LSK;

class Trailer extends TransportationDevice implements Matricula {
	String mat;

	@Override
	public void NumMatricula(String matricula) {
		mat=matricula;
		
	} 
} 
