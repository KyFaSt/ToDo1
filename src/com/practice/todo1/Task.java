package com.practice.todo1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class Task {
	private String taskName;
	private int status;
	private int id;
	
	public Task()
	{
		this.taskName=null;
		this.status=0;
	}
	public Task(String taskName, int status){
		super();
		this.taskName = taskName;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void addTask(Task task) {
		SQLiteDatabase db = this.getWriteableDatabase();
		
		ContentValues values = new ContentValues();
		values.put(KEY_TASKNAME, task.getTaskName());
		values.put(KEY_STATUS, task.getStatus());
		
		db.insert(TABLE_TASKS, null, values);
		db.close();
	}
}
