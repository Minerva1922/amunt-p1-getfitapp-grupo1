package repositories

import com.gitfit.backend.domain.Subscribers
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SubscriberRepository: JpaRepository<Subscribers, Long>