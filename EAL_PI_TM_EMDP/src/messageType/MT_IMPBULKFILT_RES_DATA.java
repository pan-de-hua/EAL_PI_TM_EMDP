package messageType;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class MT_IMPBULKFILT_RES_DATA {
	@XStreamAlias("id")
	private String id;
	@XStreamAlias("billid")
	private String billid;
	@XStreamAlias("stocktypeid")
	private String stocktypeid;
	@XStreamAlias("awbpreid")
	private Long awbpreid;
	@XStreamAlias("awbid")
	private Double awbid;
	@XStreamAlias("specopeid")
	private String specopeid;
	@XStreamAlias("specnote")
	private String specnote;
	@XStreamAlias("airlineid")
	private String airlineid;
	@XStreamAlias("flightno")
	private String flightno;
	@XStreamAlias("flightDateStr")
	private String flightDateStr;
	@XStreamAlias("departureDate")
	private String departureDate;
	@XStreamAlias("arrivalDate")
	private String arrivalDate;
	@XStreamAlias("sairportid")
	private String sairportid;
	@XStreamAlias("eairportid")
	private String eairportid;
	@XStreamAlias("csgcustomershortnm")
	private String csgcustomershortnm;
	@XStreamAlias("fdsrecid")
	private String fdsrecid;
	@XStreamAlias("awbfltpcs")
	private String awbfltpcs;
	@XStreamAlias("awbfltwt")
	private String awbfltwt;
	@XStreamAlias("awbtolpcs")
	private String awbtolpcs;
	@XStreamAlias("awbtolwt")
	private String awbtolwt;
	@XStreamAlias("awbtolfeewt")
	private String awbtolfeewt;
	@XStreamAlias("cargono")
	private String cargono;
	@XStreamAlias("cargonm")
	private String cargonm;
	@XStreamAlias("depart")
	private String depart;
	@XStreamAlias("dest")
	private String dest;
	@XStreamAlias("csgcustname")
	private String csgcustname;
	@XStreamAlias("docpcs")
	private String docpcs;
	@XStreamAlias("isagent")
	private String isagent;
	@XStreamAlias("csgcustomershortnm1")
	private String csgcustomershortnm1;
	@XStreamAlias("cargoinfo")
	private String cargoinfo;
	@XStreamAlias("etime")
	private String etime;
	@XStreamAlias("opedepartid")
	private String opedepartid;
	@XStreamAlias("contry")
	private String contry;
	@XStreamAlias("flightMonth")
	private String flightMonth;
	
	@JSONField(name = "id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@JSONField(name = "billid")
	public String getBillid() {
		return billid;
	}
	public void setBillid(String billid) {
		this.billid = billid;
	}
	@JSONField(name = "stocktypeid")
	public String getStocktypeid() {
		return stocktypeid;
	}
	public void setStocktypeid(String stocktypeid) {
		this.stocktypeid = stocktypeid;
	}
	@JSONField(name = "awbpreid")
	public Long getAwbpreid() {
		return awbpreid;
	}
	public void setAwbpreid(Long awbpreid) {
		this.awbpreid = awbpreid;
	}
	@JSONField(name = "awbid")
	public Double getAwbid() {
		return awbid;
	}
	public void setAwbid(Double awbid) {
		this.awbid = awbid;
	}
	@JSONField(name = "specopeid")
	public String getSpecopeid() {
		return specopeid;
	}
	public void setSpecopeid(String specopeid) {
		this.specopeid = specopeid;
	}
	@JSONField(name = "specnote")
	public String getSpecnote() {
		return specnote;
	}
	public void setSpecnote(String specnote) {
		this.specnote = specnote;
	}
	@JSONField(name = "airlineid")
	public String getAirlineid() {
		return airlineid;
	}
	public void setAirlineid(String airlineid) {
		this.airlineid = airlineid;
	}
	@JSONField(name = "flightno")
	public String getFlightno() {
		return flightno;
	}
	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}
	@JSONField(name = "flightDateStr")
	public String getFlightDateStr() {
		return flightDateStr;
	}
	public void setFlightDateStr(String flightDateStr) {
		this.flightDateStr = flightDateStr;
	}
	@JSONField(name = "departureDate")
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	@JSONField(name = "arrivalDate")
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	@JSONField(name = "sairportid")
	public String getSairportid() {
		return sairportid;
	}
	public void setSairportid(String sairportid) {
		this.sairportid = sairportid;
	}
	@JSONField(name = "eairportid")
	public String getEairportid() {
		return eairportid;
	}
	public void setEairportid(String eairportid) {
		this.eairportid = eairportid;
	}
	@JSONField(name = "csgcustomershortnm")
	public String getCsgcustomershortnm() {
		return csgcustomershortnm;
	}
	public void setCsgcustomershortnm(String csgcustomershortnm) {
		this.csgcustomershortnm = csgcustomershortnm;
	}
	@JSONField(name = "fdsrecid")
	public String getFdsrecid() {
		return fdsrecid;
	}
	public void setFdsrecid(String fdsrecid) {
		this.fdsrecid = fdsrecid;
	}
	@JSONField(name = "awbfltpcs")
	public String getAwbfltpcs() {
		return awbfltpcs;
	}
	public void setAwbfltpcs(String awbfltpcs) {
		this.awbfltpcs = awbfltpcs;
	}
	@JSONField(name = "awbfltwt")
	public String getAwbfltwt() {
		return awbfltwt;
	}
	public void setAwbfltwt(String awbfltwt) {
		this.awbfltwt = awbfltwt;
	}
	@JSONField(name = "awbtolpcs")
	public String getAwbtolpcs() {
		return awbtolpcs;
	}
	public void setAwbtolpcs(String awbtolpcs) {
		this.awbtolpcs = awbtolpcs;
	}
	@JSONField(name = "awbtolwt")
	public String getAwbtolwt() {
		return awbtolwt;
	}
	public void setAwbtolwt(String awbtolwt) {
		this.awbtolwt = awbtolwt;
	}
	@JSONField(name = "awbtolfeewt")
	public String getAwbtolfeewt() {
		return awbtolfeewt;
	}
	public void setAwbtolfeewt(String awbtolfeewt) {
		this.awbtolfeewt = awbtolfeewt;
	}
	@JSONField(name = "cargono")
	public String getCargono() {
		return cargono;
	}
	public void setCargono(String cargono) {
		this.cargono = cargono;
	}
	@JSONField(name = "cargonm")
	public String getCargonm() {
		return cargonm;
	}
	public void setCargonm(String cargonm) {
		this.cargonm = cargonm;
	}
	@JSONField(name = "depart")
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	@JSONField(name = "dest")
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	@JSONField(name = "csgcustname")
	public String getCsgcustname() {
		return csgcustname;
	}
	public void setCsgcustname(String csgcustname) {
		this.csgcustname = csgcustname;
	}
	@JSONField(name = "docpcs")
	public String getDocpcs() {
		return docpcs;
	}
	public void setDocpcs(String docpcs) {
		this.docpcs = docpcs;
	}
	@JSONField(name = "isagent")
	public String getIsagent() {
		return isagent;
	}
	public void setIsagent(String isagent) {
		this.isagent = isagent;
	}
	@JSONField(name = "csgcustomershortnm1")
	public String getCsgcustomershortnm1() {
		return csgcustomershortnm1;
	}
	public void setCsgcustomershortnm1(String csgcustomershortnm1) {
		this.csgcustomershortnm1 = csgcustomershortnm1;
	}
	@JSONField(name = "cargoinfo")
	public String getCargoinfo() {
		return cargoinfo;
	}
	public void setCargoinfo(String cargoinfo) {
		this.cargoinfo = cargoinfo;
	}
	@JSONField(name = "etime")
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	@JSONField(name = "opedepartid")
	public String getOpedepartid() {
		return opedepartid;
	}
	public void setOpedepartid(String opedepartid) {
		this.opedepartid = opedepartid;
	}
	@JSONField(name = "contry")
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	@JSONField(name = "flightMonth")
	public String getFlightMonth() {
		return flightMonth;
	}
	public void setFlightMonth(String flightMonth) {
		this.flightMonth = flightMonth;
	}
	
	
}
