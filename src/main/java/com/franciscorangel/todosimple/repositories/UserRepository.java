package com.franciscorangel.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franciscorangel.todosimple.models.User;

/*Todo Repository é interface e não classe, preste atenção ao criar o repository  pois cria automatico classe!
 * NO proprio JpaRepository você já tem os metodos de buscar, find, post e etc
*/
@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    
}
