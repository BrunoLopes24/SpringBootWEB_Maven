package com.mycompany.SrpingBootWeb_maven.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);

	private int code;

	private OrderStatus(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public static OrderStatus valueOf(int code){
		for (OrderStatus i : OrderStatus.values()){
			if (i.getCode() == code){
				return i;
			}
		}
		throw new IllegalArgumentException("INVALID Order Status Code!");
	}
}
