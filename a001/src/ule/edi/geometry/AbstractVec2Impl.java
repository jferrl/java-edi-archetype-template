package ule.edi.geometry;

import java.util.Locale;
import java.util.Objects;

public abstract class AbstractVec2Impl implements Vec2f {

	public AbstractVec2Impl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Desplaza este vector 'x = (u, v)' lo indicado por el parámetro 'dx =
	 * (du, dv)'. * El nuevo valor de este vector será 'x + dx = (u + du, v +
	 * dv)'. *
	 * 
	 * @param dx
	 *            
	 */
	@Override
	public void translate(Vec2f dx) {
		
		this.setCx(1,this.getCx(1) + dx.getCx(1));
		this.setCx(2,this.getCx(2) + dx.getCx(2));

	}

	/**
	 * Escala este vector 'x = (u, v)' lo indicado por 'fx'. * El nuevo valor
	 * será 'fx · x = (fx · u, fx · v)'. *
	 * 
	 * @param fx
	 *            *
	 */
	@Override
	public void scale(float fx) {

		// TODO Auto-generated method stub
		this.setCx(1, this.getCx(1) * fx);
		this.setCx(2, this.getCx(2) * fx);
	}

	/**
	 * Devuelve la longitud de este vector 'x = (u, v)'. * Se calculará como
	 * 'Math.sqrt(u * u + v * v)'. *
	 * 
	 * @return longitud del vector.
	 */
	@Override
	public float magnitude() {

		// TODO Auto-generated method stub
		return (float) Math.sqrt(this.getCx(1) * this.getCx(1) + this.getCx(2)
				* this.getCx(2));

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (obj == this) {
			return true;
		} else {

			if (obj instanceof Vec2f) {

				Vec2f tmpVec = (Vec2f) obj;

				if ((Math.abs(this.getCx(1) - tmpVec.getCx(1)) < 1.0e-06)
						&& (Math.abs(this.getCx(2) - tmpVec.getCx(2)) < 1.0e-06)) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}

		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.getCx(1), this.getCx(2));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + String.format(Locale.US, "%+.6f", this.getCx(1)) + ", "
		+ String.format(Locale.US, "%+.6f", this.getCx(2)) + ")";
	}

}
