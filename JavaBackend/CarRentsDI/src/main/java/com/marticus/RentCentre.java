package com.marticus;

public class RentCentre {
	private CarRental carrent;

	public CarRental getCarrent() {
		return carrent;
	}

	public void setCarrent(CarRental carrent) {
		this.carrent = carrent;
	}
	public void rental() {
		carrent.rent();
	}

}
