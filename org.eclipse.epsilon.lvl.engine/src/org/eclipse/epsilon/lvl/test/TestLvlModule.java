package org.eclipse.epsilon.lvl.test;

import java.io.File;
import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.lvl.LvlModule;

public class TestLvlModule {

  public static void main(String[] args) throws Exception {

    String rootPath = "src/org/eclipse/epsilon/lvl/test/";
    LvlModule module = new LvlModule();
    module.setOutputFolder("gen");
    module.parse(new File(rootPath + "dummy.lvl"));
    if (!module.getParseProblems().isEmpty()) {
      System.err.println("The following errors were identified");
      for (ParseProblem parseProblem : module.getParseProblems()) {
        System.err.println("- " + parseProblem);
      }
      return;
    }

    EmfModel emfModel = createEmfModel("M", rootPath + "dummy.model",
        rootPath + "dummy.ecore", true, false);
    module.getContext().getModelRepository().addModel(emfModel);

    module.execute();
    System.out.println("Done");
  }

  protected static EmfModel createEmfModel(String name, String model,
      String metamodel, boolean readOnLoad, boolean storeOnDisposal)
          throws EolModelLoadingException, URISyntaxException {
    EmfModel emfModel = new EmfModel();
    StringProperties properties = new StringProperties();
    properties.put(EmfModel.PROPERTY_NAME, name);
    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
        URI.createFileURI(metamodel));
    properties.put(EmfModel.PROPERTY_MODEL_URI,
        URI.createFileURI(model));
    properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL,
        storeOnDisposal + "");
    emfModel.load(properties, (IRelativePathResolver) null);
    return emfModel;
  }
}
