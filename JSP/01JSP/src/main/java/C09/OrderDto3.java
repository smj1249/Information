package C09;

import java.time.LocalDate;

public class OrderDto3 {
	private String addr;
	private LocalDate order_Date;
	private int sum_price;
	public OrderDto3(String addr, LocalDate order_Date, int sum_price) {
		super();
		this.addr = addr;
		this.order_Date = order_Date;
		this.sum_price = sum_price;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public LocalDate getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(LocalDate order_Date) {
		this.order_Date = order_Date;
	}
	public int getSum_price() {
		return sum_price;
	}
	public void setSum_price(int sum_price) {
		this.sum_price = sum_price;
	}
	@Override
	public String toString() {
		return "OrderDto3 [addr=" + addr + ", order_Date=" + order_Date + ", sum_price=" + sum_price + "]";
	}
	
	
	
	
}
