package com.example.webapp.service;

import java.util.List;

import com.example.webapp.entity.ToDo;

/*ToDoサービス*/
public interface ToDoService {
/*全「すること」を検索*/
	List<ToDo> findAllToDo();
	
/*指定されたIDの「すること」を検索する*/
	ToDo findByIdToDo(Integer id);
	
/*「すること」を新規登録する*/
	void insertToDo(ToDo toDo);

/*「すること」を更新する*/
	void updateToDo(ToDo toDo);

/*指定されたIDの「すること」を削除*/
	void deleteToDo(Integer id);
}
