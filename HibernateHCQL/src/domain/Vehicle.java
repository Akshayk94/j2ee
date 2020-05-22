package domain;

import javax.persistence.*;

@Entity
@Table(name="vehicle_master")
public class Vehicle 
{
	@Id
	@Column(name="vehicle_id")
	private int vehicleId;
	
	@Column(name="vehicle_name")
	private String vehicleName;
	
	@Column(name="vehicle_price")
	private double vehiclePrice;
	
	@Column(name="vehicle_brand")
	private String vehicleBrand;
	
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public double getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	
	public String toString()
	{
		return vehicleId+"\t"+vehicleName+"\t"+vehiclePrice+"\t"+vehicleBrand;
	}
	
}
