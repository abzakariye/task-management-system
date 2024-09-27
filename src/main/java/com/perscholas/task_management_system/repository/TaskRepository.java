package com.perscholas.task_management_system.repository;

import com.perscholas.task_management_system.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
