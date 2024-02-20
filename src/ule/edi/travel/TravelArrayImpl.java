package ule.edi.travel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ule.edi.model.*;

public class TravelArrayImpl implements Travel {
	
	private static final Double DEFAULT_PRICE = 100.0;
	private static final Byte DEFAULT_DISCOUNT = 25;
	private static final Byte CHILDREN_EXMAX_AGE = 18;
	private Date travelDate;
	private int nSeats;
	
	private Double price;    // precio de entradas 
	private Byte discountAdvanceSale;   // descuento en venta anticipada (0..100)

	private Seat[] seats;
		
	public TravelArrayImpl(Date date, int nSeats){
	   //TODO 
	   // utiliza los precios por defecto: DEFAULT_PRICE y DEFAULT_DISCOUNT definidos en esta clase
	   //debe crear el array de asientos
	}

	public TravelArrayImpl(Date date, int nSeats, Double price, Byte discount){
	   //TODO 
	   // Debe crear el array de asientos
}

@Override
public Byte getDiscountAdvanceSale() {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public int getNumberOfSoldSeats() {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public int getNumberOfNormalSaleSeats() {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public int getNumberOfAdvanceSaleSeats() {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public int getNumberOfSeats() {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public int getNumberOfAvailableSeats() {
	// TODO Auto-generated method stub
	return 0;

}

@Override
public Seat getSeat(int pos) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public Person refundSeat(int pos) {
	// TODO Auto-generated method stub
	
	return null;
}



private boolean isChildren(int age) {
	// TODO Auto-generated method stub
	return false;
}

private boolean isAdult(int age) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public List<Integer> getAvailableSeatsList() {
	// TODO Auto-generated method stub
	List<Integer> lista=new ArrayList<Integer>(nSeats);
	return lista;
}


@Override
public List<Integer> getAdvanceSaleSeatsList() {
	// TODO Auto-generated method stub
	List<Integer> lista=new ArrayList<Integer>(nSeats);
	return lista;
}


@Override
public int getMaxNumberConsecutiveSeats() {
	// TODO Auto-generated method stub
	return 0;
}




@Override
public boolean isAdvanceSale(Person p) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public Date getTravelDate() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public boolean sellSeatPos(int pos, String nif, String name, int edad, boolean isAdvanceSale) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public int getNumberOfChildren() {
	// TODO Auto-generated method stub
	
	return 0;
}


@Override
public int getNumberOfAdults() {
	// TODO Auto-generated method stub
	
	return 0;
}



@Override
public Double getCollectionTravel() {
	// TODO Auto-generated method stub
	
	return 0.0;
}


@Override
public int getPosPerson(String nif) {
	// TODO Auto-generated method stub
	return 0;	
}


@Override
public int sellSeatFrontPos(String nif, String name, int edad, boolean isAdvanceSale) {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public int sellSeatRearPos(String nif, String name, int edad, boolean isAdvanceSale) {
	// TODO Auto-generated method stub
	return 0;
}




@Override
public Double getSeatPrice(Seat seat) {
	// TODO Auto-generated method stub
	return 0.0;
}


@Override
public double getPrice() {
	return this.price;
}


}	