package messageType;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class MT_TRUCKDISPATCHINFOFILT_RES_DATA {
	@XStreamAlias("id")
	private String id;
	@XStreamAlias("truck")
	private String truck;
	@XStreamAlias("billNo")
	private String billNo;
	@XStreamAlias("packNo")
	private Long packNo;
	@XStreamAlias("grossWeight")
	private Double grossWeight;
	@XStreamAlias("warehouse")
	private String warehouse;
	@XStreamAlias("outGate")
	private String outGate;
	@XStreamAlias("outTime")
	private String outTime;
	@XStreamAlias("inGate")
	private String inGate;
	@XStreamAlias("inTime")
	private String inTime;
	
	@JSONField(name = "id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@JSONField(name = "truck")
	public String getTruck() {
		return truck;
	}
	public void setTruck(String truck) {
		this.truck = truck;
	}
	@JSONField(name = "billNo")
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	@JSONField(name = "packNo")
	public Long getPackNo() {
		return packNo;
	}
	public void setPackNo(Long packNo) {
		this.packNo = packNo;
	}
	@JSONField(name = "grossWeight")
	public Double getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}
	@JSONField(name = "warehouse")
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	@JSONField(name = "outGate")
	public String getOutGate() {
		return outGate;
	}
	public void setOutGate(String outGate) {
		this.outGate = outGate;
	}
	@JSONField(name = "outTime")
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	@JSONField(name = "inGate")
	public String getInGate() {
		return inGate;
	}
	public void setInGate(String inGate) {
		this.inGate = inGate;
	}
	@JSONField(name = "inTime")
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	
}
