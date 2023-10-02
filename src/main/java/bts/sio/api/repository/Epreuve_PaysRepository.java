package bts.sio.api.repository;

import bts.sio.api.model.Epreuve_Pays;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Epreuve_PaysRepository extends CrudRepository<Epreuve_Pays, Long> {
}
