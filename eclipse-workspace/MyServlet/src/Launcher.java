import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Launcher {

	public static void main(String[] args) throws LifecycleException {
		
		Tomcat server = new Tomcat(); 	// Tomcat Application 생성

		// Tomcat 서버가 read-servlet을 실행해서 그 결과 만들어진 html코드를 다시 보내주게 만든다.
		
		Context app = server.addWebapp("/app", new File("WebContent").getAbsolutePath());   // WEB app의 이름이 /app
		// localhost:9999/app/으로 들어왔을 때, WebContent에 있는 index.html을 열어준다. 
		
		Tomcat.addServlet(app, "read-servlet", new ReadServlet());
		// ReadServlet의 Instance인 read-servlet을 생성하고
		
		app.addServletMappingDecoded("/read", "read-servlet");
		// /read로 들어오면, read-servlet Instance가 실행하게 된다.
		
		// localhost:9999/app/read 로 접속하면 보인다는 
//		
		server.setPort(9999);   // Port # 9999로 접속할 수 있게 포트지정
		server.start();         // Tomcat 서버 활성화 시작
		server.getServer().await(); // Tomcat 서버 살아있는 상태 유지.
		
//		Tomcat server2 = new Tomcat();
//		server.setPort(10000);

	}

}
