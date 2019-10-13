package utils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
	"file:src/test/property_files/config.properties"
})
public interface ConfigProperties extends Config {

	@Key("baseURI")
	public String getBaseURI();
	
	@Key("basePath")
	public String getBasePath();
	
	@Key("createCustomerAPIEndPoint")
	public String getcreateCustomerAPIEndPoint();
	
	@Key("updateCustomerAPIEndPoint")
	public String getupdateCustomerAPIEndPoint();
	
	@Key("deleteCustomerAPIEndPoint")
	public String getdeleteCustomerAPIEndPoint();
	
	@Key("retrieveCustomerAPIEndPoint")
	public String getretrieveCustomerAPIEndPoint();
	
	@Key("listAllCustomersAPIEndPoint")
	public String getlistAllCustomersAPIEndPoint();
	
	@Key("ValidAuthKey")
	public String getValidAuthKey();
	
	@Key("InvalidAuthKey")
	public String getInvalidAuthKey();
	
	
}
