package foro.hub.forohub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findByStatusTrue(Pageable paginacion);

    @Query("""
            SELECT t.status
            FROM Topico t
            WHERE t.id=:idTopico
            """)
    Boolean findStatusById(Long idTopico);
}
