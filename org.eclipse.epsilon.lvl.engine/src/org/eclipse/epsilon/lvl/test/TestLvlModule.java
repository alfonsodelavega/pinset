package org.eclipse.epsilon.lvl.test;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.lvl.LvlModule;

public class TestLvlModule {

  public static void main(String[] args) throws Exception {

    LvlModule module = new LvlModule();
    module.setOutputFolder("gen");
    module.parse(new File("src/org/eclipse/epsilon/lvl/test/dummy.lvl"));
    if (!module.getParseProblems().isEmpty()) {
      System.err.println("The following errors were identified");
      for (ParseProblem parseProblem : module.getParseProblems()) {
        System.err.println("- " + parseProblem);
      }
      return;
    }

    EmfModel emfModel =
        createEmfModel("M", "dummy.model", "dummy.ecore", true, false);
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
        getFileURI(metamodel).toString());
    properties.put(EmfModel.PROPERTY_MODEL_URI,
        getFileURI(model).toString());
    properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL,
        storeOnDisposal + "");
    emfModel.load(properties, (IRelativePathResolver) null);
    return emfModel;
  }

  protected static URI getFileURI(String fileName) throws URISyntaxException {
    URI binUri = TestLvlModule.class.getResource(fileName).toURI();

    URI uri = null;
    if (binUri.toString().indexOf("bin") > -1) {
      uri = new URI(binUri.toString().replaceAll("bin", "src"));
    }
    else {
      uri = binUri;
    }
    return uri;
  }
}
