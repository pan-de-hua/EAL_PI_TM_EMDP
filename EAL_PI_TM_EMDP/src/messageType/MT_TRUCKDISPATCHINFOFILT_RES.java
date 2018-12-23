package messageType;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;



@XStreamAlias("ns0:MT_TRUCKDISPATCHINFOFILT_RES")
public class MT_TRUCKDISPATCHINFOFILT_RES {
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:emdp";
	
	@XStreamImplicit(itemFieldName = "Data")
	private List<MT_TRUCKDISPATCHINFOFILT_RES_DATA> Data;
	@JSONField(name = "Data")
	public List<MT_TRUCKDISPATCHINFOFILT_RES_DATA> getData() {
		return Data;
	}

	public void setData(List<MT_TRUCKDISPATCHINFOFILT_RES_DATA> data) {
		Data = data;
	}
	
}
