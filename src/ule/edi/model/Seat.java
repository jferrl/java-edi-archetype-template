package ule.edi.model;

public class Seat {
	
	private Person holder;
	
	private boolean advanceSale;
	
	public Seat(boolean advanceSale, Person holder) {
		this.holder = holder;
		this.advanceSale =advanceSale;
	}
	
	public Person getHolder() {
		return holder;
	}
	
	public boolean getAdvanceSale() {
		return this.advanceSale;
	}
	
	@Override
	public String toString() {
		return "{Seat: 'Holder':" + holder.toString() + ", Venta anticipada:" + this.getAdvanceSale() + "}";
	}
}
