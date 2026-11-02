package ma.ikram.tp4.dao;

import ma.ikram.tp4.entities.Article;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArticleDaoTest {

    private IArticleDao articleDao;

    @BeforeEach
    void setUp() {
        articleDao = new ArticleDaoImpl();
    }

    @Test
    @DisplayName("Tester persistance et lecture article")
    void testSaveAndFind() {
        Article art = new Article("TEST-99", "Module LoRa", 120.0, 15);
        articleDao.save(art);

        assertNotNull(art.getId());
        Article found = articleDao.findById(art.getId());
        assertNotNull(found);
        assertEquals("TEST-99", found.getReference());
    }
}
