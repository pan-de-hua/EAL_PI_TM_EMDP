package messageType;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_TRUCKDISPATCHINFOFILT_REQ")
public class MT_TRUCKDISPATCHINFOFILT_REQ {
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:emdp";
	
	@XStreamAlias("outTime")
	private String outTime;
	
	private String alias;
	
	@JSONField(name = "outTime")
	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	
	@JSONField(name = "alias")
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
}
