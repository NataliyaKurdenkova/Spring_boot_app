//package ru.project.spring_boot_app.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//import ru.project.spring_boot_app.model.User;
//
////import javax.persistence.EntityManager;
////import javax.persistence.PersistenceContext;
////import javax.transaction.Transactional;
////import java.util.List;
////import java.util.Optional;
//
//@Repository
//public class UserDAOImpl extends CrudRepository<User> {
////
////
////    @PersistenceContext
////    private EntityManager entityManager;
////
////    @Override
////    public List<User> findAll() {
////        return entityManager.createQuery("from User", User.class).getResultList();
////    }
////
////    @Override
////    public Optional<User> findById(long id) {
////        return Optional.of(entityManager.find(User.class, id));
////    }
////
////    @Override
////    public void save(User user) {
////        entityManager.persist(user);
////    }
////
////    @Override
////    public void update(User user) {
////        entityManager.merge(user);
////    }
////
////    @Override
////    public void delete(User user) {
////        entityManager.remove(entityManager.find(User.class, user.getId()));
////    }
//}
//
//
