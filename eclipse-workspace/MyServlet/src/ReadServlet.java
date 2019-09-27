import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadServlet extends HttpServlet {

	@Override
	// Servlet은 doGet 메써드를 무조건 디폴트로 실행하게 되있으므로, 무조건  doGet 메써드를 작성해야 한다.
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");  // URL 끝에 붙어있는 id 가져오기
		String content = ""; 				// content 초기화

		if(id == null) {
			id = "WEB";
			content = "Welcome";
		} else {
			File file = new File("data/"+id);		// data폴더의 id명과 같은 파일을 인스턴스로 불러온다.
	        FileReader filereader = new FileReader(file);
	        int singleCh = 0;
	        while((singleCh = filereader.read()) != -1){
	        	content += (char)singleCh;
	        }
	        filereader.close();
		}
//		
		String list = "";
		File dir = new File("data");
		File[] fileList = dir.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			File file = fileList[i];
			if (file.isFile()) {
				list += "<li><a href=\"read?id="+file.getName()+"\">"+file.getName()+"</a></li>";
			}
		}		

		
		PrintWriter pw = resp.getWriter();
		pw.write(""
				+ "<html>"
				+ "	<body>"
				+ "		<h1><a href=\"read\">WEB</a></h1>"
				+ "		<ol>"
				+ 			list
				+ "		</ol>"
				+ "		<h2>"+id+"</h2>"
				+ "		"+content
				+ "	</body>"
				+ "</html>");
		pw.close();
	}

}
