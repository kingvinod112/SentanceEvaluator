package Evaluator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvalueatorController
 */
@WebServlet("/EvalueatorController")
public class EvalueatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EvalueatorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sentance=request.getParameter("Sentence");
		String conversionType=request.getParameter("conversionType");
		String result=" ";
		String orginal=" "+sentance;
		 
		
			if("UpperCase".equals(conversionType)) {
				result=" "+sentance.toUpperCase();
				
				
			}else if("LowerCase".equals(conversionType)) {
				result=" "+sentance.toLowerCase();
				
				
			}else if("Word Count".equals(conversionType)) {
				
				String word[]=sentance.split(" ");
				result="Word Count : "+word.length;
				
				
			}else if("Character Count".equals(conversionType)) {
		
				result="Charecter Count : "+sentance.length();
				
			}else if("CamelCase".equals(conversionType)) {
			
				char ch[]=sentance.toLowerCase().toCharArray();
				
				for(int i=0;i<sentance.length(); i++){
					if(ch[i]<='z' && ch[i]>='a') {
						ch[i]-=32;
					break;
					}
				}
				
				for(int i=0; i<sentance.length(); i++){
				if(ch[i]==' ' && i<ch.length-1){
					if(ch[i+1]>='a' && ch[i+1]<='z')
						ch[i+1]-=32;	
				}
				}
				
				for(int i=0; i<ch.length; i++){
				result+=ch[i];
				}
		
			}else {
				result=" Invalid Conversion Type Please Select Conversion Type.";
			}
		
		
		if(sentance.isEmpty()|| sentance.trim().equals(""))
			result=" No input Found Please Enter a valid Input.";
		
		request.setAttribute("sen", sentance);
		request.setAttribute("typ", conversionType);
		
		request.setAttribute("title", "Output");
		request.setAttribute("result", result);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
