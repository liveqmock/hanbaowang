package com.upbest.mvc.service;

import java.util.Date;
import java.util.List;

import com.upbest.mvc.entity.BCommonWords;
import com.upbest.mvc.vo.CommonWordsVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.upbest.mvc.entity.BWorkInfo;
import com.upbest.mvc.entity.Buser;
import com.upbest.mvc.vo.SelectionVO;
import com.upbest.mvc.vo.TaskVO;
import com.upbest.utils.PageModel;

public interface ITaskService {
    void setWorkHidden(Integer id,String hidden);
    BWorkInfo findById(Integer id);

    Page<Object[]> findWorkList(Buser user, String workName,String uName,String sDate,Pageable requestPage);

    List<Object[]> findWorkInfoList(String workName);

    void saveBWorkInfo(BWorkInfo entity);

    void deleteById(Integer id);

    List<SelectionVO> getStoreList(Integer id);

    List<SelectionVO> getTaskList();

    List<SelectionVO> getUserList(Buser buser);
    
    PageModel<Object> findWorkListByUserId(int userId,Long date, Pageable pageRequest);

	void updateTaskStatus(int taskId, String status);

	List<BWorkInfo> saveTasks(List<BWorkInfo> list);
	
	List<TaskVO> getTaskResult(Integer userId,String month,String year);
	List<CommonWordsVO> getCommonWordsByTaskType(String taskType);
      Page<Object[]> findCommonWordsList(String taskTypeId, Pageable pageable);
	CommonWordsVO  getCommonWordsById(Integer id);
    BCommonWords saveCommonWords(CommonWordsVO vo);
    void deleteCommonWordsById(Integer id);
	boolean isExistSameTask(Integer userId,Integer workTypeId,Date beginTime);
}

