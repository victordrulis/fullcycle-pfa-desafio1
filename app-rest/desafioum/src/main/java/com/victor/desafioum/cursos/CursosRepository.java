package com.victor.desafioum.cursos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cursos", path = "cursos")
public interface CursosRepository extends PagingAndSortingRepository<Curso, Long> {

    List<Curso> findByNome(@Param("nome") String nome);
}
