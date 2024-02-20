package ule.edi.model;

import java.util.Date;
import java.util.List;

public interface Travel {
	// OJO! No puede haber dos personas en el viaje con el mismo nif

	/**
	 * Devuelve el número de asientos totales del bus.
	 * 
	 * @return el numero de asientos que tiene el bus
	 */
	public int getNumberOfSeats();
	
	/**
	 * Devuelve la fecha de inicio del viaje.
	 * 
	 * @return
	 */
	public Date getTravelDate();
	
	
	/**
	 * Devuelve el descuento realizado en periodo de venta anticipada.
	 * Si el descuento es del 20%, se devuelve 20
	 * 
	 * @return
	 */
	public Byte getDiscountAdvanceSale();

	
	/**
	 * Calcula el número de asientos totales vendidos del viaje.
	 * 
	 * @return
	 */
	public int getNumberOfSoldSeats();
	
	/**
	 * Calcula el número de asientos vendidos en venta normal del viaje.
	 * 
	 * @return
	 */
	public int getNumberOfNormalSaleSeats();
	
	/**
	 * Calcula el número de asientos vendidos en venta anticipada.
	 * 
	 * @return
	 */
	public int getNumberOfAdvanceSaleSeats();
	
	
	
	/**
	 * Calcula el número de asientos disponibles (no vendidas).
	 * 
	 * @return
	 */
	public int getNumberOfAvailableSeats();

	/**
	 * Devuelve el asiento en la posición dada o null si no está ocupada
	 * 
	 * Las posiciones empiezan en '1'.
	 * 
	 * @param pos
	 * @return
	 */
	public Seat getSeat(int pos);
	

	/**
	 * Libera el asiento de la posición dada. 
	 * 
     * Si el asiento de esa posición ya está libre, devuelve null.
	 * 
	 * Las posiciones empiezan en '1'.
	 * 
	 * 
	 * @param pos
	 * @return p :la persona que ocupaba el asiento o null si el asiento no estaba ocupado.
	 * 
	 */
	public Person refundSeat(int pos);

	/**
	 * 
	 * Si el asiento de esa posición ya está ocupada, no hace nada y devuelve false.
	 * 
	 * Las posiciones empiezan en '1'.
	 * 
	 * @param pos
	 * @param nif, name, edad: nif,nombre y edad de la persona que ocupará el asiento
	 * @param isAdvanceSale: true si es venta anticipada; false si es venta normal
	 * @return true indica si se pudo realizar la venta del asiento, false en caso contrario
	 */
	public boolean sellSeatPos(int pos, String nif, String name, int edad, boolean isAdvanceSale);
	
	/**
	 * 
	 * Busca y devuelve el primer asiento libre empezando por el primer asiento (posición 1 del bus que 
	 * estará en la posición 0 del array). Si no hay asientos libres, no hace nada y devuelve -1.
	 * Si encuentra un asiento libre, crea un objeto Person, con los datos pasados como parámetro y 
	 * crea el asiento, se lo asigna a la posición pos-1 del array y devuelve pos (posición en el bus) 
	 * 
	 * Las posiciones empiezan en '1'.
	 * 
	 * @param nif,name,age: datos de la persona que ocupara el asiento
	 * @param isAdvanceSale: true si es venta anticipada; false si es venta normal
	 * @return true indica si se pudo realizar la venta del asiento, false en caso contrario
	 */
	public int sellSeatFrontPos(String nif, String name, int edad, boolean isAdvanceSale);
	
	/**
	 * 
	 * Busca y devuelve el primer asiento libre empezando por el último asiento 
	 * Si no hay asientos libres, no hace nada y devuelve -1.
	 * Si encuentra un asiento libre, crea un objeto Person, con los datos pasados como parámetro y 
	 * crea el asiento, se lo asigna a la posición pos-1 del array y devuelve pos (posición en el bus) 
	 * 
	 * Las posiciones empiezan en '1'.
	 * 
	 * @param nif,name,age: datos de la persona que ocupara el asiento
	 * @param isAdvanceSale: true si es venta anticipada; false si es venta normal
	 * @return la posición del asiento en el bus, -1 se no encuentra asiento disponible 
	 */
	public int sellSeatRearPos(String nif, String name, int edad, boolean isAdvanceSale);
	

	/**
	 * Calcula el número de niños asistentes al viaje (<18).
	 *  
	 * @return
	 */
	public int getNumberOfChildren();
	
	/**
	 * Calcula el número de adultos asistentes al viaje (>=18).
	 * 
	 * @return
	 */
	public int getNumberOfAdults();


	
	/**
	 * Calcula la lista de números de asientos disponibles
	 * Tener en cuenta que las posiciones empiezan en 1
	 * 
	 * @return lista de posiciones disponibles 
	 */
    public List<Integer> getAvailableSeatsList();
    
    /**
	 * Calcula la lista de números de butacas vendidas en venta anticipada
	 * Tener en cuenta que las posiciones empiezan en 1
	 * 
	 * @return lista de posiciones vendidas en venta anticipada 
	 */
    public List<Integer> getAdvanceSaleSeatsList();

    /**
	 * Calcula el número máximo de posiciones disponibles consecutivas
	 * 
	 * @return nº de posiciones consecutivas disponibles
	 */
    public int getMaxNumberConsecutiveSeats();

    
    /**
	 * Calcula el precio del asiento en función del tipo de venta y del descuento si es venta anticipada de ese asiento butaca
	 * 
	 * 	 @return precio del asiento 
	 */
	public Double getSeatPrice(Seat seat);

   	
	/**
	 * Calcula el importe total recaudado por los  asientos ocupados
	 * 
	 * 	 @return importe total recaudado
	 */
	public Double getCollectionTravel();
	
	/**
	 * Calcula el número de asiento que ocupa la persona con el nif pasado como parámetro)
	 * 
	 * @param String nif a buscar 
	 * @return el asiento que ocupa la persona o -1 si no está
	 */
	public int getPosPerson(String nif);
	
	/**
	 * Devuelve el precio normal del viaje (sin descuento por venta anticipada)
	 * 
	 * @return el atributo price del viaje
	 */
	public double getPrice();
		
	/**
	 * 
	 * @param p persona a buscar 
	 * @return true si la persona ocupa una butaca vendida en venta anticipada, false en caso contrario
	 */
	public boolean isAdvanceSale(Person p);
}
