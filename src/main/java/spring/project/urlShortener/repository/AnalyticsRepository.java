package spring.project.urlShortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.project.urlShortener.models.entities.Visit;

public interface AnalyticsRepository extends JpaRepository<Visit, Long> {
}
