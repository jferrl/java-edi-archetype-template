package ule.edi.geometry;

/**
 * Servicio para construir objetos {@link Vec2f}
 * 
 * La aplicación de ejemplo hace uso de este servicio
 * siempre que necesita un vector. Si se cambia el
 * tipo de objeto creado aquí la aplicación estará
 * funcionando con otra implementación de la interfaz
 * {@link Vec2f}.
 * 
 * (Patrón Singleton)
 * 
 * @author profesor
 *
 */
public class Geometry {

	//	Esta es la forma de acceder a los servicios de Geometry
	public static Geometry getInstance() {
		
		return singleton;
	}
	
	//	Que consisten en 'crear objetos de tipo Vec2f'
	public Vec2f vectorAt(float u, float v) {
		
		return new ArrayVec2fImpl(u,v);
	}
	
	public Vec2f vectorAt(Vec2f uv) {
		
		return new ArrayVec2fImpl(uv);
	}
	
	
	//	No se permite hacer 'new Geometry' a los clientes
	Geometry() {
		
	}
	
	//	Y en cada ejecución hay una única instancia compartida de 'Geometry'
	private static final Geometry singleton = new Geometry();

}
