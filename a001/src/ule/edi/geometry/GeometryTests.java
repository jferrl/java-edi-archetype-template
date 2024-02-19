package ule.edi.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryTests {

	@Test
	public void testVectorAt() {
		// Ejemplo de creación de un Vec2f
		Vec2f ejemplo=Geometry.getInstance().vectorAt(1.3f, 1.3f);
		
		Vec2f ejem = Geometry.getInstance().vectorAt(ejemplo);
		
		Assert.assertEquals(ejemplo, ejem);	
	}
}
