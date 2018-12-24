package messageType;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ns0:queryDataResponse")
public class QueryDataResponse {
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="http://provider.service.ceair.com/";
	@XStreamAlias("result")
	private String result;


	@JSONField(name = "result")
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
