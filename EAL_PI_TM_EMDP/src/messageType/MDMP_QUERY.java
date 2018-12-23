package messageType;

import com.alibaba.fastjson.annotation.JSONField;

public class MDMP_QUERY {

	private String query;
	@JSONField(name = "query")
	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
}
