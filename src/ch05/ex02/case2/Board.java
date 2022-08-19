package ch05.ex02.case2;

import java.time.LocalDate;

public class Board {
	private String msg;
	private LocalDate WrittenDate;
	public String getMsg() {
		return msg;
	}
	public LocalDate getWrittenDate() {
		return WrittenDate;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setWrittenDate(LocalDate writtenDate) {
		WrittenDate = writtenDate;
	}
	

}
