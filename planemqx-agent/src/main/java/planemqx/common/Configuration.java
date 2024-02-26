package planemqx.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static final String LOGIN;
	public static final String PASSWORD;
	public static final String ADMIN_LOGIN;
	public static final String ADMIN_PASSWORD;
	public static final String BROKER_URL;
	public static final String BROKER_API_URL;
	public static final String SERVER_URL;
	public static final String CONFIGURATION;
	public static final String SCENARIO;
	public static final String AGENT_NAME;
	public static final String AGENT_PASSWORD;
	public static final int PRIORITY_QUEUES_CAPACITY = 20000;
	public static final int NB_PRIORITIES = 10;

	static {
		Properties props = new Properties();
		String fileName = "config/config.properties";
		try (FileInputStream fis = new FileInputStream(fileName)) {
			props.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		BROKER_URL = props.getProperty("brokerUrl");
		BROKER_API_URL = props.getProperty("brokerAPIsUrl");
		SERVER_URL = props.getProperty("serverUrl");
		LOGIN = props.getProperty("login");
		PASSWORD = props.getProperty("password");
		ADMIN_LOGIN = props.getProperty("admin_login");
		ADMIN_PASSWORD = props.getProperty("admin_password");
		CONFIGURATION = props.getProperty("configuration");
		SCENARIO = props.getProperty("scenario");
		AGENT_NAME = props.getProperty("agent.name");
		AGENT_PASSWORD = props.getProperty("agent.password");
	}

	private Configuration() {
	}
}
