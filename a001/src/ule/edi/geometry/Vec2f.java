package ule.edi.geometry;

import java.util.Objects;

/**
 * Representa un vector de dos componentes de tipo <code>float</code>.
 * 
 * Esta interfaz define un <emph>contrato</emph> entre las implementaciones de
 * vector y otras clases cliente que hagan uso de ellas, entre las que se
 * incluyen los test JUnit de evaluación en la plataforma Web-CAT.
 * 
 * 
 * Constructores
 * 
 * Se definirán al menos los siguientes constructores para las clases de
 * implementación: (1) por defecto, que crea un vector en el origen (0.0f,
 * 0.0f); (2) con componentes, que utiliza dos parámetros de tipo
 * <code>float</code> como valores iniciales; (3) con otro vector, que dado un
 * objeto de tipo <code>Vec2f</code> crea un vector igual.
 * 
 * 
 * Igualdad
 * 
 * El método {@link Object#equals(Object)} dirá que dos vectores (u1, v1) y
 * (u2, v2) son iguales si:
 * 
 * 	<code>|u1 - u2| < 1.0e-06</code> y <code>|v1 - v2| < 1.0e-06</code>.
 * 
 * El método admite un parámetro de tipo <code>Object</code>. Es habitual
 * comprobar en primer lugar si nos están pasando la misma referencia que
 * <code>this</code>, en cuyo caso son vectores iguales. Si no es la
 * misma referencia, se suele comprobar el tipo del objeto que hemos
 * recibido con <code>instanceof</code> y si fuera <code>Vec2f</code>, 
 * entonces hacer un cast y comprobar la expresión dada arriba, ya entre
 * dos vectores.
 * 
 * 
 * Hash code
 * 
 * Se implementará {@link Object#hashCode()}. Una forma de hacerlo es:
 * 
 *	<code>return Objects.hash(getCx(1), getCx(2));</code>
 * 
 * Ver http://docs.oracle.com/javase/7/docs/api/java/util/Objects.html#hash(java.lang.Object...) 
 * 
 * 
 * Representación como cadena
 * 
 * También se implementará {@link Object#toString()}, de forma que un vector
 * (u,v) será representado como
 * 
 * 	<code>"(" + String.format(Locale.US, "%+.6f", u) + ", " + String.format(Locale.US, "%+.6f", v) + ")"</code>.
 * 
 * Por ejemplo, un vector con componentes 0.1 y 0.2 será mostrado como
 * 
 * 	<code>(+0.100000, +0.200000)</code>
 * 
 * Este método es el que utiliza el IDE Eclipse para mostrar valores de objetos del
 * tipo <code>Vec2f</code> en sesiones de debug. Cuidado porque un lazo infinito en
 * nuestra implementación de {@link Object#toString()} puede colgar al propio IDE.
 * 
 * @author profesor
 */
public interface Vec2f {

	// Operaciones sobre el vector y cálculo de algunas de sus propiedades

	/**
	 * Desplaza este vector 'x = (u, v)' lo indicado por el parámetro 'dx = (du,
	 * dv)'.
	 * 
	 * El nuevo valor de este vector será 'x + dx = (u + du, v + dv)'.
	 * 
	 * @param dx
	 *            vector para desplazar este vector.
	 */
	void translate(Vec2f dx);

	/**
	 * Escala este vector 'x = (u, v)' lo indicado por 'fx'.
	 * 
	 * El nuevo valor será 'fx · x = (fx · u, fx · v)'.
	 * 
	 * @param fx
	 *            factor de escala a aplicar a este vector.
	 */
	void scale(float fx);

	/**
	 * Devuelve la longitud de este vector 'x = (u, v)'.
	 * 
	 * Se calculará como 'Math.sqrt(u * u + v * v)'.
	 * 
	 * @return longitud del vector.
	 */
	float magnitude();

	// Métodos para cambiar y consultar las componentes del vector

	/**
	 * Devuelve el valor de la n-ésima componente de este vector.
	 * 
	 * Las componentes se numeran a partir de 1. Si el valor dado para n no es
	 * válido, se lanzará una excepción del tipo indicado.
	 * 
	 * @param n
	 *            componente solicitada.
	 * @return el valor de esa componente en este vector.
	 * @throws IllegalArgumentException
	 *             la componente solicitada no existe.
	 */
	float getCx(int n) throws IllegalArgumentException;

	/**
	 * Asigna un valor a la n-ésima componente de este vector.
	 * 
	 * @param n
	 *            componente a modificar.
	 * @param v
	 *            el valor a asignar a esa componente.
	 * @throws IllegalArgumentException
	 *             la componente indicada no existe.
	 */
	void setCx(int n, float v) throws IllegalArgumentException;

}
