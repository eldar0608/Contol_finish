package kg.dnr.currencydatabaseserver.repo;

import kg.dnr.currencydatabaseserver.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {
    List<Rate> findByCreatedDate(String localDate);
    void deleteByCreatedDate(String date);
    Optional<Rate> findById(Long id);
    String findByCode(String code);
}
