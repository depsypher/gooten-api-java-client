package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.LanguageDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class LanguagesApi {
  private ApiClient apiClient;

  public LanguagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LanguagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get text in a specified language
   * Get text in a specified language
   * @param languageCode Two-character language code, like \&quot;en\&quot; (english)
   * @param key A string used to query the language dictionary for specific values within a category.
   * @return LanguageDictionary
   * @throws ApiException if fails to make API call
   */
  public LanguageDictionary getLanguageText(String languageCode, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new ApiException(400, "Missing the required parameter 'languageCode' when calling getLanguageText");
    }
    
    // create path and map variables
    String localVarPath = "/languages/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "languageCode", languageCode));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<LanguageDictionary> localVarReturnType = new GenericType<LanguageDictionary>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
