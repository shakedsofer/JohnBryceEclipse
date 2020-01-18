
public class WhatsAppMessage {

	private String content;
	private String senderName;
	private String recipinName;
	private int status;
	private long sentTimeMillis;

	public WhatsAppMessage(String content, String senderName, String recipiName, int status, long sentTimeMillis) {

		setContent(content);
		setSenderName(senderN);
		setRecipinName(recipiN);
		setStatus(status);
		setSentTimeMillis(timeMillis);

	}

	public void setStatus(int status) {
		if (status == 1 || status == 0 || status == -1) {

			this.status = status;
		}
	}

	public void setSentTimeMillis(int set) {

		if (set > 0) {

			this.sentTimeMillis = set;

		}

	}
	private long millisPassedSineceSent ( long passent) {
		
		long set = System.currentTimeMillis(); 
		set -= sentTimeMillis; 
		
		if ( set > 0 )  { 
				return set; 
			
		} else { 

			return 0;
		}
	}

}

//	public boolean sentTimeMillis(long timeMillis) {
//
//		boolean sent;
//		if (timeMillis < 0) {
//			sent = true;
//
//		} else {
//			sent = false;
//		}
//
//		return sent;

//getContent(content);
//getSenderName(senderN);
//getRecipinName(recipiN);
//public boolean isDelivered();
//public boolean isSent();
//public boolean isIdle();
//private boolean isAtLeastSent();
//getSentTimeMillis(timeMillis);
