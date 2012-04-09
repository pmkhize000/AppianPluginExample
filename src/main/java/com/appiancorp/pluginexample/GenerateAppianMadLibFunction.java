package com.appiancorp.pluginexample;

import org.apache.log4j.Logger;

import com.appian.types.pluginexample.AppianMadLib;
import com.appiancorp.services.ServiceContext;
import com.appiancorp.suiteapi.expression.annotations.AppianScriptingFunctionsCategory;
import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;

@AppianScriptingFunctionsCategory
public class GenerateAppianMadLibFunction {

  private static final Logger LOG = Logger.getLogger(GenerateAppianMadLibFunction.class);

  @Function
  public String GenerateAppianMadLibText(ServiceContext sc, @Parameter AppianMadLib madlib) {
    if (LOG.isDebugEnabled()){
      LOG.debug("Generating AppianMadLib for "+sc.getIdentity().getIdentity());
    }
    return AppianMadLibUtil.createMadLibText(madlib);
  }
}
