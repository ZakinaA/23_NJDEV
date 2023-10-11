package bts.sio.api.repository;

import bts.sio.api.model.Epreuve_Athlete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Epreuve_AthleteRepository extends CrudRepository<Epreuve_Athlete, Long> {

    List<Epreuve_Athlete> findByEpreuve_Id(final Long id);

}
