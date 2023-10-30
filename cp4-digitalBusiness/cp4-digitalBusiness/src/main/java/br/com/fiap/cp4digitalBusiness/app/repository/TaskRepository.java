package br.com.fiap.cp4digitalBusiness.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.cp4digitalBusiness.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
