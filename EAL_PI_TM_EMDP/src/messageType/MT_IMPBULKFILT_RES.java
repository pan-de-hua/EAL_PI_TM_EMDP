package messageType;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;



@XStreamAlias("ns0:MT_IMPBULKFILT_RES")
public class MT_IMPBULKFILT_RES {
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:emdp";
	
	@XStreamImplicit(itemFieldName = "Data")
	private List<MT_IMPBULKFILT_RES_DATA> Data;

	@XStreamAlias("ReultMsg")
	private String ReultMsg;
	
	@JSONField(name = "Data")
	public List<MT_IMPBULKFILT_RES_DATA> getData() {
		return Data;
	}

	public void setData(List<MT_IMPBULKFILT_RES_DATA> data) {
		Data = data;
	}

	@JSONField(name = "ReultMsg")
	public String getReultMsg() {
		return ReultMsg;
	}

	public void setReultMsg(String reultMsg) {
		ReultMsg = reultMsg;
	}
	
}
