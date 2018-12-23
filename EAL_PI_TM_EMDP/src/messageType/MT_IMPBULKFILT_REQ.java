package messageType;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_IMPBULKFILT_REQ")
public class MT_IMPBULKFILT_REQ {
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:emdp";
	
	@XStreamAlias("billid")
	private String billid;
	
	private String alias;

	@JSONField(name = "billid")
	public String getBillid() {
		return billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	@JSONField(name = "alias")
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
}
