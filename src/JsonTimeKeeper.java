import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;


public class JsonTimeKeeper {
	private Date today;
	private Long loggedTime;
	
	public JsonTimeKeeper() {
		super();
		this.setLoggedTime(0l);
		this.setToday(new Date());
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date now) {
		this.today = now;
	}

	public Long getLoggedTime() {
		return loggedTime;
	}

	public void setLoggedTime(Long loggedTime) {
		this.loggedTime = loggedTime;
	}
	
	
	
}
