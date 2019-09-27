import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Launcher {

	public static void main(String[] args) throws LifecycleException {
		
		Tomcat server = new Tomcat(); 	// Tomcat Application ����

		// Tomcat ������ read-servlet�� �����ؼ� �� ��� ������� html�ڵ带 �ٽ� �����ְ� �����.
		
		Context app = server.addWebapp("/app", new File("WebContent").getAbsolutePath());   // WEB app�� �̸��� /app
		// localhost:9999/app/���� ������ ��, WebContent�� �ִ� index.html�� �����ش�. 
		
		Tomcat.addServlet(app, "read-servlet", new ReadServlet());
		// ReadServlet�� Instance�� read-servlet�� �����ϰ�
		
		app.addServletMappingDecoded("/read", "read-servlet");
		// /read�� ������, read-servlet Instance�� �����ϰ� �ȴ�.
		
		// localhost:9999/app/read �� �����ϸ� ���δٴ� 
//		
		server.setPort(9999);   // Port # 9999�� ������ �� �ְ� ��Ʈ����
		server.start();         // Tomcat ���� Ȱ��ȭ ����
		server.getServer().await(); // Tomcat ���� ����ִ� ���� ����.
		
//		Tomcat server2 = new Tomcat();
//		server.setPort(10000);

	}

}
