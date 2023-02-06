package com.example.demo.socket.VO;

import java.util.Date;

public class Room {
	// room pk ai
	int roomNumber;
	// room name 임시
	String roomName;
	// chatting pk ai
	int chatNo;
	// cahtting date default now()
	Date chatDate;
	// 보내는 사람 no
	int senderNo;
	// 받는 사람 no
	int receiverNo;
	
	public int getChatNo() {
		return chatNo;
	}
	public void setChatNo(int chatNo) {
		this.chatNo = chatNo;
	}
	public Date getChatDate() {
		return chatDate;
	}
	public void setChatDate(Date chatDate) {
		this.chatDate = chatDate;
	}
	public int getSenderNo() {
		return senderNo;
	}
	public void setSenderNo(int senderNo) {
		this.senderNo = senderNo;
	}
	public int getReceiverNo() {
		return receiverNo;
	}
	public void setReceiverNo(int receiverNo) {
		this.receiverNo = receiverNo;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomName=" + roomName + ", chatNo=" + chatNo + ", chatDate="
				+ chatDate + ", senderNo=" + senderNo + ", receiverNo=" + receiverNo + "]";
	}
	
	
}