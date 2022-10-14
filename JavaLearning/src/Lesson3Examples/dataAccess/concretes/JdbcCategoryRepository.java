package Lesson3Examples.dataAccess.concretes;

import Lesson3Examples.dataAccess.abstracts.ICategoryRepository;
import Lesson3Examples.entities.Category;


public class JdbcCategoryRepository implements ICategoryRepository {
    @Override
    public void add(Category category) {
        System.out.println("Category JDBC ile veritabanına eklendi.");
    }
}
