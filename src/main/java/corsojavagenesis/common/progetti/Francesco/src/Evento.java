package corsojavagenesis.common.progetti.Francesco.src;

import java.util.Date;
public class Evento {
	
	private long id;
	private String logTxt;
	private String pswTxt;
//costruttore vuoti di default
public Evento() {
}

public Evento(String log, String psw) {
	
	this.logTxt=log;
	this.pswTxt= psw;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getLogTxt() {
	return logTxt;
}

public void setLogTxt(String logTxt) {
	this.logTxt = logTxt;
}

public String getPswTxt() {
	return pswTxt;
}

public void setPswTxt(String pswTxt) {
	this.pswTxt = pswTxt;
}



}
//metodi setter e getter
//...