package ule.edi.geometry;


public class ArrayVec2fImpl extends AbstractVec2Impl {

	private float[] vector;
	
	/**
	Constructores
￼	Se definirán al menos los siguientes constructores para las clases de implementación:
	(1) por defecto, que crea un vector en el origen (0.0f, 0.0f);
	(2) con componentes, que utiliza dos parámetros de tipo float como valores iniciales; 
	(3) con otro vector, que dado un objeto de tipo Vec2f crea un vector igual.
	 */

	public ArrayVec2fImpl() {
		vector = new float [2];
		this.vector[0]=0.0f;
		this.vector[1]=0.0f;
	}
	
	/**
	 * (2) con componentes, que utiliza dos parámetros de tipo float como valores iniciales;
	 * @param u
	 * @param v
	 */
	public ArrayVec2fImpl(float u, float v) {
		vector = new float [2];
		this.vector[0]=u;
		this.vector[1]=v;
	}
	
	public ArrayVec2fImpl(Vec2f uv) {
		vector = new float [2];
		this.vector[0]= uv.getCx(1);
		this.vector[1] = uv.getCx(2);
	}
	
	@Override
	public float getCx(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		try {
			
			return this.vector[n-1];
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new java.lang.IllegalArgumentException();
		}
		
	}

	@Override
	public void setCx(int n, float v) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		try {
			this.vector[n-1]=v;
		} catch (Exception e) {
			// TODO: handle exception
			throw new java.lang.IllegalArgumentException();
		}
		
	}

	

}
