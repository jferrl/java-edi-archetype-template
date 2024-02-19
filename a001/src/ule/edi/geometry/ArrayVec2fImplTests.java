package ule.edi.geometry;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

//	Eclipse sabe cómo ejecutar clases de test; se las pasará
//	al framework JUnit y éste usará las etiquetas para ejecutar
//	los tests y generar un informe de resultados
//
//	Se puede ejecutar en el IDE una clase de test, o todas las que
//	se tengan en el proyecto:
//
//	En "Package Explorer/edi-a001-2015"... botón derecho... "Run as..." JUnit Test
//
public class ArrayVec2fImplTests {

	//	Atributos con datos para las pruebas ('fixture')
	//
	//	Para que en cada método de prueba se tengan ya vectores con los que
	//	trabajar
	//
	private Vec2f vAt00;
	
	private Vec2f vAt11;
	private Vec2f vAt22;
	private Vec2f vAt33;
	
	//	Los métodos etiquetados con '@Before' se ejecutan antes de cada
	//	método de test (@Test)
	@Before
	public void willBeCalledBeforeEachTestMethod() {
		
		//	Sólo para ver cómo se van ejecutando las pruebas, no es necesario
		//	hacer 'logging' en las prácticas, aunque en software complejo es
		//	muy útil
		//
		Logger.getLogger("ule.edi").info("Método @Before");
		
		//	Es habitual crear aquí instancias de las clases a probar, para que
		//	estén siempre disponibles y 'frescas' en cada método de test. Es
		//	decir, para programar cada método @Test se puede suponer un
		//	estado conocido (vAt00 = (0.0f, 0.0f), vAt11 = (1.0f, 1.0f)).
		//
		vAt00 = new ArrayVec2fImpl(0.0f, 0.0f);
		
		vAt11 = new ArrayVec2fImpl(1.0f, 1.0f);
		
		vAt22 = new ArrayVec2fImpl();
		
		vAt33 = new ArrayVec2fImpl(vAt00);
		
		
	}
	
	//	Los etiquetados como '@After' se ejecutan después de cada
	//	método de test (@Test)
	@After
	public void willBeCalledAfterEachTestMethod() {
		
		Logger.getLogger("ule.edi").info("Método @After");
		
		//	Si hubiera que hacer tareas de limpieza tras cada test,
		//  por ejemplo cerrar conexiones de red o a base de datos, podrían ir aquí
	}
	
	//	Los métodos de test se etiquetan como '@Test' para que JUnit sepa
	//	que debe ejecutarlos y tener en cuenta su resultado para un
	//	informe final de resultados
	@Test
	public void testGetCx() {
		
		//	Aquí ya se han ejecutado los métodos '@Before'; en este ejemplo
		//	se dispone de vAt00 y vAt11 para hacer pruebas
		
		Logger.getLogger("ule.edi").info("Método @Test (inicio)");
		
		//	JUnit ejecutará este método de test y detectará los resultados
		//	producidos por las aserciones (ver org.junit.Assert).

		//	Por ejemplo, si la construcción de vAt00 es correcta,
		//	debería cumplirse que ambas componentes valen 0.0f
		//
		Assert.assertEquals(0.0f, vAt00.getCx(1), /* no más diferentes que... */ 0.0f);
		Assert.assertEquals(0.0f, vAt00.getCx(1), 0.0f);
		Assert.assertEquals(0.0f, vAt00.getCx(2), 0.0f);
		
		Logger.getLogger("ule.edi").info("Método @Test (fin)");		
	}

	//	Puede resultar útil que JUnit ignore algunos métodos de test
	@Ignore
	public void testUnimplementedFeature() {
		
		//	Nunca se añadirá esta entrada al registro de logging, porque JUnit
		//	no ejecuta este método si está @Ignore
		//
		Logger.getLogger("ule.edi").info("Método @Ignore (...)");
		
		/* epic */fail("(...)");
	}

	//	Cuando un método de test falla, Eclipse muestra información en la
	//	vista "JUnit/Failure Trace"
	//
	@Test
	public void testWillFail() {
		
		Logger.getLogger("ule.edi").info("Método @Test (inicio)");
		
		//	Modifica vAt11
		vAt11.scale(2.0f);
		
		

		//	Nunca se añadirá esta entrada, porque el test se detiene al fallar
		//	una aserción
		//
		Logger.getLogger("ule.edi").info("Método @Test (fin)");
		
		//	Aunque vAt11 fuera modificado, antes del siguiente método de test
		//	se volverán a ejecutar los métodos @Before que prepararán un
		//	vAt11 nuevo
	}
	
	
	@Test
	public void testTranslate() {
		
		Vec2f dx = new ArrayVec2fImpl(2.0f, 2.0f);
		
		vAt22.translate(dx);
		
		Assert.assertEquals(2.0f, vAt22.getCx(1), 0.00001);
		Assert.assertEquals(2.0f, vAt22.getCx(2),0.00001);
		
		
	}
	
	@Test
	public void testMagnitude() {
	
		Vec2f vecMagnitude = new ArrayVec2fImpl(3.0f, 4.0f);
			
		Assert.assertEquals(5.0f, vecMagnitude.magnitude(), 0.00001);
	
	}
	
	

	@Test
	public void testGetCx1() {
	
		 try {
			  vAt00.getCx(5);
			  fail("Deberia haber lanzado una excepcion");
			 } catch (Exception e) {
			 
			 }
	
		
	
	}
	
	@Test
	public void testSetCx() {
	
	Vec2f setVec = new ArrayVec2fImpl(0.0f, 0.0f);
		
	setVec.setCx(1, 20.0f );	
	
	Assert.assertEquals(20.0f,setVec.getCx(1), 0.00001);
	
	}
	
		
	@Test
	public void testSetCx1() {
	
		Vec2f setVec = new ArrayVec2fImpl(0.0f, 0.0f);
	
		try {

		setVec.setCx(10, 2.0f);
		fail("Deberia haber lanzado una excepcion");

		} catch (Exception e) {

			

		}

	}
	
	
	@Test
	public void testHashCode() {
	
		Vec2f vec = new ArrayVec2fImpl(0.0f, 0.0f);
		Vec2f vec1 = new ArrayVec2fImpl(0.0f, 0.0f);
		assertEquals(vec, vec1);
		assertTrue( vec.hashCode()==vec1.hashCode() );
		

	}
	
	
	@Test
	public void testEquals(){
		
		Vec2f vec1 = new ArrayVec2fImpl(1.0f, 0.0f);
		Vec2f vec2 = new ArrayVec2fImpl(0.0f, 1.0f);
		
		
		Assert.assertTrue(vec1 instanceof Vec2f);
		
		vec1 = (Vec2f) vec1;
		vec2 = (Vec2f) vec2;
		
		Assert.assertTrue( vec1.equals(vec1));
		Assert.assertTrue( vec2.equals(vec2));
		
		Assert.assertTrue(!vec1.equals(vec2));
		Assert.assertTrue(!vec2.equals(vec1));
	}
	
	@Test
	public void testToString(){
		
		Vec2f vec1 = new ArrayVec2fImpl(1.0f, 0.0f);
		
		Assert.assertEquals("(+1.000000, +0.000000)", vec1.toString());
		
	}
	
	
}
