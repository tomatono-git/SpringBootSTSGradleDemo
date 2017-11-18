package com.example.demo.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DemoJson {

	public String text;
	public Integer number;
	public Date date;
	@JsonIgnore
	public String ignoreField;

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DemoJson [text=");
		builder.append(text);
		builder.append(", number=");
		builder.append(number);
		builder.append(", date=");
		builder.append(date);
		builder.append(", ignoreField=");
		builder.append(ignoreField);
		builder.append("]");
		return builder.toString();
	}



//	/**
//	 * @return text
//	 */
//	public String getText() {
//		return text;
//	}
//	/**
//	 * @param text セットする text
//	 */
//	public void setText(String text) {
//		this.text = text;
//	}
//	/**
//	 * @return number
//	 */
//	public Integer getNumber() {
//		return number;
//	}
//	/**
//	 * @param number セットする number
//	 */
//	public void setNumber(Integer number) {
//		this.number = number;
//	}
//	/**
//	 * @return date
//	 */
//	public Date getDate() {
//		return date;
//	}
//	/**
//	 * @param date セットする date
//	 */
//	public void setDate(Date date) {
//		this.date = date;
//	}

}
