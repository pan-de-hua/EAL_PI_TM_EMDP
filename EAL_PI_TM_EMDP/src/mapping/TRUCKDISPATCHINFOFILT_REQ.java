package mapping;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.alibaba.fastjson.JSON;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;

import messageType.MDMP_QUERY;
import messageType.MT_TRUCKDISPATCHINFOFILT_REQ;

public class TRUCKDISPATCHINFOFILT_REQ extends AbstractTransformation{

	@Override
	public void transform(TransformationInput in, TransformationOutput out) throws StreamTransformationException {
		this.execute(in.getInputPayload().getInputStream(), out.getOutputPayload().getOutputStream());
		
	}
	public void execute(InputStream is, OutputStream os)
			throws StreamTransformationException {
		String outjson = "";
		try {
			XStream xstream = new XStream(new DomDriver("utf-8", new NoNameCoder()));
			xstream.processAnnotations(MT_TRUCKDISPATCHINFOFILT_REQ.class);
			MT_TRUCKDISPATCHINFOFILT_REQ req = (MT_TRUCKDISPATCHINFOFILT_REQ) xstream.fromXML(is);
			//req.setAlias("L_TRUCKDISPATCHINFOFILT");
			MDMP_QUERY query = new MDMP_QUERY();
			query.setQuery(JSON.toJSONString(req));
			outjson = JSON.toJSONString(query);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			os.write(outjson.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
