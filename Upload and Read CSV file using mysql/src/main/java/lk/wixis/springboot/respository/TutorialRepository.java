package lk.wixis.springboot.respository;
//is an interface that extends JpaRepository for persisting data.

import lk.wixis.springboot.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TutorialRepository extends JpaRepository <Tutorial ,String>{
}
