package org.xtext.example.mydsl.generator;

import java.io.File;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.IEtlModule;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.FileUtil;
import org.eclipse.epsilon.emc.emf.EmfModel;



public class XmiToEcore {
	
	public static void run(Resource resource) {
		IEtlModule module = new EtlModule();
		
//		URI sourceUri = URI.createURI(
//				resource.getURI().toString().replace(".mydsl", ".xmi"));
		URI sourceUri = resource.getURI();
		URI targetUri = URI.createURI(
				resource.getURI().toString().replace(".mydsl", ".ecore"));
		URI ecoreUri = URI.createURI(
				"platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore");

		try {
			module.getContext().getModelRepository().addModels(
					loadModel(sourceUri, "MyDsl", "http://www.xtext.org/example/mydsl/MyDsl", true, false),
					loadModel(targetUri, "Ecore", "http://www.eclipse.org/emf/2002/Ecore", false, true),
					loadModel(ecoreUri, "EcoreIn", "http://www.eclipse.org/emf/2002/Ecore", true, false)
			);
			
			module.parse(new File(getFullPath("mydsl2ecore.etl", XmiToEcore.class)));
			module.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		for (ParseProblem pp : module.getParseProblems()) {
			System.out.printf("%d:%d: %s\n", pp.getLine(), pp.getColumn(), pp.getReason());
		}
		
		module.getContext().getModelRepository().dispose();
		module.getContext().dispose();
	}
	
	private static EmfModel loadModel(URI modelFileUri, String name, String metamodelUri, boolean read, boolean store) throws Exception {
		EmfModel model = new EmfModel();
		model.setCachingEnabled(false);
		model.setName(name);
		model.setModelFileUri(modelFileUri);
		model.setMetamodelUri(metamodelUri);
		model.setReadOnLoad(read);
		model.setStoredOnDisposal(store);
		model.load();
		return model;
	}
	
	private static String getFullPath(String path, Class<?> currentClass) throws IOException {
		return FileUtil.getFileStandalone(path, currentClass).getAbsolutePath();
	}
}
