package test;

public class StringExecuter {
	 protected void extractErrorMessage(String messageCode){
		 int start=messageCode.lastIndexOf("<ErrMsg>“");
		 int end = messageCode.indexOf(".”(");		 
		 System.out.println("enter="+start+"\n  end="+end+"\n Result: "+messageCode.substring(start+9, end+1)); 
  	
	    }
	 public static void main(String[] args) {
		StringExecuter se = new StringExecuter();
		se.extractErrorMessage("The system has encountered an" +
				" error while processing your request. Please contact the system administrator and provide the detailed error message captured below. " +
				"[AMS-CS-1000] Follwing error encounered during a call to Siebel service 'Workflow Process Manager'," +
				" method 'RunProcess':'<com.siebel.om.sisnapi.RequestException> <Error><ErrorCode>6750339</ErrorCode> " +
				"<ErrMsg>“We were unable to retrieve tax information for your customer. " +
				"Please contact Accounts Receivables for further details.”" +
				"(SBL-BPR-00131)</ErrMsg></Error> </com.siebel.om.sisnapi.RequestException>'.");	
	}
}
