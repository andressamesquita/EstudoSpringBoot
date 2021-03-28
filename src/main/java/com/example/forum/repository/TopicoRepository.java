package com.example.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
