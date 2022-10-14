package Lesson3Examples.business.concretes;

import Lesson3Examples.core.ILogger;
import Lesson3Examples.dataAccess.abstracts.ICategoryRepository;
import Lesson3Examples.entities.Category;

public class CategoryManager {
    private ICategoryRepository iCategoryRepository;
    private ILogger[] iLoggers;

    public CategoryManager(ICategoryRepository iCategoryRepository, ILogger[] iLoggers) {
        this.iCategoryRepository = iCategoryRepository;
        this.iLoggers = iLoggers;
    }

    public void add(Category category) throws Exception {
        Category[] categories = {
                new Category(1, "Backend Category"),
                new Category(2, "Frontend Category")
        };

        for(Category cat :categories){
            if(cat.getName()== category.getName()){
                throw new Exception("Category name tekrar edemez");
            }

        }
        iCategoryRepository.add(category);
        for (ILogger iLogger:iLoggers){
            iLogger.log(category.getName());
        }

    }
}
