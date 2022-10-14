package Lesson3Examples.dataAccess.concretes;

import Lesson3Examples.dataAccess.abstracts.ICategoryRepository;
import Lesson3Examples.entities.Category;

public class HibernateCategoryRepository implements ICategoryRepository {
    @Override
    public void add(Category category) {
        System.out.println("Category Hibernate ile veritabanına eklendi.");
    }
}
