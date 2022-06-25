package org.xtext.example.mydsl.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SaveAsXmi {
	public static void run(Resource resource) {
		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			Resource xmiResource = new XMIResourceImpl(URI.createURI(resource.getURI().toString().replace(".mydsl", ".xmi")));
			xmiResource.getContents().add(resource.getContents().get(0));
			saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
			xmiResource.save(saveOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
